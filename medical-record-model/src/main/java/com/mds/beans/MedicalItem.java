package com.mds.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;

import thewebsemantic.Id;

import com.mds.beans.type.DiagnosisType;
import com.mds.beans.type.MIActive;
import com.mds.beans.type.MIImportance;

public abstract class MedicalItem {
	private int mi_Id;
	private int supMI_Id;
	private int patient_Id;
	private int respUnit_Id;
	private int toRespUnit_Id;
	private int fromRespUnit_Id;
	private int object_Id;
	private int contact_Id;
	private int user_Id;
	private int toUser_Id;
	private int fromUser_Id;
	private String miClass;
	private String miCode;
	private String miType;
	private String miText;
	private String miCategory;
	private int miCertainty;
	private Date miDate;
	private Date miEndDate;
	private String miRelative;
	private Boolean isAffectsPatient;
	private Boolean isNegative;
	private int rank;
	private String remark;
	private int quantity;
	private String accessKey;
	private String  checkSum;
	private  String msoda;
	private Boolean isArchived;
	private Date archiveDateTime;
	private int userStamp;
	private Date timeStamp;
	private Date vstartDate;
	private int miStatus;
	private Date miStatusDate;
	private MIActive miActive;
	private MIImportance miImportance;
	private DiagnosisType diagnosisType;
		
	
	public MedicalItem() {
		super();
	}

	public MedicalItem(int mi_Id, int supMI_Id, int patient_Id,
			int respUnit_Id, int toRespUnit_Id, int fromRespUnit_Id,
			int object_Id, int contact_Id, int user_Id, int toUser_Id,
			int fromUser_Id, String miClass, String miCode, String miType,
			String miText, String miCategory, int miCertainty, Date miDate,
			Date miEndDate, String miRelative, Boolean isAffectsPatient,
			Boolean isNegative, int rank, String remark, int quantity,
			String accessKey, String checkSum, String msoda,
			Boolean isArchived, Date archiveDateTime, int userStamp,
			Date timeStamp, Date vstartDate, int miStatus, Date miStatusDate,
			MIActive miActive, MIImportance miImportance,
			DiagnosisType diagnosisType) {
		super();
		this.mi_Id = mi_Id;
		this.supMI_Id = supMI_Id;
		this.patient_Id = patient_Id;
		this.respUnit_Id = respUnit_Id;
		this.toRespUnit_Id = toRespUnit_Id;
		this.fromRespUnit_Id = fromRespUnit_Id;
		this.object_Id = object_Id;
		this.contact_Id = contact_Id;
		this.user_Id = user_Id;
		this.toUser_Id = toUser_Id;
		this.fromUser_Id = fromUser_Id;
		this.miClass = miClass;
		this.miCode = miCode;
		this.miType = miType;
		this.miText = miText;
		this.miCategory = miCategory;
		this.miCertainty = miCertainty;
		this.miDate = miDate;
		this.miEndDate = miEndDate;
		this.miRelative = miRelative;
		this.isAffectsPatient = isAffectsPatient;
		this.isNegative = isNegative;
		this.rank = rank;
		this.remark = remark;
		this.quantity = quantity;
		this.accessKey = accessKey;
		this.checkSum = checkSum;
		this.msoda = msoda;
		this.isArchived = isArchived;
		this.archiveDateTime = archiveDateTime;
		this.userStamp = userStamp;
		this.timeStamp = timeStamp;
		this.vstartDate = vstartDate;
		this.miStatus = miStatus;
		this.miStatusDate = miStatusDate;
		this.miActive = miActive;
		this.miImportance = miImportance;
		this.diagnosisType = diagnosisType;
	}

