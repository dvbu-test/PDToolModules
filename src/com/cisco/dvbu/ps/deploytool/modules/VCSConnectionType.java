//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.16 at 12:57:37 PM EST 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				VCS Connection Type: Each row represents a VCS Connection to a VCS Repository with all of the related VCS variables.  
 * 				This information was moved from the PDTool Config Property file to here to allow a more configurable environment.
 * 			
 * 
 * <p>Java class for VCSConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VCSConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_BASE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_HOME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_EXEC_FULL_PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_WORKSPACE_INIT_NEW_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_WORKSPACE_INIT_LINK_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_WORKSPACE_INIT_GET_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_BASE_FOLDER_INIT_ADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_CHECKIN_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_CHECKIN_OPTIONS_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_CHECKOUT_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_CHECKOUT_OPTIONS_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_CIS_IMPORT_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_CIS_EXPORT_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VCS_REPOSITORY_URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_PROJECT_ROOT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_WORKSPACE_HOME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_WORKSPACE_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_WORKSPACE_DIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_TEMP_DIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_IGNORE_MESSAGES" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCS_MESSAGE_PREPEND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vcsSpecificEnvVars" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}VCSConnectionSpecificEnvVarsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCSConnectionType", propOrder = {
    "id",
    "vcstype",
    "vcsbasetype",
    "vcshome",
    "vcscommand",
    "vcsexecfullpath",
    "vcsoptions",
    "vcsworkspaceinitnewoptions",
    "vcsworkspaceinitlinkoptions",
    "vcsworkspaceinitgetoptions",
    "vcsbasefolderinitadd",
    "vcscheckinoptions",
    "vcscheckinoptionsrequired",
    "vcscheckoutoptions",
    "vcscheckoutoptionsrequired",
    "vcscisimportoptions",
    "vcscisexportoptions",
    "vcsrepositoryurl",
    "vcsprojectroot",
    "vcsworkspacehome",
    "vcsworkspacename",
    "vcsworkspacedir",
    "vcstempdir",
    "vcsusername",
    "vcspassword",
    "vcsignoremessages",
    "vcsmessageprepend",
    "vcsSpecificEnvVars"
})
public class VCSConnectionType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "VCS_TYPE", required = true)
    protected String vcstype;
    @XmlElement(name = "VCS_BASE_TYPE")
    protected String vcsbasetype;
    @XmlElement(name = "VCS_HOME", required = true)
    protected String vcshome;
    @XmlElement(name = "VCS_COMMAND", required = true)
    protected String vcscommand;
    @XmlElement(name = "VCS_EXEC_FULL_PATH", required = true)
    protected String vcsexecfullpath;
    @XmlElement(name = "VCS_OPTIONS", required = true)
    protected String vcsoptions;
    @XmlElement(name = "VCS_WORKSPACE_INIT_NEW_OPTIONS")
    protected String vcsworkspaceinitnewoptions;
    @XmlElement(name = "VCS_WORKSPACE_INIT_LINK_OPTIONS")
    protected String vcsworkspaceinitlinkoptions;
    @XmlElement(name = "VCS_WORKSPACE_INIT_GET_OPTIONS")
    protected String vcsworkspaceinitgetoptions;
    @XmlElement(name = "VCS_BASE_FOLDER_INIT_ADD")
    protected String vcsbasefolderinitadd;
    @XmlElement(name = "VCS_CHECKIN_OPTIONS")
    protected String vcscheckinoptions;
    @XmlElement(name = "VCS_CHECKIN_OPTIONS_REQUIRED")
    protected String vcscheckinoptionsrequired;
    @XmlElement(name = "VCS_CHECKOUT_OPTIONS")
    protected String vcscheckoutoptions;
    @XmlElement(name = "VCS_CHECKOUT_OPTIONS_REQUIRED")
    protected String vcscheckoutoptionsrequired;
    @XmlElement(name = "VCS_CIS_IMPORT_OPTIONS")
    protected String vcscisimportoptions;
    @XmlElement(name = "VCS_CIS_EXPORT_OPTIONS")
    protected String vcscisexportoptions;
    @XmlElement(name = "VCS_REPOSITORY_URL", required = true)
    protected String vcsrepositoryurl;
    @XmlElement(name = "VCS_PROJECT_ROOT", required = true)
    protected String vcsprojectroot;
    @XmlElement(name = "VCS_WORKSPACE_HOME", required = true)
    protected String vcsworkspacehome;
    @XmlElement(name = "VCS_WORKSPACE_NAME", required = true)
    protected String vcsworkspacename;
    @XmlElement(name = "VCS_WORKSPACE_DIR", required = true)
    protected String vcsworkspacedir;
    @XmlElement(name = "VCS_TEMP_DIR", required = true)
    protected String vcstempdir;
    @XmlElement(name = "VCS_USERNAME", required = true)
    protected String vcsusername;
    @XmlElement(name = "VCS_PASSWORD", required = true)
    protected String vcspassword;
    @XmlElement(name = "VCS_IGNORE_MESSAGES", required = true)
    protected String vcsignoremessages;
    @XmlElement(name = "VCS_MESSAGE_PREPEND", required = true)
    protected String vcsmessageprepend;
    protected VCSConnectionSpecificEnvVarsType vcsSpecificEnvVars;

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
     * Gets the value of the vcstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSTYPE() {
        return vcstype;
    }

    /**
     * Sets the value of the vcstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSTYPE(String value) {
        this.vcstype = value;
    }

    /**
     * Gets the value of the vcsbasetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSBASETYPE() {
        return vcsbasetype;
    }

    /**
     * Sets the value of the vcsbasetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSBASETYPE(String value) {
        this.vcsbasetype = value;
    }

    /**
     * Gets the value of the vcshome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSHOME() {
        return vcshome;
    }

    /**
     * Sets the value of the vcshome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSHOME(String value) {
        this.vcshome = value;
    }

    /**
     * Gets the value of the vcscommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCOMMAND() {
        return vcscommand;
    }

    /**
     * Sets the value of the vcscommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCOMMAND(String value) {
        this.vcscommand = value;
    }

    /**
     * Gets the value of the vcsexecfullpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSEXECFULLPATH() {
        return vcsexecfullpath;
    }

    /**
     * Sets the value of the vcsexecfullpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSEXECFULLPATH(String value) {
        this.vcsexecfullpath = value;
    }

    /**
     * Gets the value of the vcsoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSOPTIONS() {
        return vcsoptions;
    }

    /**
     * Sets the value of the vcsoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSOPTIONS(String value) {
        this.vcsoptions = value;
    }

    /**
     * Gets the value of the vcsworkspaceinitnewoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSWORKSPACEINITNEWOPTIONS() {
        return vcsworkspaceinitnewoptions;
    }

    /**
     * Sets the value of the vcsworkspaceinitnewoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSWORKSPACEINITNEWOPTIONS(String value) {
        this.vcsworkspaceinitnewoptions = value;
    }

    /**
     * Gets the value of the vcsworkspaceinitlinkoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSWORKSPACEINITLINKOPTIONS() {
        return vcsworkspaceinitlinkoptions;
    }

    /**
     * Sets the value of the vcsworkspaceinitlinkoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSWORKSPACEINITLINKOPTIONS(String value) {
        this.vcsworkspaceinitlinkoptions = value;
    }

    /**
     * Gets the value of the vcsworkspaceinitgetoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSWORKSPACEINITGETOPTIONS() {
        return vcsworkspaceinitgetoptions;
    }

    /**
     * Sets the value of the vcsworkspaceinitgetoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSWORKSPACEINITGETOPTIONS(String value) {
        this.vcsworkspaceinitgetoptions = value;
    }

    /**
     * Gets the value of the vcsbasefolderinitadd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSBASEFOLDERINITADD() {
        return vcsbasefolderinitadd;
    }

    /**
     * Sets the value of the vcsbasefolderinitadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSBASEFOLDERINITADD(String value) {
        this.vcsbasefolderinitadd = value;
    }

    /**
     * Gets the value of the vcscheckinoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCHECKINOPTIONS() {
        return vcscheckinoptions;
    }

    /**
     * Sets the value of the vcscheckinoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCHECKINOPTIONS(String value) {
        this.vcscheckinoptions = value;
    }

    /**
     * Gets the value of the vcscheckinoptionsrequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCHECKINOPTIONSREQUIRED() {
        return vcscheckinoptionsrequired;
    }

    /**
     * Sets the value of the vcscheckinoptionsrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCHECKINOPTIONSREQUIRED(String value) {
        this.vcscheckinoptionsrequired = value;
    }

    /**
     * Gets the value of the vcscheckoutoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCHECKOUTOPTIONS() {
        return vcscheckoutoptions;
    }

    /**
     * Sets the value of the vcscheckoutoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCHECKOUTOPTIONS(String value) {
        this.vcscheckoutoptions = value;
    }

    /**
     * Gets the value of the vcscheckoutoptionsrequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCHECKOUTOPTIONSREQUIRED() {
        return vcscheckoutoptionsrequired;
    }

    /**
     * Sets the value of the vcscheckoutoptionsrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCHECKOUTOPTIONSREQUIRED(String value) {
        this.vcscheckoutoptionsrequired = value;
    }

    /**
     * Gets the value of the vcscisimportoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCISIMPORTOPTIONS() {
        return vcscisimportoptions;
    }

    /**
     * Sets the value of the vcscisimportoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCISIMPORTOPTIONS(String value) {
        this.vcscisimportoptions = value;
    }

    /**
     * Gets the value of the vcscisexportoptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSCISEXPORTOPTIONS() {
        return vcscisexportoptions;
    }

    /**
     * Sets the value of the vcscisexportoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSCISEXPORTOPTIONS(String value) {
        this.vcscisexportoptions = value;
    }

    /**
     * Gets the value of the vcsrepositoryurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSREPOSITORYURL() {
        return vcsrepositoryurl;
    }

    /**
     * Sets the value of the vcsrepositoryurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSREPOSITORYURL(String value) {
        this.vcsrepositoryurl = value;
    }

    /**
     * Gets the value of the vcsprojectroot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSPROJECTROOT() {
        return vcsprojectroot;
    }

    /**
     * Sets the value of the vcsprojectroot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSPROJECTROOT(String value) {
        this.vcsprojectroot = value;
    }

    /**
     * Gets the value of the vcsworkspacehome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSWORKSPACEHOME() {
        return vcsworkspacehome;
    }

    /**
     * Sets the value of the vcsworkspacehome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSWORKSPACEHOME(String value) {
        this.vcsworkspacehome = value;
    }

    /**
     * Gets the value of the vcsworkspacename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSWORKSPACENAME() {
        return vcsworkspacename;
    }

    /**
     * Sets the value of the vcsworkspacename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSWORKSPACENAME(String value) {
        this.vcsworkspacename = value;
    }

    /**
     * Gets the value of the vcsworkspacedir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSWORKSPACEDIR() {
        return vcsworkspacedir;
    }

    /**
     * Sets the value of the vcsworkspacedir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSWORKSPACEDIR(String value) {
        this.vcsworkspacedir = value;
    }

    /**
     * Gets the value of the vcstempdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSTEMPDIR() {
        return vcstempdir;
    }

    /**
     * Sets the value of the vcstempdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSTEMPDIR(String value) {
        this.vcstempdir = value;
    }

    /**
     * Gets the value of the vcsusername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSUSERNAME() {
        return vcsusername;
    }

    /**
     * Sets the value of the vcsusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSUSERNAME(String value) {
        this.vcsusername = value;
    }

    /**
     * Gets the value of the vcspassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSPASSWORD() {
        return vcspassword;
    }

    /**
     * Sets the value of the vcspassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSPASSWORD(String value) {
        this.vcspassword = value;
    }

    /**
     * Gets the value of the vcsignoremessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSIGNOREMESSAGES() {
        return vcsignoremessages;
    }

    /**
     * Sets the value of the vcsignoremessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSIGNOREMESSAGES(String value) {
        this.vcsignoremessages = value;
    }

    /**
     * Gets the value of the vcsmessageprepend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCSMESSAGEPREPEND() {
        return vcsmessageprepend;
    }

    /**
     * Sets the value of the vcsmessageprepend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCSMESSAGEPREPEND(String value) {
        this.vcsmessageprepend = value;
    }

    /**
     * Gets the value of the vcsSpecificEnvVars property.
     * 
     * @return
     *     possible object is
     *     {@link VCSConnectionSpecificEnvVarsType }
     *     
     */
    public VCSConnectionSpecificEnvVarsType getVcsSpecificEnvVars() {
        return vcsSpecificEnvVars;
    }

    /**
     * Sets the value of the vcsSpecificEnvVars property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCSConnectionSpecificEnvVarsType }
     *     
     */
    public void setVcsSpecificEnvVars(VCSConnectionSpecificEnvVarsType value) {
        this.vcsSpecificEnvVars = value;
    }

}
