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
 * 				Resource Cache Type: Provides the ability to configure cache on procedures and views.
 * 			
 * 
 * <p>Java class for ResourceCacheType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceCacheType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceType" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceTypeSimpleType"/>
 *         &lt;element name="cacheConfig" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceCacheConfigType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceCacheType", propOrder = {
    "id",
    "resourcePath",
    "resourceType",
    "cacheConfig"
})
public class ResourceCacheType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String resourcePath;
    @XmlElement(required = true)
    protected ResourceTypeSimpleType resourceType;
    @XmlElement(required = true)
    protected ResourceCacheConfigType cacheConfig;

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
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public ResourceTypeSimpleType getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTypeSimpleType }
     *     
     */
    public void setResourceType(ResourceTypeSimpleType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the cacheConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCacheConfigType }
     *     
     */
    public ResourceCacheConfigType getCacheConfig() {
        return cacheConfig;
    }

    /**
     * Sets the value of the cacheConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCacheConfigType }
     *     
     */
    public void setCacheConfig(ResourceCacheConfigType value) {
        this.cacheConfig = value;
    }

}
