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
 * 				Timer Event Type: Provides all timer event condition attributes.
 * 			
 * 
 * <p>Java class for TriggerConditionTimerEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerConditionTimerEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerConditionTimerEventType", propOrder = {
    "scheduleId"
})
public class TriggerConditionTimerEventType {

    @XmlElement(required = true)
    protected String scheduleId;

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

}
