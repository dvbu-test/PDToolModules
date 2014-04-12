//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.12 at 01:41:02 PM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Parameter settings for comparing regression execution result files.
 * 			
 * 
 * <p>Java class for RegressionCompareFilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionCompareFilesType">
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
 *         &lt;element name="baseDir1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseDir2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compareQueries">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="compareProcedures">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="compareWS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="useAllDatasources">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datasources" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionDatasourcesType" minOccurs="0"/>
 *         &lt;element name="resources" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionResourcesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionCompareFilesType", propOrder = {
    "logFilePath",
    "logDelimiter",
    "logAppend",
    "baseDir1",
    "baseDir2",
    "compareQueries",
    "compareProcedures",
    "compareWS",
    "useAllDatasources",
    "datasources",
    "resources"
})
public class RegressionCompareFilesType {

    @XmlElement(required = true)
    protected String logFilePath;
    protected String logDelimiter;
    @XmlElement(required = true)
    protected String logAppend;
    @XmlElement(required = true)
    protected String baseDir1;
    @XmlElement(required = true)
    protected String baseDir2;
    @XmlElement(required = true)
    protected String compareQueries;
    @XmlElement(required = true)
    protected String compareProcedures;
    @XmlElement(required = true)
    protected String compareWS;
    @XmlElement(required = true)
    protected String useAllDatasources;
    protected RegressionDatasourcesType datasources;
    protected RegressionResourcesType resources;

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
     * Gets the value of the baseDir1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDir1() {
        return baseDir1;
    }

    /**
     * Sets the value of the baseDir1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDir1(String value) {
        this.baseDir1 = value;
    }

    /**
     * Gets the value of the baseDir2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDir2() {
        return baseDir2;
    }

    /**
     * Sets the value of the baseDir2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDir2(String value) {
        this.baseDir2 = value;
    }

    /**
     * Gets the value of the compareQueries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareQueries() {
        return compareQueries;
    }

    /**
     * Sets the value of the compareQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareQueries(String value) {
        this.compareQueries = value;
    }

    /**
     * Gets the value of the compareProcedures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareProcedures() {
        return compareProcedures;
    }

    /**
     * Sets the value of the compareProcedures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareProcedures(String value) {
        this.compareProcedures = value;
    }

    /**
     * Gets the value of the compareWS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareWS() {
        return compareWS;
    }

    /**
     * Sets the value of the compareWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareWS(String value) {
        this.compareWS = value;
    }

    /**
     * Gets the value of the useAllDatasources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAllDatasources() {
        return useAllDatasources;
    }

    /**
     * Sets the value of the useAllDatasources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAllDatasources(String value) {
        this.useAllDatasources = value;
    }

    /**
     * Gets the value of the datasources property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionDatasourcesType }
     *     
     */
    public RegressionDatasourcesType getDatasources() {
        return datasources;
    }

    /**
     * Sets the value of the datasources property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionDatasourcesType }
     *     
     */
    public void setDatasources(RegressionDatasourcesType value) {
        this.datasources = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionResourcesType }
     *     
     */
    public RegressionResourcesType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionResourcesType }
     *     
     */
    public void setResources(RegressionResourcesType value) {
        this.resources = value;
    }

}
