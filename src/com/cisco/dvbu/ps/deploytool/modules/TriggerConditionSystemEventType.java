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
 * 					System Event Type: Provides all system event condition attributes.
 * 				
 * 
 * <p>Java class for TriggerConditionSystemEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerConditionSystemEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventName" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerConditionSystemEventValidationList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerConditionSystemEventType", propOrder = {
    "eventName"
})
public class TriggerConditionSystemEventType {

    @XmlElement(required = true)
    protected TriggerConditionSystemEventValidationList eventName;

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionSystemEventValidationList }
     *     
     */
    public TriggerConditionSystemEventValidationList getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionSystemEventValidationList }
     *     
     */
    public void setEventName(TriggerConditionSystemEventValidationList value) {
        this.eventName = value;
    }

}
