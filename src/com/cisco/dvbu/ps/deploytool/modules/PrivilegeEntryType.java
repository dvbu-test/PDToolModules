//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.09 at 06:57:00 PM EST 
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
 * 				Resource Privilege Type: Documentation goes here.
 * 			
 * 
 * <p>Java class for PrivilegeEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivilegeEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceType" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ResourceTypeSimpleType" minOccurs="0"/>
 *         &lt;element name="recurse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updateDependenciesRecursively" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}PrivilegeModeValidationList" minOccurs="0"/>
 *         &lt;element name="privilege" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}PrivilegeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegeEntryType", propOrder = {
    "id",
    "resourcePath",
    "resourceType",
    "recurse",
    "updateDependenciesRecursively",
    "mode",
    "privilege"
})
public class PrivilegeEntryType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String resourcePath;
    protected ResourceTypeSimpleType resourceType;
    protected Boolean recurse;
    protected Boolean updateDependenciesRecursively;
    protected PrivilegeModeValidationList mode;
    @XmlElement(required = true)
    protected List<PrivilegeType> privilege;

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
     * Gets the value of the recurse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurse() {
        return recurse;
    }

    /**
     * Sets the value of the recurse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurse(Boolean value) {
        this.recurse = value;
    }

    /**
     * Gets the value of the updateDependenciesRecursively property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateDependenciesRecursively() {
        return updateDependenciesRecursively;
    }

    /**
     * Sets the value of the updateDependenciesRecursively property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateDependenciesRecursively(Boolean value) {
        this.updateDependenciesRecursively = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegeModeValidationList }
     *     
     */
    public PrivilegeModeValidationList getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegeModeValidationList }
     *     
     */
    public void setMode(PrivilegeModeValidationList value) {
        this.mode = value;
    }

    /**
     * Gets the value of the privilege property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privilege property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivilegeType }
     * 
     * 
     */
    public List<PrivilegeType> getPrivilege() {
        if (privilege == null) {
            privilege = new ArrayList<PrivilegeType>();
        }
        return this.privilege;
    }

}
