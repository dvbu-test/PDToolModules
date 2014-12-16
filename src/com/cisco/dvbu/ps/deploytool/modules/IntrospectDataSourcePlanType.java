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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Introspect Data Source Plan Type: Provides the detailed plan for introspection.
 * 		
 * 
 * <p>Java class for IntrospectDataSourcePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrospectDataSourcePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateAllIntrospectedResources" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="failFast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="commitOnFailure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoRollback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scanForNewResourcesToAutoAdd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="planEntry" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}IntrospectDataSourcePlanEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrospectDataSourcePlanType", propOrder = {
    "updateAllIntrospectedResources",
    "failFast",
    "commitOnFailure",
    "autoRollback",
    "scanForNewResourcesToAutoAdd",
    "planEntry"
})
public class IntrospectDataSourcePlanType {

    protected boolean updateAllIntrospectedResources;
    protected boolean failFast;
    protected boolean commitOnFailure;
    protected boolean autoRollback;
    protected boolean scanForNewResourcesToAutoAdd;
    protected List<IntrospectDataSourcePlanEntryType> planEntry;

    /**
     * Gets the value of the updateAllIntrospectedResources property.
     * 
     */
    public boolean isUpdateAllIntrospectedResources() {
        return updateAllIntrospectedResources;
    }

    /**
     * Sets the value of the updateAllIntrospectedResources property.
     * 
     */
    public void setUpdateAllIntrospectedResources(boolean value) {
        this.updateAllIntrospectedResources = value;
    }

    /**
     * Gets the value of the failFast property.
     * 
     */
    public boolean isFailFast() {
        return failFast;
    }

    /**
     * Sets the value of the failFast property.
     * 
     */
    public void setFailFast(boolean value) {
        this.failFast = value;
    }

    /**
     * Gets the value of the commitOnFailure property.
     * 
     */
    public boolean isCommitOnFailure() {
        return commitOnFailure;
    }

    /**
     * Sets the value of the commitOnFailure property.
     * 
     */
    public void setCommitOnFailure(boolean value) {
        this.commitOnFailure = value;
    }

    /**
     * Gets the value of the autoRollback property.
     * 
     */
    public boolean isAutoRollback() {
        return autoRollback;
    }

    /**
     * Sets the value of the autoRollback property.
     * 
     */
    public void setAutoRollback(boolean value) {
        this.autoRollback = value;
    }

    /**
     * Gets the value of the scanForNewResourcesToAutoAdd property.
     * 
     */
    public boolean isScanForNewResourcesToAutoAdd() {
        return scanForNewResourcesToAutoAdd;
    }

    /**
     * Sets the value of the scanForNewResourcesToAutoAdd property.
     * 
     */
    public void setScanForNewResourcesToAutoAdd(boolean value) {
        this.scanForNewResourcesToAutoAdd = value;
    }

    /**
     * Gets the value of the planEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntrospectDataSourcePlanEntryType }
     * 
     * 
     */
    public List<IntrospectDataSourcePlanEntryType> getPlanEntry() {
        if (planEntry == null) {
            planEntry = new ArrayList<IntrospectDataSourcePlanEntryType>();
        }
        return this.planEntry;
    }

}
