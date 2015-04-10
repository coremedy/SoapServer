package com.soapworkshop.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XMLResponse {
	
	protected Integer intMember;
	
	protected String strMember;
	
	protected Double doubleMember;
	
	protected String msg;

	public XMLResponse() {
		super();
	}
	
	/**
	 * @return the intMember
	 */
	public Integer getIntMember() {
		return intMember;
	}

	/**
	 * @param intMember the intMember to set
	 */
	public void setIntMember(Integer intMember) {
		this.intMember = intMember;
	}

	/**
	 * @return the strMember
	 */
	public String getStrMember() {
		return strMember;
	}

	/**
	 * @param strMember the strMember to set
	 */
	public void setStrMember(String strMember) {
		this.strMember = strMember;
	}

	/**
	 * @return the doubleMember
	 */
	public Double getDoubleMember() {
		return doubleMember;
	}

	/**
	 * @param doubleMember the doubleMember to set
	 */
	public void setDoubleMember(Double doubleMember) {
		this.doubleMember = doubleMember;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
}