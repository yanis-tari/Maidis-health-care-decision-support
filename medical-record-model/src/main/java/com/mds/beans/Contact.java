package com.mds.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import thewebsemantic.Id;
import thewebsemantic.Namespace;
import thewebsemantic.Transient;
import thewebsemantic.binding.RdfBean;

import com.mds.beans.type.ContactState;

@XmlRootElement(name = "contact")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class Contact extends RdfBean<Contact> implements Serializable{
	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -8055996585845865763L;
	private int contact_Id;
	private int patient_Id;
	//private Patient patient;
	private int passage_Id;
	private int contactType_Id;
	private int respUnit_Id;
	private int user_Id;
	private int supContact_Id;
	//private Contact supContact;
	private int delegatedUser_Id;
	private String contactType;
	private String contactReason;
	private ContactState contactState;
	private Date beginDateTime;
	private Date endDateTime;
	private String contactPlace;
	private String remark;
	private int userStamp;
	private Date timeStamp;
	private String globalId;
	private List<SEObject> seObjects = new ArrayList<SEObject>();
	//private List<Pami> pamis = new ArrayList<Pami>();
	public Contact(int contact_Id, int patient_Id,
			int passage_Id, int contactType_Id, int respUnit_Id, int user_Id,
			int supContact_Id, int delegatedUser_Id,
			String contactType, String contactReason,
			ContactState contactState, Date beginDateTime,
			Date endDateTime, String contactPlace, String remark,
			int userStamp, Date timeStamp, String globalId,
			List<SEObject> seObjects) {
		super();
		this.contact_Id = contact_Id;
		this.patient_Id = patient_Id;
//		this.patient = patient;
		this.passage_Id = passage_Id;
		this.contactType_Id = contactType_Id;
		this.respUnit_Id = respUnit_Id;
		this.user_Id = user_Id;
		this.supContact_Id = supContact_Id;
//		this.supContact = supContact;
		this.delegatedUser_Id = delegatedUser_Id;
		this.contactType = contactType;
		this.contactReason = contactReason;
		this.contactState = contactState;
		this.beginDateTime = beginDateTime;
		this.endDateTime = endDateTime;
		this.contactPlace = contactPlace;
		this.remark = remark;
		this.userStamp = userStamp;
		this.timeStamp = timeStamp;
		this.globalId = globalId;
		this.seObjects = seObjects;
//		this.pamis = pamis;
	}
	public Contact() {
		super();
	}
	@XmlAttribute
	@Id
	public int getContact_Id() {
		return contact_Id;
	}
	public int getPatient_Id() {
		return patient_Id;
	}
//	public Patient getPatient() {
//		return patient;
//	}
	public int getPassage_Id() {
		return passage_Id;
	}
	public int getContactType_Id() {
		return contactType_Id;
	}
	public int getRespUnit_Id() {
		return respUnit_Id;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public int getSupContact_Id() {
		return supContact_Id;
	}
//	public Contact getSupContact() {
//		return supContact;
//	}
	public int getDelegatedUser_Id() {
		return delegatedUser_Id;
	}
	public String getContactType() {
		return contactType;
	}
	public String getContactReason() {
		return contactReason;
	}
	public ContactState getContactState() {
		return contactState;
	}
	public Date getBeginDateTime() {
		return beginDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public String getContactPlace() {
		return contactPlace;
	}
	public String getRemark() {
		return remark;
	}
	public int getUserStamp() {
		return userStamp;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public String getGlobalId() {
		return globalId;
	}
	public List<SEObject> getSeObjects() {
		return seObjects;
	}
//	public List<Pami> getPamis() {
//		return pamis;
//	}
	
	public void addSeObject(SEObject seObject){
		this.seObjects.add(seObject);
	}
	
//	public void addPami(Pami pami){
//		this.pamis.add(pami);
//	}
	
	public void setContact_Id(int contact_Id) {
		this.contact_Id = contact_Id;
	}
	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
	public void setPassage_Id(int passage_Id) {
		this.passage_Id = passage_Id;
	}
	public void setContactType_Id(int contactType_Id) {
		this.contactType_Id = contactType_Id;
	}
	public void setRespUnit_Id(int respUnit_Id) {
		this.respUnit_Id = respUnit_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public void setSupContact_Id(int supContact_Id) {
		this.supContact_Id = supContact_Id;
	}
//	public void setSupContact(Contact supContact) {
//		this.supContact = supContact;
//	}
	public void setDelegatedUser_Id(int delegatedUser_Id) {
		this.delegatedUser_Id = delegatedUser_Id;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public void setContactReason(String contactReason) {
		this.contactReason = contactReason;
	}
	public void setContactState(ContactState contactState) {
		this.contactState = contactState;
	}
	public void setBeginDateTime(Date beginDateTime) {
		this.beginDateTime = beginDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public void setContactPlace(String contactPlace) {
		this.contactPlace = contactPlace;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setUserStamp(int userStamp) {
		this.userStamp = userStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	public void setSeObjects(List<SEObject> seObjects) {
		this.seObjects = seObjects;
	}
//	public void setPamis(List<Pami> pamis) {
//		this.pamis = pamis;
//	}
	@Transient
	@Override
	public String toString() {
		return "Contact [contact_Id=" + contact_Id + ", patient_Id="
				+ patient_Id + ", passage_Id="
				+ passage_Id + ", contactType_Id=" + contactType_Id
				+ ", respUnit_Id=" + respUnit_Id + ", user_Id=" + user_Id
				+ ", supContact_Id=" + supContact_Id +  ", delegatedUser_Id=" + delegatedUser_Id
				+ ", contactType=" + contactType + ", contactReason="
				+ contactReason + ", contactState=" + contactState
				+ ", beginDateTime=" + beginDateTime + ", endDateTime="
				+ endDateTime + ", contactPlace=" + contactPlace + ", remark="
				+ remark + ", userStamp=" + userStamp + ", timeStamp="
				+ timeStamp + ", globalId=" + globalId + "]";
	}
	

}
