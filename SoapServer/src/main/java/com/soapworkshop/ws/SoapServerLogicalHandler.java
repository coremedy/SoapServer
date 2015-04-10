package com.soapworkshop.ws;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import org.xml.sax.SAXException;

public class SoapServerLogicalHandler implements
		LogicalHandler<LogicalMessageContext> {

	private Validator validator = null;

	private boolean inited = false;

	public boolean handleMessage(LogicalMessageContext context) {
		if (!inited) {
			synchronized (this) {
				if (!inited) {
					try {
						SchemaFactory schemaFac = SchemaFactory
								.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
						Schema schema = schemaFac
								.newSchema(new URL(
										"http://localhost:8080/SoapServer/hello?xsd=1"));
						validator = schema.newValidator();
						inited = true;
					} catch (MalformedURLException e) {
						e.printStackTrace();
						throw new WebServiceException(e.getMessage());
					} catch (SAXException e) {
						e.printStackTrace();
						throw new WebServiceException(e.getMessage());
					}
				}
			}
		}

		if (((Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
				.booleanValue()) {
			// Outbound
			try {
				LogicalMessage lm = context.getMessage();
				Source payload = lm.getPayload();
				validator.validate(payload);
				System.out.println("Outbound validation ok");
				return true;
			} catch (SAXException e) {
				e.printStackTrace();
				throw new WebServiceException(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				throw new WebServiceException(e.getMessage());
			}
		} else {
			// Inbounds
			try {
				LogicalMessage lm = context.getMessage();		
				Source payload = lm.getPayload();			
				validator.validate(payload);
				System.out.println("Inbound validation ok");
				return true;
			} catch (SAXException e) {
				throw new WebServiceException(e.getMessage());
			} catch (IOException e) {
				throw new WebServiceException(e.getMessage());
			}
		}
	}

	public boolean handleFault(LogicalMessageContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

}