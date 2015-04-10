package com.soapworkshop.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soapworkshop.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public XMLResponse processHelloWorldResource(XMLRequest in) {
		// TODO Auto-generated method stub
		XMLResponse resp = new XMLResponse();
		resp.setIntMember(in.getIntMember());
		resp.setDoubleMember(in.getDoubleMember());
		resp.setStrMember(in.getStrMember());
		resp.setMsg("This is the response! Int value = " + in.getIntMember() + " Double value = " + in.getDoubleMember() + " String value = " + in.getStrMember());
		return resp;
	}
	
}