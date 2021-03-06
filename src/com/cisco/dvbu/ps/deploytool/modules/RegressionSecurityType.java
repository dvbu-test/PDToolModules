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
 * 				Regression Security Type: A collection of users, queries and plans for testing security.
 * 			
 * 
 * <p>Java class for RegressionSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionSecurityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regressionSecurityUsers" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionSecurityUsersType" minOccurs="0"/>
 *         &lt;element name="regressionSecurityQueries" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionSecurityQueriesType" minOccurs="0"/>
 *         &lt;element name="regressionSecurityPlans" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionSecurityPlansType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionSecurityType", propOrder = {
    "regressionSecurityUsers",
    "regressionSecurityQueries",
    "regressionSecurityPlans"
})
public class RegressionSecurityType {

    protected RegressionSecurityUsersType regressionSecurityUsers;
    protected RegressionSecurityQueriesType regressionSecurityQueries;
    protected RegressionSecurityPlansType regressionSecurityPlans;

    /**
     * Gets the value of the regressionSecurityUsers property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionSecurityUsersType }
     *     
     */
    public RegressionSecurityUsersType getRegressionSecurityUsers() {
        return regressionSecurityUsers;
    }

    /**
     * Sets the value of the regressionSecurityUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionSecurityUsersType }
     *     
     */
    public void setRegressionSecurityUsers(RegressionSecurityUsersType value) {
        this.regressionSecurityUsers = value;
    }

    /**
     * Gets the value of the regressionSecurityQueries property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionSecurityQueriesType }
     *     
     */
    public RegressionSecurityQueriesType getRegressionSecurityQueries() {
        return regressionSecurityQueries;
    }

    /**
     * Sets the value of the regressionSecurityQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionSecurityQueriesType }
     *     
     */
    public void setRegressionSecurityQueries(RegressionSecurityQueriesType value) {
        this.regressionSecurityQueries = value;
    }

    /**
     * Gets the value of the regressionSecurityPlans property.
     * 
     * @return
     *     possible object is
     *     {@link RegressionSecurityPlansType }
     *     
     */
    public RegressionSecurityPlansType getRegressionSecurityPlans() {
        return regressionSecurityPlans;
    }

    /**
     * Sets the value of the regressionSecurityPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegressionSecurityPlansType }
     *     
     */
    public void setRegressionSecurityPlans(RegressionSecurityPlansType value) {
        this.regressionSecurityPlans = value;
    }

}
