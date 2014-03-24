//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 11:43:39 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Parameter settings for comparing regression execution log files.
 * 			
 * 
 * <p>Java class for RegressionCompareLogsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionCompareLogsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logDelimiter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="COMMA"/>
 *               &lt;enumeration value=","/>
 *               &lt;enumeration value="PIPE"/>
 *               &lt;enumeration value="|"/>
 *               &lt;enumeration value="TAB"/>
 *               &lt;enumeration value="TILDE"/>
 *               &lt;enumeration value="~"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="logAppend">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="logFilePath1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logFilePath2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="logDelimiter1" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="COMMA"/>
 *                 &lt;enumeration value=","/>
 *                 &lt;enumeration value="PIPE"/>
 *                 &lt;enumeration value="|"/>
 *                 &lt;enumeration value="TAB"/>
 *                 &lt;enumeration value="TILDE"/>
 *                 &lt;enumeration value="~"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="delimiter1" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="COMMA"/>
 *                 &lt;enumeration value=","/>
 *                 &lt;enumeration value="PIPE"/>
 *                 &lt;enumeration value="|"/>
 *                 &lt;enumeration value="TAB"/>
 *                 &lt;enumeration value="TILDE"/>
 *                 &lt;enumeration value="~"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="logDelimiter2" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="COMMA"/>
 *                 &lt;enumeration value=","/>
 *                 &lt;enumeration value="PIPE"/>
 *                 &lt;enumeration value="|"/>
 *                 &lt;enumeration value="TAB"/>
 *                 &lt;enumeration value="TILDE"/>
 *                 &lt;enumeration value="~"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="delimiter2" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="COMMA"/>
 *                 &lt;enumeration value=","/>
 *                 &lt;enumeration value="PIPE"/>
 *                 &lt;enumeration value="|"/>
 *                 &lt;enumeration value="TAB"/>
 *                 &lt;enumeration value="TILDE"/>
 *                 &lt;enumeration value="~"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="durationDelta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionCompareLogsType", propOrder = {
    "logFilePath",
    "logDelimiter",
    "logAppend",
    "logFilePath1",
    "logFilePath2",
    "logDelimiter1",
    "delimiter1",
    "logDelimiter2",
    "delimiter2",
    "durationDelta"
})
public class RegressionCompareLogsType {

    @XmlElement(required = true)
    protected String logFilePath;
    protected String logDelimiter;
    @XmlElement(required = true)
    protected String logAppend;
    @XmlElement(required = true)
    protected String logFilePath1;
    @XmlElement(required = true)
    protected String logFilePath2;
    protected String logDelimiter1;
    protected String delimiter1;
    protected String logDelimiter2;
    protected String delimiter2;
    @XmlElement(required = true)
    protected String durationDelta;

    /**
     * Gets the value of the logFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFilePath() {
        return logFilePath;
    }

    /**
     * Sets the value of the logFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFilePath(String value) {
        this.logFilePath = value;
    }

    /**
     * Gets the value of the logDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDelimiter() {
        return logDelimiter;
    }

    /**
     * Sets the value of the logDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDelimiter(String value) {
        this.logDelimiter = value;
    }

    /**
     * Gets the value of the logAppend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogAppend() {
        return logAppend;
    }

    /**
     * Sets the value of the logAppend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogAppend(String value) {
        this.logAppend = value;
    }

    /**
     * Gets the value of the logFilePath1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFilePath1() {
        return logFilePath1;
    }

    /**
     * Sets the value of the logFilePath1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFilePath1(String value) {
        this.logFilePath1 = value;
    }

    /**
     * Gets the value of the logFilePath2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFilePath2() {
        return logFilePath2;
    }

    /**
     * Sets the value of the logFilePath2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFilePath2(String value) {
        this.logFilePath2 = value;
    }

    /**
     * Gets the value of the logDelimiter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDelimiter1() {
        return logDelimiter1;
    }

    /**
     * Sets the value of the logDelimiter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDelimiter1(String value) {
        this.logDelimiter1 = value;
    }

    /**
     * Gets the value of the delimiter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter1() {
        return delimiter1;
    }

    /**
     * Sets the value of the delimiter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter1(String value) {
        this.delimiter1 = value;
    }

    /**
     * Gets the value of the logDelimiter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDelimiter2() {
        return logDelimiter2;
    }

    /**
     * Sets the value of the logDelimiter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDelimiter2(String value) {
        this.logDelimiter2 = value;
    }

    /**
     * Gets the value of the delimiter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter2() {
        return delimiter2;
    }

    /**
     * Sets the value of the delimiter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter2(String value) {
        this.delimiter2 = value;
    }

    /**
     * Gets the value of the durationDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDelta() {
        return durationDelta;
    }

    /**
     * Sets the value of the durationDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDelta(String value) {
        this.durationDelta = value;
    }

}
