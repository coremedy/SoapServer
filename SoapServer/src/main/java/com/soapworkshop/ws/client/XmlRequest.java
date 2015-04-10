
package com.soapworkshop.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xmlRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xmlRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doubleMember" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="intMember" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="strMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlRequest", propOrder = {
    "doubleMember",
    "intMember",
    "strMember"
})
public class XmlRequest {

	@XmlElement(namespace="http://ws.soapworkshop.com/")
    protected Double doubleMember;
	
	@XmlElement(namespace="http://ws.soapworkshop.com/")
    protected Integer intMember;
	
	@XmlElement(namespace="http://ws.soapworkshop.com/")
    protected String strMember;

    /**
     * 获取doubleMember属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleMember() {
        return doubleMember;
    }

    /**
     * 设置doubleMember属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleMember(Double value) {
        this.doubleMember = value;
    }

    /**
     * 获取intMember属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntMember() {
        return intMember;
    }

    /**
     * 设置intMember属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntMember(Integer value) {
        this.intMember = value;
    }

    /**
     * 获取strMember属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMember() {
        return strMember;
    }

    /**
     * 设置strMember属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMember(String value) {
        this.strMember = value;
    }

}
