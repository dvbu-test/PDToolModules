//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.04 at 04:05:35 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Regression Test Type: A regression test consists of a configuration for generating a regression test and a configuration for executing (running) a regression test.
 * 			
 * 
 * <p>Java class for RegressionTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionTestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tempDirPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createNewFile">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="newFileParams" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionNewFileParamsType" minOccurs="0"/>
 *         &lt;element name="testRunParams" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionTestRunParamsType" minOccurs="0"/>
 *         &lt;element name="compareFiles" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionCompareFilesType" minOccurs="0"/>
 *         &lt;element name="compareLogs" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionCompareLogsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionTestType", propOrder = {
    "id",
    "inputFilePath",
    "tempDirPath",
    "createNewFile",
    "newFileParams",
    "testRunParams",
    "compareFiles",
    "compareLogs"
})
public class RegressionTestType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String inputFilePath;
    protected String tempDirPath;
    @XmlElement(required = true)
    protected String createNewFile;
    protected RegressionNewFileParamsType newFileParams;
    protected RegressionTestRunParamsType testRunParams;
    protected RegressionCompareFilesType compareFiles;
    protected RegressionCompareLogsType compareLogs;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the inputFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFilePath() {
        return inputFilePath;
    }

    /**
     * Sets the value of the inputFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFilePath(String value) {
        this.inputFilePath = value;
    }

    /**
     * Gets the value of the tempDirPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempDirPath() {
        return tempDirPath;
    }

    /**
     * Sets the value of the tempDirPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempDirPath(String value) {
        this.tempDirPath = value;
    }

    /**
     * Gets the value of the createNewFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateNewFile() {
        return createNewFile;
    }

    /**
     * Sets the value of the createNewFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateNewFile(String value) {
        this.createNewFile = value;
    }

    /**
     * Gets the value of the newFileParams property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionNewFileParamsType }
     *     
     */
    public RegressionNewFileParamsType getNewFileParams() {
        return newFileParams;
    }

    /**
     * Sets the value of the newFileParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionNewFileParamsType }
     *     
     */
    public void setNewFileParams(RegressionNewFileParamsType value) {
        this.newFileParams = value;
    }

    /**
     * Gets the value of the testRunParams property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionTestRunParamsType }
     *     
     */
    public RegressionTestRunParamsType getTestRunParams() {
        return testRunParams;
    }

    /**
     * Sets the value of the testRunParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionTestRunParamsType }
     *     
     */
    public void setTestRunParams(RegressionTestRunParamsType value) {
        this.testRunParams = value;
    }

    /**
     * Gets the value of the compareFiles property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionCompareFilesType }
     *     
     */
    public RegressionCompareFilesType getCompareFiles() {
        return compareFiles;
    }

    /**
     * Sets the value of the compareFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionCompareFilesType }
     *     
     */
    public void setCompareFiles(RegressionCompareFilesType value) {
        this.compareFiles = value;
    }

    /**
     * Gets the value of the compareLogs property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionCompareLogsType }
     *     
     */
    public RegressionCompareLogsType getCompareLogs() {
        return compareLogs;
    }

    /**
     * Sets the value of the compareLogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionCompareLogsType }
     *     
     */
    public void setCompareLogs(RegressionCompareLogsType value) {
        this.compareLogs = value;
    }

}
