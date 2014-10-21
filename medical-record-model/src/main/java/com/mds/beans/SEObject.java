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

import com.mds.beans.type.ObjectStatus;

@XmlRootElement(name = "seObject")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class SEObject extends RdfBean<SEObject> implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -2642456858876219235L;
	
	private int object_Id;
	private int objectType_Id;
	private int ownerUser_Id;
	private int creatorCorresp_Id;
	private int modifierCorresp_Id;
	private int patient_Id;
	//private Patient patient;
	private int contact_Id;
	//private Contact contact;
	private int supObject_Id;
	//private SEObject supObject;
	private ObjectStatus objectStatus;
	private String objectReason;
	private Date correspCreatDateTime;
	private Date correspModifDateTime;
	private String accessKey;
	private String checkSum;
	private String remark;
	private String globalId;
	private int userStamp;
	private Date timeStamp;
	private Date vStartDate;
	private List<PamiI> pamis = new ArrayList<PamiI>();
	
	public SEObject(int object_Id, int objectType_Id, int ownerUser_Id,
			int creatorCorresp_Id, int modifierCorresp_Id, int patient_Id,
			Patient patient, int contact_Id, Contact contact, int supObject_Id,
			SEObject supObject, ObjectStatus objectStatus, String objectReason,
			Date correspCreatDateTime, Date correspModifDateTime,
			String accessKey, String checkSum, String remark, String globalId,
			int userStamp, Date timeStamp, Date vStartDate, List<PamiI> pamis) {
		super();
		this.object_Id = object_Id;
		this.objectType_Id = objectType_Id;
		this.ownerUser_Id = ownerUser_Id;
		this.creatorCorresp_Id = creatorCorresp_Id;
		this.modifierCorresp_Id = modifierCorresp_Id;
		this.patient_Id = patient_Id;
//		this.patient = patient;
		this.contact_Id = contact_Id;
//		this.contact = contact;
		this.supObject_Id = supObject_Id;
//		this.supObject = supObject;
		this.objectStatus = objectStatus;
		this.objectReason = objectReason;
		this.correspCreatDateTime = correspCreatDateTime;
		this.correspModifDateTime = correspModifDateTime;
		this.accessKey = accessKey;
		this.checkSum = checkSum;
		this.remark = remark;
		this.globalId = globalId;
		this.userStamp = userStamp;
		this.timeStamp = timeStamp;
		this.vStartDate = vStartDate;
		this.pamis = pamis;
	}
	public SEObject() {
		super();
	}
	@XmlAttribute
	@Id
	public int getObject_Id() {
		return object_Id;
	}
	public int getObjectType_Id() {
		return objectType_Id;
	}
	public int getOwnerUser_Id() {
		return ownerUser_Id;
	}
	public int getCreatorCorresp_Id() {
		return creatorCorresp_Id;
	}
	public int getModifierCorresp_Id() {
		return modifierCorresp_Id;
	}
	public int getPatient_Id() {
		return patient_Id;
	}
//	public Patient getPatient() {
//		return patient;
//	}
	public int getContact_Id() {
		return contact_Id;
	}
//	public Contact getContact() {
//		return contact;
//	}
	public int getSupObject_Id() {
		return supObject_Id;
	}
//	public SEObject getSupObject() {
//		return supObject;
//	}
	public ObjectStatus getObjectStatus() {
		return objectStatus;
	}
	public String getObjectReason() {
		return objectReason;
	}
	public Date getCorrespCreatDateTime() {
		return correspCreatDateTime;
	}
	public Date getCorrespModifDateTime() {
		return correspModifDateTime;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public String getCheckSum() {
		return checkSum;
	}
	public String getRemark() {
		return remark;
	}
	public String getGlobalId() {
		return globalId;
	}
	public int getUserStamp() {
		return userStamp;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public Date getvStartDate() {
		return vStartDate;
	}
	public List<PamiI> getPamis() {
		return pamis;
	}
	public void setObject_Id(int object_Id) {
		this.object_Id = object_Id;
	}
	public void setObjectType_Id(int objectType_Id) {
		this.objectType_Id = objectType_Id;
	}
	public void setOwnerUser_Id(int ownerUser_Id) {
		this.ownerUser_Id = ownerUser_Id;
	}
	public void setCreatorCorresp_Id(int creatorCorresp_Id) {
		this.creatorCorresp_Id = creatorCorresp_Id;
	}
	public void setModifierCorresp_Id(int modifierCorresp_Id) {
		this.modifierCorresp_Id = modifierCorresp_Id;
	}
	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
	public void setContact_Id(int contact_Id) {
		this.contact_Id = contact_Id;
	}
//	public void setContact(Contact contact) {
//		this.contact = contact;
//	}
	public void setSupObject_Id(int supObject_Id) {
		this.supObject_Id = supObject_Id;
	}
//	public void setSupObject(SEObject supObject) {
//		this.supObject = supObject;
//	}
	public void setObjectStatus(ObjectStatus objectStatus) {
		this.objectStatus = objectStatus;
	}
	public void setObjectReason(String objectReason) {
		this.objectReason = objectReason;
	}
	public void setCorrespCreatDateTime(Date correspCreatDateTime) {
		this.correspCreatDateTime = correspCreatDateTime;
	}
	public void setCorrespModifDateTime(Date correspModifDateTime) {
		this.correspModifDateTime = correspModifDateTime;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	public void setUserStamp(int userStamp) {
		this.userStamp = userStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public void setvStartDate(Date vStartDate) {
		this.vStartDate = vStartDate;
	}
	public void setPamis(List<PamiI> pamis) {
		this.pamis = pamis;
	}
	
	@Transient
	public void addPami(PamiI pami){
		this.pamis.add(pami);		
	}
	@Transient
	@Override
	public String toString() {

		return "SEObject [object_Id=" + object_Id + ", objectType_Id="
				+ objectType_Id + ", ownerUser_Id=" + ownerUser_Id
				+ ", creatorCorresp_Id=" + creatorCorresp_Id
				+ ", modifierCorresp_Id=" + modifierCorresp_Id
				+ ", patient_Id=" + patient_Id 
				+ ", contact_Id=" + contact_Id 
				+ ", supObject_Id=" + supObject_Id 
				+ ", objectStatus=" + objectStatus + ", objectReason="
				+ objectReason + ", correspCreatDateTime="
				+ correspCreatDateTime + ", correspModifDateTime="
				+ correspModifDateTime + ", accessKey=" + accessKey
				+ ", checkSum=" + checkSum + ", remark=" + remark
				+ ", globalId=" + globalId + ", userStamp=" + userStamp
				+ ", timeStamp=" + timeStamp + ", vStartDate=" + vStartDate+ "]";
	} 	

}
