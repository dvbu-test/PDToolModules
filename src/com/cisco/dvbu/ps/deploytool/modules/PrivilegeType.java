//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.04 at 04:05:35 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A listing of privileges by name and name type (USER or GROUP) with a domain.  Contains the privileges, combined privileges and inherited privileges.
 * 
 * 				The returned privileges per user or group are the privileges specifically given to that
 * 				user or group.  In each "privilegeEntry", the "combinedPrivs" element contains the
 * 				effective privileges for that user or group based on their membership in all other groups.
 * 				In each "privilegeEntry", the "inheritedPrivs" element only contains the privileges that
 * 				were inherited due to group membership.  Logically OR'ing the "privs" and
 * 				"inheritedPrivs" is the same as the "combinedPrivs".
 * 
 * 				A user with GRANT privilege or with READ_ALL_RESOURCES right will receive all privilege
 * 				information for all users for a that resource.  Other users will only receive their own
 * 				privilege information.
 * 			
 * 
 * <p>Java class for PrivilegeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivilegeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameType" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}PrivilegeNameTypeValidationList"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="privileges" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}PrivilegeList"/>
 *         &lt;element name="combinedPrivileges" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}PrivilegeList" minOccurs="0"/>
 *         &lt;element name="inheritedPrivileges" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}PrivilegeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegeType", propOrder = {
    "name",
    "nameType",
    "domain",
    "privileges",
    "combinedPrivileges",
    "inheritedPrivileges"
})
public class PrivilegeType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected PrivilegeNameTypeValidationList nameType;
    @XmlElement(required = true)
    protected String domain;
    @XmlList
    @XmlElement(required = true)
    protected List<PrivilegeValidationList> privileges;
    @XmlList
    protected List<PrivilegeValidationList> combinedPrivileges;
    @XmlList
    protected List<PrivilegeValidationList> inheritedPrivileges;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegeNameTypeValidationList }
     *     
     */
    public PrivilegeNameTypeValidationList getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegeNameTypeValidationList }
     *     
     */
    public void setNameType(PrivilegeNameTypeValidationList value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the privileges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privileges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivileges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivilegeValidationList }
     * 
     * 
     */
    public List<PrivilegeValidationList> getPrivileges() {
        if (privileges == null) {
            privileges = new ArrayList<PrivilegeValidationList>();
        }
        return this.privileges;
    }

    /**
     * Gets the value of the combinedPrivileges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinedPrivileges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinedPrivileges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivilegeValidationList }
     * 
     * 
     */
    public List<PrivilegeValidationList> getCombinedPrivileges() {
        if (combinedPrivileges == null) {
            combinedPrivileges = new ArrayList<PrivilegeValidationList>();
        }
        return this.combinedPrivileges;
    }

    /**
     * Gets the value of the inheritedPrivileges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inheritedPrivileges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInheritedPrivileges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivilegeValidationList }
     * 
     * 
     */
    public List<PrivilegeValidationList> getInheritedPrivileges() {
        if (inheritedPrivileges == null) {
            inheritedPrivileges = new ArrayList<PrivilegeValidationList>();
        }
        return this.inheritedPrivileges;
    }

}
