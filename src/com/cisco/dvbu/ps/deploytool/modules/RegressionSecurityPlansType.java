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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Regression Security Plans Type: A list of security plans that correlate users with queries for execution.
 * 			
 * 
 * <p>Java class for RegressionSecurityPlansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionSecurityPlansType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regressionSecurityPlan" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionSecurityPlanType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionSecurityPlansType", propOrder = {
    "regressionSecurityPlan"
})
public class RegressionSecurityPlansType {

    @XmlElement(required = true)
    protected List<RegressionSecurityPlanType> regressionSecurityPlan;

    /**
     * Gets the value of the regressionSecurityPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regressionSecurityPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegressionSecurityPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegressionSecurityPlanType }
     * 
     * 
     */
    public List<RegressionSecurityPlanType> getRegressionSecurityPlan() {
        if (regressionSecurityPlan == null) {
            regressionSecurityPlan = new ArrayList<RegressionSecurityPlanType>();
        }
        return this.regressionSecurityPlan;
    }

}
