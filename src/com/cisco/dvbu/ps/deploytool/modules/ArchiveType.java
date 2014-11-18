//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 04:26:28 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Archive Type: Defines the inputs required to process the archive command.
 * 			
 * 
 * <p>Java class for ArchiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="archiveMethod" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveMethodSimpleType"/>
 *         &lt;element name="archiveFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="includeDependencies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="resources" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveResourceType" minOccurs="0"/>
 *         &lt;element name="encrypt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeaccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeallusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includerequiredusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includecaching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includejars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includesourceinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includestatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="messagesonly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overridelocks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pkgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="printinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printroots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printcontents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="setAttributes" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveResourceModificationType" minOccurs="0"/>
 *         &lt;element name="users" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}ArchiveExportSecurityType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveType", propOrder = {

})
public class ArchiveType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, defaultValue = "CAR")
    protected ArchiveMethodSimpleType archiveMethod;
    @XmlElement(required = true)
    protected String archiveFileName;
    @XmlElement(defaultValue = "true")
    protected Boolean includeDependencies;
    protected ArchiveResourceType resources;
    @XmlElement(defaultValue = "false")
    protected Boolean encrypt;
    protected String description;
    @XmlElement(defaultValue = "false")
    protected Boolean includeaccess;
    @XmlElement(defaultValue = "false")
    protected Boolean includeallusers;
    @XmlElement(defaultValue = "false")
    protected Boolean includerequiredusers;
    @XmlElement(defaultValue = "false")
    protected Boolean includecaching;
    @XmlElement(defaultValue = "true")
    protected Boolean includejars;
    @XmlElement(defaultValue = "false")
    protected Boolean includesourceinfo;
    @XmlElement(defaultValue = "false")
    protected Boolean includestatistics;
    @XmlElement(defaultValue = "false")
    protected Boolean messagesonly;
    @XmlElement(defaultValue = "false")
    protected Boolean overridelocks;
    @XmlElement(defaultValue = "false")
    protected Boolean overwrite;
    @XmlElement(defaultValue = "Composite Server Archive File via PD Tool")
    protected String pkgName;
    @XmlElement(defaultValue = "false")
    protected Boolean printinfo;
    @XmlElement(defaultValue = "false")
    protected Boolean printroots;
    @XmlElement(defaultValue = "false")
    protected Boolean printusers;
    @XmlElement(defaultValue = "false")
    protected Boolean printcontents;
    @XmlElement(defaultValue = "false")
    protected Boolean printreferences;
    protected ArchiveResourceModificationType setAttributes;
    protected ArchiveExportSecurityType users;

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
     * Gets the value of the archiveMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveMethodSimpleType }
     *     
     */
    public ArchiveMethodSimpleType getArchiveMethod() {
        return archiveMethod;
    }

    /**
     * Sets the value of the archiveMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveMethodSimpleType }
     *     
     */
    public void setArchiveMethod(ArchiveMethodSimpleType value) {
        this.archiveMethod = value;
    }

    /**
     * Gets the value of the archiveFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveFileName() {
        return archiveFileName;
    }

    /**
     * Sets the value of the archiveFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveFileName(String value) {
        this.archiveFileName = value;
    }

    /**
     * Gets the value of the includeDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDependencies() {
        return includeDependencies;
    }

    /**
     * Sets the value of the includeDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDependencies(Boolean value) {
        this.includeDependencies = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveResourceType }
     *     
     */
    public ArchiveResourceType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveResourceType }
     *     
     */
    public void setResources(ArchiveResourceType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the encrypt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypt() {
        return encrypt;
    }

    /**
     * Sets the value of the encrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypt(Boolean value) {
        this.encrypt = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the includeaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeaccess() {
        return includeaccess;
    }

    /**
     * Sets the value of the includeaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeaccess(Boolean value) {
        this.includeaccess = value;
    }

    /**
     * Gets the value of the includeallusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeallusers() {
        return includeallusers;
    }

    /**
     * Sets the value of the includeallusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeallusers(Boolean value) {
        this.includeallusers = value;
    }

    /**
     * Gets the value of the includerequiredusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncluderequiredusers() {
        return includerequiredusers;
    }

    /**
     * Sets the value of the includerequiredusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluderequiredusers(Boolean value) {
        this.includerequiredusers = value;
    }

    /**
     * Gets the value of the includecaching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludecaching() {
        return includecaching;
    }

    /**
     * Sets the value of the includecaching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludecaching(Boolean value) {
        this.includecaching = value;
    }

    /**
     * Gets the value of the includejars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludejars() {
        return includejars;
    }

    /**
     * Sets the value of the includejars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludejars(Boolean value) {
        this.includejars = value;
    }

    /**
     * Gets the value of the includesourceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesourceinfo() {
        return includesourceinfo;
    }

    /**
     * Sets the value of the includesourceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesourceinfo(Boolean value) {
        this.includesourceinfo = value;
    }

    /**
     * Gets the value of the includestatistics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludestatistics() {
        return includestatistics;
    }

    /**
     * Sets the value of the includestatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludestatistics(Boolean value) {
        this.includestatistics = value;
    }

    /**
     * Gets the value of the messagesonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessagesonly() {
        return messagesonly;
    }

    /**
     * Sets the value of the messagesonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessagesonly(Boolean value) {
        this.messagesonly = value;
    }

    /**
     * Gets the value of the overridelocks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverridelocks() {
        return overridelocks;
    }

    /**
     * Sets the value of the overridelocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridelocks(Boolean value) {
        this.overridelocks = value;
    }

    /**
     * Gets the value of the overwrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Gets the value of the pkgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * Sets the value of the pkgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgName(String value) {
        this.pkgName = value;
    }

    /**
     * Gets the value of the printinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintinfo() {
        return printinfo;
    }

    /**
     * Sets the value of the printinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintinfo(Boolean value) {
        this.printinfo = value;
    }

    /**
     * Gets the value of the printroots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintroots() {
        return printroots;
    }

    /**
     * Sets the value of the printroots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintroots(Boolean value) {
        this.printroots = value;
    }

    /**
     * Gets the value of the printusers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintusers() {
        return printusers;
    }

    /**
     * Sets the value of the printusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintusers(Boolean value) {
        this.printusers = value;
    }

    /**
     * Gets the value of the printcontents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintcontents() {
        return printcontents;
    }

    /**
     * Sets the value of the printcontents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintcontents(Boolean value) {
        this.printcontents = value;
    }

    /**
     * Gets the value of the printreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintreferences() {
        return printreferences;
    }

    /**
     * Sets the value of the printreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintreferences(Boolean value) {
        this.printreferences = value;
    }

    /**
     * Gets the value of the setAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveResourceModificationType }
     *     
     */
    public ArchiveResourceModificationType getSetAttributes() {
        return setAttributes;
    }

    /**
     * Sets the value of the setAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveResourceModificationType }
     *     
     */
    public void setSetAttributes(ArchiveResourceModificationType value) {
        this.setAttributes = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveExportSecurityType }
     *     
     */
    public ArchiveExportSecurityType getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveExportSecurityType }
     *     
     */
    public void setUsers(ArchiveExportSecurityType value) {
        this.users = value;
    }

}
