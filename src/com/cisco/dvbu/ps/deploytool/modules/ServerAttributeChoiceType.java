//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 11:43:39 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Server Attribute Choice Type: This selection provides a choice between server attributes and server attribute definitions.
 * 			
 * 
 * <p>Java class for ServerAttributeChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerAttributeChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="serverAttribute" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ServerAttributeType" maxOccurs="unbounded"/>
 *         &lt;element name="serverAttributeDef" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ServerAttributeDefType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerAttributeChoiceType", propOrder = {
    "serverAttribute",
    "serverAttributeDef"
})
public class ServerAttributeChoiceType {

    protected List<ServerAttributeType> serverAttribute;
    protected List<ServerAttributeDefType> serverAttributeDef;

    /**
     * Gets the value of the serverAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerAttributeType }
     * 
     * 
     */
    public List<ServerAttributeType> getServerAttribute() {
        if (serverAttribute == null) {
            serverAttribute = new ArrayList<ServerAttributeType>();
        }
        return this.serverAttribute;
    }

    /**
     * Gets the value of the serverAttributeDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverAttributeDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerAttributeDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerAttributeDefType }
     * 
     * 
     */
    public List<ServerAttributeDefType> getServerAttributeDef() {
        if (serverAttributeDef == null) {
            serverAttributeDef = new ArrayList<ServerAttributeDefType>();
        }
        return this.serverAttributeDef;
    }

}
