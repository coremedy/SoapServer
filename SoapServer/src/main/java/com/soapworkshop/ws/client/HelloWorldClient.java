package com.soapworkshop.ws.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

// D:\Java_Dev\eclipse-jee-luna-SR1-win32-x86_64\workspace\SoapServer\target\SoapServer\WEB-INF\classes\com\soapworkshop\ws>wsimport -p com.soapworkshop.ws.client -keep -verbose http://localhost:8080/SoapServer/hello?wsdl

public class HelloWorldClient {

	public static void main(String[] args) throws JAXBException, SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
		
		XmlRequest arg0 = new XmlRequest();
		arg0.setDoubleMember(new Double(123.456));
		arg0.setIntMember(new Integer(123));
		arg0.setStrMember("What !?");
		
		StringWriter writer = new StringWriter();
		JAXBContext jaxbContext = JAXBContext.newInstance(XmlRequest.class);
		// Take care of the QName
		JAXBElement<XmlRequest> jaxbElement = new JAXBElement<XmlRequest>(new QName("http://ws.soapworkshop.com/", "xmlRequest"), XmlRequest.class, arg0);
		// Transform it to xml
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(jaxbElement, writer);
		System.out.println(writer.toString());
		
		// Validation
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder parser = documentBuilderFactory.newDocumentBuilder();
        Document document = parser.parse(new ByteArrayInputStream(writer.toString().getBytes("utf-8")));
		SchemaFactory schemaFac = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFac.newSchema(new URL("http://localhost:8080/SoapServer/hello?xsd=1"));
        Validator validator = schema.newValidator();
        validator.validate(new DOMSource(document));

        // Send it to the server
		XmlResponse ret = hello.processHelloWorldResource(arg0);
		System.out.println(ret.getMsg());
	}

}