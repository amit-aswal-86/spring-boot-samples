package com.zaravya.sample.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.XMLInputFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ctc.wstx.api.WstxInputProperties;
import com.ctc.wstx.stax.WstxInputFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.zaravya.sample.common.AppProperties;

@Component
public class SoapHandler {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AppProperties appProperties;

	public ResponseEntity<?> handleRequest(HttpServletRequest request, String requestBody) throws Throwable {
		XmlMapper xmlMapper = new XmlMapper();
		JsonNode rootNode = xmlMapper.readTree(requestBody);
		// TODO: parse xml jax-ws

		return ResponseEntity.status(HttpStatus.OK).body(requestBody);
	}

	public static void main3(String[] args) throws Throwable {
		String xml = "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + "    <Body>\r\n"
				+ "        <getMultipleOIP xmlns=\"http://oip.mycompany.com/\">\r\n"
				+ "            <OIPRequest xmlns=\"http://oip.mycompany.com/invoiceNumber\">\r\n"
				+ "                <invoiceNumber>41587182</invoiceNumber>\r\n"
				+ "                <partNumber>9ZF2A5-570</partNumber>\r\n" + "            </OIPRequest>\r\n"
				+ "            <OIPRequest xmlns=\"http://oip.mycompany.com/invoiceNumber2\">\r\n"
				+ "                <invoiceNumber>41587183</invoiceNumber>\r\n"
				+ "                <partNumber>9ZF2A5-571</partNumber>\r\n" + "            </OIPRequest>\r\n"
				+ "            <OIPRequest xmlns=\"http://oip.mycompany.com/invoiceNumber3\">\r\n"
				+ "                <invoiceNumber>41587184</invoiceNumber>\r\n"
				+ "                <partNumber>9ZF2A5-800</partNumber>\r\n" + "            </OIPRequest>\r\n"
				+ "        </getMultipleOIP>\r\n" + "    </Body>\r\n" + "</Envelope>".replaceAll("(\r\n|\n)", "");

		XMLInputFactory ifactory = new WstxInputFactory(); // Woodstox XMLInputFactory impl
		ifactory.setProperty(WstxInputProperties.P_MAX_ATTRIBUTE_SIZE, 32000);

		XmlMapper xmlMapper = new XmlMapper(ifactory);
		
		  JsonNode rootNode = xmlMapper.readTree(xml); Iterator<String> fieldNames =
		  rootNode.fieldNames(); while (fieldNames.hasNext()) { String fieldName =
		  fieldNames.next(); JsonNode bodyNode = rootNode.get(fieldName);
		  System.out.println("fieldName ::: " + fieldName + ", Node ::: " + bodyNode);
		  
		  Iterator<String> bodyFields = bodyNode.fieldNames(); while
		  (bodyFields.hasNext()) { fieldName = bodyFields.next(); JsonNode jsonNode1 =
		  bodyNode.get(fieldName); System.out.println("fieldName ::: " + fieldName +
		  ", Node ::: " + jsonNode1);
		  
		  Iterator<String> bodyFields1 = jsonNode1.fieldNames(); while
		  (bodyFields1.hasNext()) { fieldName = bodyFields1.next(); JsonNode jsonNode2
		  = jsonNode1.get(fieldName); System.out.println("fieldName ::: " + fieldName +
		  ", Node ::: " + jsonNode2.get(fieldName)); } } }
		 

		
		  Iterator<Map.Entry<String, JsonNode>> fieldIterator = rootNode.fields();
		  
		  while (fieldIterator.hasNext()) { Map.Entry<String, JsonNode> entry =
		  fieldIterator.next(); String key = entry.getKey(); JsonNode value =
		  entry.getValue();
		  
		  System.out.println("Key ::: " + key + ", Value ::: " + value); }
		 
	}