	@XmlAttribute
	@Id
	public int getMi_Id() {
		return mi_Id;
	}
	public int getSupMI_Id() {
		return supMI_Id;
	}
	public int getPatient_Id() {
		return patient_Id;
	}
	public int getRespUnit_Id() {
		return respUnit_Id;
	}
	public int getToRespUnit_Id() {
		return toRespUnit_Id;
	}
	public int getFromRespUnit_Id() {
		return fromRespUnit_Id;
	}
	public int getObject_Id() {
		return object_Id;
	}
	public int getContact_Id() {
		return contact_Id;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public int getToUser_Id() {
		return toUser_Id;
	}
	public int getFromUser_Id() {
		return fromUser_Id;
	}
	public String getMiClass() {
		return miClass;
	}
	public String getMiCode() {
		return miCode;
	}
	public abstract String getMiType();
	
	public String getMiText() {
		return miText;
	}
	public String getMiCategory() {
		return miCategory;
	}
	public int getMiCertainty() {
		return miCertainty;
	}
	public Date getMiDate() {
		return miDate;
	}
	public Date getMiEndDate() {
		return miEndDate;
	}
	public String getMiRelative() {
		return miRelative;
	}
	public Boolean getIsAffectsPatient() {
		return isAffectsPatient;
	}
	public Boolean getIsNegative() {
		return isNegative;
	}
	public int getRank() {
		return rank;
	}
	public String getRemark() {
		return remark;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public String getCheckSum() {
		return checkSum;
	}
	public String getMsoda() {
		return msoda;
	}
	public Boolean getIsArchived() {
		return isArchived;
	}
	public Date getArchiveDateTime() {
		return archiveDateTime;
	}
	public int getUserStamp() {
		return userStamp;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public Date getVstartDate() {
		return vstartDate;
	}
	public int getMiStatus() {
		return miStatus;
	}
	public Date getMiStatusDate() {
		return miStatusDate;
	}
	public MIActive getMiActive() {
		return miActive;
	}
	public MIImportance getMiImportance() {
		return miImportance;
	}
	public DiagnosisType getDiagnosisType() {
		return diagnosisType;
	}
	public void setMi_Id(int mi_Id) {
		this.mi_Id = mi_Id;
	}
	public void setSupMI_Id(int supMI_Id) {
		this.supMI_Id = supMI_Id;
	}
	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}
	public void setRespUnit_Id(int respUnit_Id) {
		this.respUnit_Id = respUnit_Id;
	}
	public void setToRespUnit_Id(int toRespUnit_Id) {
		this.toRespUnit_Id = toRespUnit_Id;
	}
	public void setFromRespUnit_Id(int fromRespUnit_Id) {
		this.fromRespUnit_Id = fromRespUnit_Id;
	}
	public void setObject_Id(int object_Id) {
		this.object_Id = object_Id;
	}
	public void setContact_Id(int contact_Id) {
		this.contact_Id = contact_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public void setToUser_Id(int toUser_Id) {
		this.toUser_Id = toUser_Id;
	}
	public void setFromUser_Id(int fromUser_Id) {
		this.fromUser_Id = fromUser_Id;
	}
	public void setMiClass(String miClass) {
		this.miClass = miClass;
	}
	public void setMiCode(String miCode) {
		this.miCode = miCode;
	}
	//public abstract void setMiType(String miType) ;
	
	public void setMiText(String miText) {
		this.miText = miText;
	}
	public void setMiCategory(String miCategory) {
		this.miCategory = miCategory;
	}
	public void setMiCertainty(int miCertainty) {
		this.miCertainty = miCertainty;
	}
	public void setMiDate(Date miDate) {
		this.miDate = miDate;
	}
	public void setMiEndDate(Date miEndDate) {
		this.miEndDate = miEndDate;
	}
	public void setMiRelative(String miRelative) {
		this.miRelative = miRelative;
	}
	public void setIsAffectsPatient(Boolean isAffectsPatient) {
		this.isAffectsPatient = isAffectsPatient;
	}
	public void setIsNegative(Boolean isNegative) {
		this.isNegative = isNegative;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	public void setMsoda(String msoda) {
		this.msoda = msoda;
	}
	public void setIsArchived(Boolean isArchived) {
		this.isArchived = isArchived;
	}
	public void setArchiveDateTime(Date archiveDateTime) {
		this.archiveDateTime = archiveDateTime;
	}
	public void setUserStamp(int userStamp) {
		this.userStamp = userStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public void setVstartDate(Date vstartDate) {
		this.vstartDate = vstartDate;
	}
	public void setMiStatus(int miStatus) {
		this.miStatus = miStatus;
	}
	public void setMiStatusDate(Date miStatusDate) {
		this.miStatusDate = miStatusDate;
	}
	public void setMiActive(MIActive miActive) {
		this.miActive = miActive;
	}
	public void setMiImportance(MIImportance miImportance) {
		this.miImportance = miImportance;
	}
	public void setDiagnosisType(DiagnosisType diagnosisType) {
		this.diagnosisType = diagnosisType;
	}
	@Override
	public String toString() {
		return "Pami [mi_Id=" + mi_Id + ", supMI_Id=" + supMI_Id
				+ ", patient_Id=" + patient_Id + ", respUnit_Id=" + respUnit_Id
				+ ", toRespUnit_Id=" + toRespUnit_Id + ", fromRespUnit_Id="
				+ fromRespUnit_Id + ", object_Id=" + object_Id
				+ ", contact_Id=" + contact_Id + ", user_Id=" + user_Id
				+ ", toUser_Id=" + toUser_Id + ", fromUser_Id=" + fromUser_Id
				+ ", miClass=" + miClass + ", miCode=" + miCode + ", miType="
				+ miType + ", miText=" + miText + ", miCategory=" + miCategory
				+ ", miCertainty=" + miCertainty + ", miDate=" + miDate
				+ ", miEndDate=" + miEndDate + ", miRelative=" + miRelative
				+ ", isAffectsPatient=" + isAffectsPatient + ", isNegative="
				+ isNegative + ", rank=" + rank + ", remark=" + remark
				+ ", quantity=" + quantity + ", accessKey=" + accessKey
				+ ", checkSum=" + checkSum + ", msoda=" + msoda
				+ ", isArchived=" + isArchived + ", archiveDateTime="
				+ archiveDateTime + ", userStamp=" + userStamp + ", timeStamp="
				+ timeStamp + ", vstartDate=" + vstartDate + ", miStatus="
				+ miStatus + ", miStatusDate=" + miStatusDate + ", miActive="
				+ miActive + ", miImportance=" + miImportance
				+ ", diagnosisType=" + diagnosisType + "]";
	}	



}
