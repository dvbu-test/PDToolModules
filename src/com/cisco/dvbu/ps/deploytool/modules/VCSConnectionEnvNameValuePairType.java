//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.16 at 12:57:37 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				VCS Connection Enviornment Variables Name/Value Pair Type: Each entry is a NAME/VALUE pair specific environment variable entry for the particular connection.
 * # Example...
 * # The perforce environment must be set with the default username and password.
 * # However, the user and password are picked up from the environment using variables.  To designate a system
 * # environment variable, Use a single dollar sign '$' in front of the variable name.  This will get resolved upon execution.
 * # example: set P4USER=$VCS_USERNAME
 * # example: set P4PASSWD=$VCS_PASSWORD
 * # [Default-do not change] - Use substitution variables to identify user and password.  
 * #                           These variables get replaced at runtime with values passed in.
 * P4USER=$VCS_USERNAME
 * P4PASSWD=$VCS_PASSWORD
 * 			
 * 
 * <p>Java class for VCSConnectionEnvNameValuePairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VCSConnectionEnvNameValuePairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="envName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="envValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCSConnectionEnvNameValuePairType", propOrder = {
    "envName",
    "envValue"
})
public class VCSConnectionEnvNameValuePairType {

    @XmlElement(required = true)
    protected String envName;
    @XmlElement(required = true)
    protected String envValue;

    /**
     * Gets the value of the envName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvName() {
        return envName;
    }

    /**
     * Sets the value of the envName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvName(String value) {
        this.envName = value;
    }

    /**
     * Gets the value of the envValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvValue() {
        return envValue;
    }

    /**
     * Sets the value of the envValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvValue(String value) {
        this.envValue = value;
    }

}
