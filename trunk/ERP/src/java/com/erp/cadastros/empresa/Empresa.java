//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.12 at 03:44:46 PM BRT 
//


package com.erp.cadastros.empresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}tabelas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tabelas"
})
@XmlRootElement(name = "empresa")
public class Empresa {

    @XmlElement(required = true)
    protected Tabelas tabelas;

    /**
     * Gets the value of the tabelas property.
     * 
     * @return
     *     possible object is
     *     {@link Tabelas }
     *     
     */
    public Tabelas getTabelas() {
        return tabelas;
    }

    /**
     * Sets the value of the tabelas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabelas }
     *     
     */
    public void setTabelas(Tabelas value) {
        this.tabelas = value;
    }

}