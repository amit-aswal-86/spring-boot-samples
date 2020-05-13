/*
 * This file is generated by jOOQ.
 */
package com.jooq.example.domain.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeePrivileges implements Serializable {

    private static final long serialVersionUID = 947562239;

    private Integer employeeId;
    private Integer privilegeId;

    public EmployeePrivileges() {}

    public EmployeePrivileges(EmployeePrivileges value) {
        this.employeeId = value.employeeId;
        this.privilegeId = value.privilegeId;
    }

    public EmployeePrivileges(
        Integer employeeId,
        Integer privilegeId
    ) {
        this.employeeId = employeeId;
        this.privilegeId = privilegeId;
    }

    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getPrivilegeId() {
        return this.privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EmployeePrivileges (");

        sb.append(employeeId);
        sb.append(", ").append(privilegeId);

        sb.append(")");
        return sb.toString();
    }
}
