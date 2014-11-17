//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.16 at 12:57:37 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for AccessRightsValidationList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessRightsValidationList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ACCESS_TOOLS"/>
 *     &lt;enumeration value="MODIFY_ALL_CONFIG"/>
 *     &lt;enumeration value="MODIFY_ALL_RESOURCES"/>
 *     &lt;enumeration value="MODIFY_ALL_STATUS"/>
 *     &lt;enumeration value="MODIFY_ALL_USERS"/>
 *     &lt;enumeration value="READ_ALL_CONFIG"/>
 *     &lt;enumeration value="READ_ALL_RESOURCES"/>
 *     &lt;enumeration value="READ_ALL_STATUS"/>
 *     &lt;enumeration value="READ_ALL_USERS"/>
 *     &lt;enumeration value="UNLOCK_RESOURCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AccessRightsValidationList {

    NONE,
    ACCESS_TOOLS,
    MODIFY_ALL_CONFIG,
    MODIFY_ALL_RESOURCES,
    MODIFY_ALL_STATUS,
    MODIFY_ALL_USERS,
    READ_ALL_CONFIG,
    READ_ALL_RESOURCES,
    READ_ALL_STATUS,
    READ_ALL_USERS,
    UNLOCK_RESOURCE;

    public String value() {
        return name();
    }

    public static AccessRightsValidationList fromValue(String v) {
        return valueOf(v);
    }

}
