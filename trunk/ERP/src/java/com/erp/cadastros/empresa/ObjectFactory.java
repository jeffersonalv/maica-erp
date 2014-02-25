//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.12 at 03:44:46 PM BRT 
//


package com.erp.cadastros.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.t2tierp.cadastros.empresa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Valor1_QNAME = new QName("", "valor1");
    private final static QName _Valor2_QNAME = new QName("", "valor2");
    private final static QName _Campo2_QNAME = new QName("", "campo2");
    private final static QName _Nome_QNAME = new QName("", "nome");
    private final static QName _Campo1_QNAME = new QName("", "campo1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.t2tierp.cadastros.empresa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tabelas }
     * 
     */
    public Tabelas createTabelas() {
        return new Tabelas();
    }

    /**
     * Create an instance of {@link Tabela }
     * 
     */
    public Tabela createTabela() {
        return new Tabela();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link Dados }
     * 
     */
    public Dados createDados() {
        return new Dados();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valor1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createValor1(String value) {
        return new JAXBElement<String>(_Valor1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valor2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createValor2(String value) {
        return new JAXBElement<String>(_Valor2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campo2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCampo2(String value) {
        return new JAXBElement<String>(_Campo2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nome")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNome(String value) {
        return new JAXBElement<String>(_Nome_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "campo1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCampo1(String value) {
        return new JAXBElement<String>(_Campo1_QNAME, String.class, null, value);
    }

}
