package com.soapworkshop.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "HelloWorld", targetNamespace = "http://ws.soapworkshop.com/")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
@HandlerChain(file="handlers.xml")
public interface HelloWorld {

	@WebMethod
	//@RequestWrapper(className = "com.soapworkshop.ws.JAXWSRequest")
	//@ResponseWrapper(className = "com.soapworkshop.ws.JAXWSResponse")
	XMLResponse processHelloWorldResource(XMLRequest in);

}