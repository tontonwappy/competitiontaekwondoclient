package com.taekwondo.webservice;

import java.io.Serializable;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@WebService
@XmlRootElement(name = "testobj")
public class testobj  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String nom;
}
