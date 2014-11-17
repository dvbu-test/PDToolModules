//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.16 at 12:57:37 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ResourceTypeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COLUMN"/>
 *     &lt;enumeration value="CONTAINER"/>
 *     &lt;enumeration value="DATA_SOURCE"/>
 *     &lt;enumeration value="DEFINITION_SET"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="PROCEDURE"/>
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="TREE"/>
 *     &lt;enumeration value="TRIGGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ResourceTypeSimpleType {

    COLUMN,
    CONTAINER,
    DATA_SOURCE,
    DEFINITION_SET,
    LINK,
    PROCEDURE,
    TABLE,
    TREE,
    TRIGGER;

    public String value() {
        return name();
    }

    public static ResourceTypeSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
