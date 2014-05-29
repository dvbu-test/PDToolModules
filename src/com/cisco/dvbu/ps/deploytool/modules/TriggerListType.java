//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 08:52:41 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Trigger List Type: Contains an unbounded list of Triggers.
 * 			
 * 
 * <p>Java class for TriggerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trigger" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerListType", propOrder = {
    "trigger"
})
public class TriggerListType {

    protected List<TriggerType> trigger;

    /**
     * Gets the value of the trigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TriggerType }
     * 
     * 
     */
    public List<TriggerType> getTrigger() {
        if (trigger == null) {
            trigger = new ArrayList<TriggerType>();
        }
        return this.trigger;
    }

}
