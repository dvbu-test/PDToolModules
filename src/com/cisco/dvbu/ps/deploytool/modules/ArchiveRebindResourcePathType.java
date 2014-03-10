//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:16:36 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Resources can be rebound as a group during the import process. Sets a new resource path 
 * 				for a dependency resource. All imported resources will have the rebind performed. 
 * 				In case of conflict between rebinds caused by the -relocate and -rebind flags, the -rebind ones 
 * 				are performed first.
 * 			
 * 
 * <p>Java class for ArchiveRebindResourcePathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveRebindResourcePathType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveRebindResourcePathType", propOrder = {
    "oldPath",
    "newPath"
})
public class ArchiveRebindResourcePathType {

    @XmlElement(required = true)
    protected String oldPath;
    @XmlElement(required = true)
    protected String newPath;

    /**
     * Gets the value of the oldPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPath() {
        return oldPath;
    }

    /**
     * Sets the value of the oldPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPath(String value) {
        this.oldPath = value;
    }

    /**
     * Gets the value of the newPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPath() {
        return newPath;
    }

    /**
     * Sets the value of the newPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPath(String value) {
        this.newPath = value;
    }

}
