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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Regression Security Users Type: A list of regression users used to test security privileges.
 * 			
 * 
 * <p>Java class for RegressionSecurityUsersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionSecurityUsersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regressionSecurityUser" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}RegressionSecurityUserType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionSecurityUsersType", propOrder = {
    "regressionSecurityUser"
})
public class RegressionSecurityUsersType {

    @XmlElement(required = true)
    protected List<RegressionSecurityUserType> regressionSecurityUser;

    /**
     * Gets the value of the regressionSecurityUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regressionSecurityUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegressionSecurityUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegressionSecurityUserType }
     * 
     * 
     */
    public List<RegressionSecurityUserType> getRegressionSecurityUser() {
        if (regressionSecurityUser == null) {
            regressionSecurityUser = new ArrayList<RegressionSecurityUserType>();
        }
        return this.regressionSecurityUser;
    }

}
