//
// Generated By:JAX-WS RI 2.2.4-b01 (JAXB RI IBM 2.2.4-2)
//
// D:\Java_Dev\eclipse-jee-luna-SR1-win32-x86_64\workspace\SoapServer\target\SoapServer\WEB-INF\classes>wsgen -verbose -keep -cp . com.soapworkshop.ws.HelloWorldImpl

package com.soapworkshop.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "processHelloWorldResource", namespace = "http://ws.soapworkshop.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processHelloWorldResource", namespace = "http://ws.soapworkshop.com/")
public class ProcessHelloWorldResource {

    @XmlElement(name = "arg0", namespace = "")
    private com.soapworkshop.ws.XMLRequest arg0;

    /**
     * 
     * @return
     *     returns XMLRequest
     */
    public com.soapworkshop.ws.XMLRequest getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.soapworkshop.ws.XMLRequest arg0) {
        this.arg0 = arg0;
    }

}
