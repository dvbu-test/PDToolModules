//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 04:26:28 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Reintrospect Data Source Type: Provides all reintrospect data source action attributes.
 * 				
 * 
 * <p>Java class for TriggerActionReintrospectDatasourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerActionReintrospectDatasourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailBCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skipIfNoResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noCommit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerActionReintrospectDatasourceType", propOrder = {
    "resourcePath",
    "emailTo",
    "emailCC",
    "emailBCC",
    "emailReplyTo",
    "emailSubject",
    "emailBody",
    "skipIfNoResults",
    "noCommit"
})
public class TriggerActionReintrospectDatasourceType {

    @XmlElement(required = true)
    protected String resourcePath;
    @XmlElement(required = true)
    protected String emailTo;
    protected String emailCC;
    protected String emailBCC;
    protected String emailReplyTo;
    protected String emailSubject;
    protected String emailBody;
    protected Boolean skipIfNoResults;
    protected boolean noCommit;

    /**
     * Gets the value of the resourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Sets the value of the resourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePath(String value) {
        this.resourcePath = value;
    }

    /**
     * Gets the value of the emailTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTo() {
        return emailTo;
    }

    /**
     * Sets the value of the emailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTo(String value) {
        this.emailTo = value;
    }

    /**
     * Gets the value of the emailCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailCC() {
        return emailCC;
    }

    /**
     * Sets the value of the emailCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailCC(String value) {
        this.emailCC = value;
    }

    /**
     * Gets the value of the emailBCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBCC() {
        return emailBCC;
    }

    /**
     * Sets the value of the emailBCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBCC(String value) {
        this.emailBCC = value;
    }

    /**
     * Gets the value of the emailReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReplyTo() {
        return emailReplyTo;
    }

    /**
     * Sets the value of the emailReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReplyTo(String value) {
        this.emailReplyTo = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the emailBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBody() {
        return emailBody;
    }

    /**
     * Sets the value of the emailBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBody(String value) {
        this.emailBody = value;
    }

    /**
     * Gets the value of the skipIfNoResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipIfNoResults() {
        return skipIfNoResults;
    }

    /**
     * Sets the value of the skipIfNoResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipIfNoResults(Boolean value) {
        this.skipIfNoResults = value;
    }

    /**
     * Gets the value of the noCommit property.
     * 
     */
    public boolean isNoCommit() {
        return noCommit;
    }

    /**
     * Sets the value of the noCommit property.
     * 
     */
    public void setNoCommit(boolean value) {
        this.noCommit = value;
    }

}