	/*
	 * public static void main2(String[] args) throws Throwable { String xml =
	 * "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:q0=\"http://service.demo.example.com/\">"
	 * + " <soapenv:Body>" +
	 * "     <q0:sayHello xmlns:q0=\"http://service.demo.example.com/\">" +
	 * "		<name>Amit Aswal The Great</name>\r\n" + "	</q0:sayHello>" +
	 * " </soapenv:Body>" + "</soapenv:Envelope>";
	 * 
	 * SOAPMessage message = MessageFactory.newInstance().createMessage(null, new
	 * ByteArrayInputStream(xml.getBytes()) );
	 * 
	 * SOAPPart soappart = message.getSOAPPart(); SOAPEnvelope incomingEnvelope =
	 * soappart.getEnvelope(); SOAPBody body = incomingEnvelope.getBody();
	 * Iterator<Node> it = body.getChildElements();
	 * 
	 * while (it.hasNext()) { Node node = it.next(); if
	 * (StringUtils.isEmpty(node.getNodeName()) ||
	 * StringUtils.isEmpty(node.getLocalName())) { continue; }
	 * 
	 * System.out.println("LocalName 	>>> " + node.getLocalName());
	 * System.out.println("NodeName  	>>> " + node.getNodeName());
	 * System.out.println("NodeValue 	>>> " + node.getNodeValue());
	 * System.out.println("ChildNodes 	>>> " + node.hasChildNodes());
	 * System.out.println("TextContent 	>>> " + node.getTextContent());
	 * 
	 * System.out.println("");
	 * 
	 * if (node.hasChildNodes()) { NodeList nodeList = node.getChildNodes(); for
	 * (int i=0; i<nodeList.getLength(); i++) { org.w3c.dom.Node childNode =
	 * nodeList.item(i);
	 * 
	 * if (StringUtils.isEmpty(childNode.getNodeName()) ||
	 * StringUtils.isEmpty(childNode.getLocalName())) { continue; }
	 * 
	 * System.out.println("childNode LocalName 	>>> " + childNode.getLocalName());
	 * System.out.println("childNode NodeName  	>>> " + childNode.getNodeName());
	 * System.out.println("childNode NodeValue 	>>> " + childNode.getNodeValue());
	 * System.out.println("childNode ChildNodes 	>>> " +
	 * childNode.hasChildNodes()); System.out.println("childNode TextContent >>> " +
	 * childNode.getTextContent()); System.out.println(""); } } }
	 * 
	 * }
	 */
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String xml = "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + "    <Body>\r\n"
				+ "        <getMultipleOIP xmlns=\"http://oip.mycompany.com/\">\r\n"
				+ "            <OIPRequest xmlns=\"http://oip.mycompany.com/invoiceNumber\">\r\n"
				+ "                <invoiceNumber>41587182</invoiceNumber>\r\n"
				+ "                <partNumber>9ZF2A5-570</partNumber>\r\n" + "            </OIPRequest>\r\n"
				+ "            <OIPRequest xmlns=\"http://oip.mycompany.com/invoiceNumber2\">\r\n"
				+ "                <invoiceNumber>41587183</invoiceNumber>\r\n"
				+ "                <partNumber>9ZF2A5-571</partNumber>\r\n" + "            </OIPRequest>\r\n"
				+ "            <OIPRequest xmlns=\"http://oip.mycompany.com/invoiceNumber3\">\r\n"
				+ "                <invoiceNumber>41587184</invoiceNumber>\r\n"
				+ "                <partNumber>9ZF2A5-800</partNumber>\r\n" + "            </OIPRequest>\r\n"
				+ "        </getMultipleOIP>\r\n" + "    </Body>\r\n" + "</Envelope>"
				
				.replaceAll("(\r\n|\n)", "");

		ObjectWriter w = new ObjectMapper().writerWithDefaultPrettyPrinter();
		Object o;
		
		o = new XmlMapper()
				.readValue(xml, Object.class);		
		System.out.println( w.writeValueAsString(o) );

		XmlMapper xmlMapper = (XmlMapper) new XmlMapper()
				.registerModule(new SimpleModule().addDeserializer(Object.class, new FixedUntypedObjectDeserializer()));
		o = xmlMapper.readValue(xml, Object.class);		
		System.out.println( w.writeValueAsString(o) );

	}

	@SuppressWarnings({ "deprecation", "serial" })
	public static class FixedUntypedObjectDeserializer extends UntypedObjectDeserializer {

		@Override
		@SuppressWarnings({ "unchecked", "rawtypes" })
		protected Object mapObject(JsonParser p, DeserializationContext ctxt) throws IOException {
			String firstKey;

			JsonToken t = p.getCurrentToken();

			if (t == JsonToken.START_OBJECT) {
				firstKey = p.nextFieldName();
			} else if (t == JsonToken.FIELD_NAME) {
				firstKey = p.getCurrentName();
			} else {
				if (t != JsonToken.END_OBJECT) {
					return ctxt.handleUnexpectedToken(handledType(), p);
				}
				firstKey = null;
			}

			// empty map might work; but caller may want to modify... so better
			// just give small modifiable
			LinkedHashMap<String, Object> resultMap = new LinkedHashMap<String, Object>(2);
			if (firstKey == null)
				return resultMap;

			p.nextToken();
			resultMap.put(firstKey, deserialize(p, ctxt));

			// 03-Aug-2016, jpvarandas: handle next objects and create an array
			Set<String> listKeys = new LinkedHashSet<>();

			String nextKey;
			while ((nextKey = p.nextFieldName()) != null) {
				p.nextToken();
				if (resultMap.containsKey(nextKey)) {
					Object listObject = resultMap.get(nextKey);

					if (!(listObject instanceof List)) {
						listObject = new ArrayList<>();
						((List) listObject).add(resultMap.get(nextKey));

						resultMap.put(nextKey, listObject);
					}

					((List) listObject).add(deserialize(p, ctxt));

					listKeys.add(nextKey);

				} else {
					resultMap.put(nextKey, deserialize(p, ctxt));

				}
			}

			return resultMap;

		}

	}
	
}
