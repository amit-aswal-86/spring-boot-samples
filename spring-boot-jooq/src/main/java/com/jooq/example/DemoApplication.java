package com.jooq.example;

import com.jooq.example.common.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	private final Environment env;

	public DemoApplication(Environment env) {
		this.env = env;
	}

	public static void main(String[] args) {
		boolean profileActivated = false;
		ConfigurableEnvironment environment = new StandardEnvironment();
		for (String profile : environment.getActiveProfiles()) {
			if (profile.equalsIgnoreCase(AppConstants.SPRING_PROFILE_PRODUCTION)
					|| profile.equalsIgnoreCase(AppConstants.SPRING_PROFILE_DEVELOPMENT)) {
				profileActivated = true;
				break;
			}
		}

		SpringApplication app = new SpringApplication(DemoApplication.class);
		// if no profile active set development
		if (!profileActivated) {
			app.setAdditionalProfiles(AppConstants.SPRING_PROFILE_DEVELOPMENT);
		}
		Environment env = app.run(args).getEnvironment();
		logApplicationStartup(env);
	}

	private static void logApplicationStartup(Environment env) {
		String protocol = "http";
		if (env.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}
		String serverPort = env.getProperty("server.port");
		String contextPath = env.getProperty("server.servlet.context-path");
		if (StringUtils.isEmpty(contextPath)) {
			contextPath = "/";
		}
		String hostAddress = "localhost";
		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			log.warn("The host name could not be determined, using `localhost` as fallback");
		}
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\t\t {}://localhost:{}{}\n\t" +
						"External: \t\t {}://{}:{}{}\n\t" +
						"Profile(s): \t {}" +
						"\n\tDB Conn Details: {}, {}" +
						"\n----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				protocol,
				serverPort,
				contextPath,
				protocol,
				hostAddress,
				serverPort,
				contextPath,
				env.getActiveProfiles(),
				env.getProperty("spring.datasource.url"),
				env.getProperty("spring.datasource.username")
		);
	}

}
