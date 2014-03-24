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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Archive Resource Type: 
 * 					1. "export" element is required for export,
 * 					2. "relocate" and "rebind" are optional for backup and restore,
 * 						but must be present if "resources" node is present in Archive definition.
 * 			
 * 
 * <p>Java class for ArchiveResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="export" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relocate" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveRelocateResourcePathType"/>
 *         &lt;element name="rebind" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveRebindResourcePathType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveResourceType", propOrder = {
    "exportOrRelocateOrRebind"
})
public class ArchiveResourceType {

    @XmlElements({
        @XmlElement(name = "export", type = String.class),
        @XmlElement(name = "rebind", type = ArchiveRebindResourcePathType.class),
        @XmlElement(name = "relocate", type = ArchiveRelocateResourcePathType.class)
    })
    protected List<Object> exportOrRelocateOrRebind;

    /**
     * Gets the value of the exportOrRelocateOrRebind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOrRelocateOrRebind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportOrRelocateOrRebind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link ArchiveRebindResourcePathType }
     * {@link ArchiveRelocateResourcePathType }
     * 
     * 
     */
    public List<Object> getExportOrRelocateOrRebind() {
        if (exportOrRelocateOrRebind == null) {
            exportOrRelocateOrRebind = new ArrayList<Object>();
        }
        return this.exportOrRelocateOrRebind;
    }

}
