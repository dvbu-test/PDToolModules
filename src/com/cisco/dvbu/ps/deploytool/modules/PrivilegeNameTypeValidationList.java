//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 04:26:28 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for PrivilegeNameTypeValidationList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivilegeNameTypeValidationList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum PrivilegeNameTypeValidationList {

    USER,
    GROUP;

    public String value() {
        return name();
    }

    public static PrivilegeNameTypeValidationList fromValue(String v) {
        return valueOf(v);
    }

}
