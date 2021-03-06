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
 * 			The set option can be repeated to set different attributes. 
 * 			
 * 			Multiple class paths can be set with a single statement.
 * 			
 * 				 The Composite resource name is given by "resourcePath". 
 * 			
 * 				 The "resourceType" is equal to DATA_SOURCE when attribute is classpath, host, port, database, 
 * 				user, or password.
 * 			
 * 				 The "attribute" can be: classpath, host, port, database, user, or password: 
 * 					 user "login" or "username" or error depending on source type
 * 					 password "password" or error depending on source type
 * 					 user2 "appUserName" or error if not Oracle EBS
 * 					 password2 "appPassword" or error if not Oracle EBS
 * 					 host "urlIP" or "dsn" or "server" or "appServer" or "url" or "root" or error 
 * 					  depending on the source type
 * 					 port "urlPort" or "port" or error depending on source type
 * 					 database "urlDatabaseName" or "enterprise" or "appServer" or error depending on the source type
 * 					 path "root" or "url" or error depending on source type
 * 					 annotation
 * 			
 * 				 Set "value" to a valid entry for the selected attribute. 
 * 				  String values can be enclosed with double quotes to allow for spaces. 
 * 				
 * 				For Windows systems, use the semicolon delimiter:
 * 					C:\DevZone\ATeam\Jars\my.jar;D:\Current\Ref\classes
 * 				For UNIX systems, use colons as the delimiter:
 * 					/lib/ext/classes:/lib/src/jars			
 * 			
 * 
 * <p>Java class for ArchiveResourceModificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveResourceModificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceAttribute" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveResourceAttributeModificationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveResourceModificationType", propOrder = {
    "resourceAttribute"
})
public class ArchiveResourceModificationType {

    @XmlElement(required = true)
    protected List<ArchiveResourceAttributeModificationType> resourceAttribute;

    /**
     * Gets the value of the resourceAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchiveResourceAttributeModificationType }
     * 
     * 
     */
    public List<ArchiveResourceAttributeModificationType> getResourceAttribute() {
        if (resourceAttribute == null) {
            resourceAttribute = new ArrayList<ArchiveResourceAttributeModificationType>();
        }
        return this.resourceAttribute;
    }

}
