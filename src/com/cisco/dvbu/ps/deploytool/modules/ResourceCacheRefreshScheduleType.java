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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Cache Refresh Schedule Type: Defines the type of refresh schedule and related parameters.
 * 			
 * 
 * <p>Java class for ResourceCacheRefreshScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceCacheRefreshScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="refreshPeriod" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceCacheCalendarPeriodType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceCacheRefreshScheduleType", propOrder = {
    "startTime",
    "refreshPeriod"
})
public class ResourceCacheRefreshScheduleType {

    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true)
    protected ResourceCacheCalendarPeriodType refreshPeriod;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the refreshPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCacheCalendarPeriodType }
     *     
     */
    public ResourceCacheCalendarPeriodType getRefreshPeriod() {
        return refreshPeriod;
    }

    /**
     * Sets the value of the refreshPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCacheCalendarPeriodType }
     *     
     */
    public void setRefreshPeriod(ResourceCacheCalendarPeriodType value) {
        this.refreshPeriod = value;
    }

}
