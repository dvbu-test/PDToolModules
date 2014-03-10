//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:16:36 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Introspect Data Source Plan Entry Type: Provides the detailed entry for introspection.
 * 		
 * 
 * <p>Java class for IntrospectDataSourcePlanEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrospectDataSourcePlanEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceId" type="{http://www.cisco.dvbu.com/ps/deploytool/modules}IntrospectDataSourcePlanEntryResourceIdType"/>
 *         &lt;element name="action">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ADD_OR_UPDATE"/>
 *               &lt;enumeration value="ADD_OR_UPDATE_RECURSIVELY"/>
 *               &lt;enumeration value="REMOVE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="genericAttribute" type="{http://www.cisco.dvbu.com/ps/deploytool/modules}AttributeDefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrospectDataSourcePlanEntryType", propOrder = {
    "resourceId",
    "action",
    "genericAttribute"
})
public class IntrospectDataSourcePlanEntryType {

    @XmlElement(required = true)
    protected IntrospectDataSourcePlanEntryResourceIdType resourceId;
    @XmlElement(required = true)
    protected String action;
    protected List<AttributeDefType> genericAttribute;

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link IntrospectDataSourcePlanEntryResourceIdType }
     *     
     */
    public IntrospectDataSourcePlanEntryResourceIdType getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntrospectDataSourcePlanEntryResourceIdType }
     *     
     */
    public void setResourceId(IntrospectDataSourcePlanEntryResourceIdType value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the genericAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDefType }
     * 
     * 
     */
    public List<AttributeDefType> getGenericAttribute() {
        if (genericAttribute == null) {
            genericAttribute = new ArrayList<AttributeDefType>();
        }
        return this.genericAttribute;
    }

}
