
package com.soapworkshop.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soapworkshop.ws.client package. 
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

    private final static QName _ProcessHelloWorldResourceResponse_QNAME = new QName("http://ws.soapworkshop.com/", "processHelloWorldResourceResponse");
    private final static QName _XmlRequest_QNAME = new QName("http://ws.soapworkshop.com/", "xmlRequest");
    private final static QName _ProcessHelloWorldResource_QNAME = new QName("http://ws.soapworkshop.com/", "processHelloWorldResource");
    private final static QName _XmlResponse_QNAME = new QName("http://ws.soapworkshop.com/", "xmlResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soapworkshop.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlResponse }
     * 
     */
    public XmlResponse createXmlResponse() {
        return new XmlResponse();
    }

    /**
     * Create an instance of {@link ProcessHelloWorldResource }
     * 
     */
    public ProcessHelloWorldResource createProcessHelloWorldResource() {
        return new ProcessHelloWorldResource();
    }

    /**
     * Create an instance of {@link XmlRequest }
     * 
     */
    public XmlRequest createXmlRequest() {
        return new XmlRequest();
    }

    /**
     * Create an instance of {@link ProcessHelloWorldResourceResponse }
     * 
     */
    public ProcessHelloWorldResourceResponse createProcessHelloWorldResourceResponse() {
        return new ProcessHelloWorldResourceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessHelloWorldResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapworkshop.com/", name = "processHelloWorldResourceResponse")
    public JAXBElement<ProcessHelloWorldResourceResponse> createProcessHelloWorldResourceResponse(ProcessHelloWorldResourceResponse value) {
        return new JAXBElement<ProcessHelloWorldResourceResponse>(_ProcessHelloWorldResourceResponse_QNAME, ProcessHelloWorldResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapworkshop.com/", name = "xmlRequest")
    public JAXBElement<XmlRequest> createXmlRequest(XmlRequest value) {
        return new JAXBElement<XmlRequest>(_XmlRequest_QNAME, XmlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessHelloWorldResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapworkshop.com/", name = "processHelloWorldResource")
    public JAXBElement<ProcessHelloWorldResource> createProcessHelloWorldResource(ProcessHelloWorldResource value) {
        return new JAXBElement<ProcessHelloWorldResource>(_ProcessHelloWorldResource_QNAME, ProcessHelloWorldResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapworkshop.com/", name = "xmlResponse")
    public JAXBElement<XmlResponse> createXmlResponse(XmlResponse value) {
        return new JAXBElement<XmlResponse>(_XmlResponse_QNAME, XmlResponse.class, null, value);
    }

}
