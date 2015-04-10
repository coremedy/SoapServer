package com.soapworkshop.ws;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SoapServerSoapHandler implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext context) {
		if (((Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
				.booleanValue()) {
			System.out.print("OUTBOUND: ");
		} else {
			System.out.print("INBOUND: ");
		}

		try {
			SOAPMessage message = context.getMessage();
			message.writeTo(System.out);
		} catch (Exception e) {
			System.err.println("Exception in handler: " + e);
		}

		return true;
	}

	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}