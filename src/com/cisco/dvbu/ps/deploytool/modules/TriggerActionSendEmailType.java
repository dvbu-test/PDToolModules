//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 08:52:41 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Send Email Type: Provides all send email action attributes.
 * 				
 * 
 * <p>Java class for TriggerActionSendEmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerActionSendEmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameterValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailBCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skipIfNoResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerActionSendEmailType", propOrder = {
    "resourcePath",
    "parameterValues",
    "emailTo",
    "emailCC",
    "emailBCC",
    "emailReplyTo",
    "emailSubject",
    "emailBody",
    "skipIfNoResults",
    "includeSummary"
})
public class TriggerActionSendEmailType {

    @XmlElement(required = true)
    protected String resourcePath;
    protected String parameterValues;
    @XmlElement(required = true)
    protected String emailTo;
    protected String emailCC;
    protected String emailBCC;
    protected String emailReplyTo;
    protected String emailSubject;
    protected String emailBody;
    protected boolean skipIfNoResults;
    protected boolean includeSummary;

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
     * Gets the value of the parameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterValues(String value) {
        this.parameterValues = value;
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
     */
    public boolean isSkipIfNoResults() {
        return skipIfNoResults;
    }

    /**
     * Sets the value of the skipIfNoResults property.
     * 
     */
    public void setSkipIfNoResults(boolean value) {
        this.skipIfNoResults = value;
    }

    /**
     * Gets the value of the includeSummary property.
     * 
     */
    public boolean isIncludeSummary() {
        return includeSummary;
    }

    /**
     * Sets the value of the includeSummary property.
     * 
     */
    public void setIncludeSummary(boolean value) {
        this.includeSummary = value;
    }

}
