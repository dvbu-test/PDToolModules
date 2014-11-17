//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.16 at 12:57:37 PM EST 
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
 * 				VCS Connections Type: A container for 1 or more VCS Connections
 * 			
 * 
 * <p>Java class for VCSConnectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VCSConnectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcsConnection" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}VCSConnectionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCSConnectionsType", propOrder = {
    "vcsConnection"
})
public class VCSConnectionsType {

    @XmlElement(required = true)
    protected List<VCSConnectionType> vcsConnection;

    /**
     * Gets the value of the vcsConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcsConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcsConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VCSConnectionType }
     * 
     * 
     */
    public List<VCSConnectionType> getVcsConnection() {
        if (vcsConnection == null) {
            vcsConnection = new ArrayList<VCSConnectionType>();
        }
        return this.vcsConnection;
    }

}
