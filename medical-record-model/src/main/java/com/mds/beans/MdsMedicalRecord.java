package com.mds.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import thewebsemantic.Id;
import thewebsemantic.Namespace;
import thewebsemantic.Transient;
import thewebsemantic.binding.RdfBean;

@XmlRootElement(name = "medicalRecord")
@XmlAccessorType(XmlAccessType.FIELD)
@Namespace("http://maidis/medical-record#")
public class MdsMedicalRecord extends RdfBean<MdsMedicalRecord> implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 944073442550319645L;
	private int mr_id;
	private Patient staticInformations;
	private List<Contact> contacts = new ArrayList<Contact>();	
	
	private List<Allergy> hasAllergy= new ArrayList<Allergy>();
	private List<Risk> hasRisk = new ArrayList<Risk>();
	

	public MdsMedicalRecord(int mr_id, Patient staticInformations,
			List<Contact> contacts, List<Allergy> hasAllergy, List<Risk> hasRisk) {
		super();
		this.mr_id = mr_id;
		this.staticInformations = staticInformations;
		this.contacts = contacts;
		this.hasAllergy = hasAllergy;
		this.hasRisk = hasRisk;
	}

	public MdsMedicalRecord() {
		super();
	}
	@Id
	@XmlAttribute
	public int getMr_id() {
		return mr_id;
	}

	public Patient getStaticInformations() {
		return staticInformations;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public List<Allergy> getHasAllergy() {
		return hasAllergy;
	}

	public List<Risk> getHasRisk() {
		return hasRisk;
	}

	public void setMr_id(int mr_id) {
		this.mr_id = mr_id;
	}

	public void setStaticInformations(Patient staticInformations) {
		this.staticInformations = staticInformations;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public void setHasAllergy(List<Allergy> hasAllergy) {
		this.hasAllergy = hasAllergy;
	}

	public void setHasRisk(List<Risk> hasRisk) {
		this.hasRisk = hasRisk;
	}
	
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	

	public void addAllergy(Allergy allergy) {
		this.hasAllergy.add(allergy);
	}

	public void addRisk(Risk risk) {
		this.hasRisk.add(risk);
	}

		
}
