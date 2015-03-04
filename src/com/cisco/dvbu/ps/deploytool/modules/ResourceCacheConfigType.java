//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.04 at 04:05:35 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Cache Config Type: Provides the ability to create a resource cache configuration (configured=true), enable the cache (enabled=true), define the storage, refresh policy, expiration and clear rule.
 * 			
 * 
 * <p>Java class for ResourceCacheConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceCacheConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="storage" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceCacheStorageType" minOccurs="0"/>
 *         &lt;element name="refresh" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceCacheRefreshType" minOccurs="0"/>
 *         &lt;element name="expirationPeriod" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceCacheCalendarPeriodType" minOccurs="0"/>
 *         &lt;element name="clearRule" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NONE"/>
 *               &lt;enumeration value="ON_LOAD"/>
 *               &lt;enumeration value="ON_FAILURE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceCacheConfigType", propOrder = {
    "configured",
    "enabled",
    "storage",
    "refresh",
    "expirationPeriod",
    "clearRule"
})
public class ResourceCacheConfigType {

    protected Boolean configured;
    protected Boolean enabled;
    protected ResourceCacheStorageType storage;
    protected ResourceCacheRefreshType refresh;
    protected ResourceCacheCalendarPeriodType expirationPeriod;
    protected String clearRule;

    /**
     * Gets the value of the configured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfigured() {
        return configured;
    }

    /**
     * Sets the value of the configured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigured(Boolean value) {
        this.configured = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCacheStorageType }
     *     
     */
    public ResourceCacheStorageType getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCacheStorageType }
     *     
     */
    public void setStorage(ResourceCacheStorageType value) {
        this.storage = value;
    }

    /**
     * Gets the value of the refresh property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCacheRefreshType }
     *     
     */
    public ResourceCacheRefreshType getRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCacheRefreshType }
     *     
     */
    public void setRefresh(ResourceCacheRefreshType value) {
        this.refresh = value;
    }

    /**
     * Gets the value of the expirationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCacheCalendarPeriodType }
     *     
     */
    public ResourceCacheCalendarPeriodType getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Sets the value of the expirationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCacheCalendarPeriodType }
     *     
     */
    public void setExpirationPeriod(ResourceCacheCalendarPeriodType value) {
        this.expirationPeriod = value;
    }

    /**
     * Gets the value of the clearRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearRule() {
        return clearRule;
    }

    /**
     * Sets the value of the clearRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearRule(String value) {
        this.clearRule = value;
    }

}
