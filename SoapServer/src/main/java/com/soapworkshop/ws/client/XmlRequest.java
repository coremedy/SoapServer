
package com.soapworkshop.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xmlRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdoubleMember���Ե�ֵ��
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
     * ����doubleMember���Ե�ֵ��
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
     * ��ȡintMember���Ե�ֵ��
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
     * ����intMember���Ե�ֵ��
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
     * ��ȡstrMember���Ե�ֵ��
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
     * ����strMember���Ե�ֵ��
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
