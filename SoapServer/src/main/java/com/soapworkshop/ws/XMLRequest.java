package com.soapworkshop.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XMLRequest {

	protected Integer intMember;
	
	protected String strMember;
	
	protected Double doubleMember;

	
	public XMLRequest() {
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
}