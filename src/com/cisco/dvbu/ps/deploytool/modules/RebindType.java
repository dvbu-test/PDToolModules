//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 04:26:28 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Rebind Type: The Rebind Type provides a choice between the traditional rebinding or the rebind resources in a folder.
 * 			
 * 
 * <p>Java class for RebindType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebindType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="rebindResource" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RebindResourceType" minOccurs="0"/>
 *         &lt;element name="rebindFolder" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RebindFolderType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebindType", propOrder = {
    "rebindResource",
    "rebindFolder"
})
public class RebindType {

    protected RebindResourceType rebindResource;
    protected RebindFolderType rebindFolder;

    /**
     * Gets the value of the rebindResource property.
     * 
     * @return
     *     possible object is
     *     {@link RebindResourceType }
     *     
     */
    public RebindResourceType getRebindResource() {
        return rebindResource;
    }

    /**
     * Sets the value of the rebindResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebindResourceType }
     *     
     */
    public void setRebindResource(RebindResourceType value) {
        this.rebindResource = value;
    }

    /**
     * Gets the value of the rebindFolder property.
     * 
     * @return
     *     possible object is
     *     {@link RebindFolderType }
     *     
     */
    public RebindFolderType getRebindFolder() {
        return rebindFolder;
    }

    /**
     * Sets the value of the rebindFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RebindFolderType }
     *     
     */
    public void setRebindFolder(RebindFolderType value) {
        this.rebindFolder = value;
    }

}
