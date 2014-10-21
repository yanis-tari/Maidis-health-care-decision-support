package com.mds.beans;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.mds.beans.type.DiagnosisType;
import com.mds.beans.type.MIActive;
import com.mds.beans.type.MIImportance;

import thewebsemantic.Namespace;
import thewebsemantic.Transient;


@XmlRootElement(name = "pathology")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class Pathology extends Pami implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -808439551653629141L;
	private String chapter;         
	private String location;
	private String startAge;
	private String teeths;
	
	
	
	
	public Pathology(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
			int toRespUnit_Id, int fromRespUnit_Id, int object_Id,
			int contact_Id, int user_Id, int toUser_Id, int fromUser_Id,
			String miClass, String miCode, String miType, String miText,
			String miCategory, int miCertainty, Date miDate, Date miEndDate,
			String miRelative, Boolean isAffectsPatient, Boolean isNegative,
			int rank, String remark, int quantity, String accessKey,
			String checkSum, String msoda, Boolean isArchived,
			Date archiveDateTime, int userStamp, Date timeStamp,
			Date vstartDate, int miStatus, Date miStatusDate,
			MIActive miActive, MIImportance miImportance,
			DiagnosisType diagnosisType, String chapter, String location,
			String startAge, String teeths) {
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
		this.chapter = chapter;
		this.location = location;
		this.startAge = startAge;
		this.teeths = teeths;
	}
	public Pathology(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
			int toRespUnit_Id, int fromRespUnit_Id, int object_Id,
			int contact_Id, int user_Id, int toUser_Id, int fromUser_Id,
			String miClass, String miCode, String miType, String miText,
			String miCategory, int miCertainty, Date miDate, Date miEndDate,
			String miRelative, Boolean isAffectsPatient, Boolean isNegative,
			int rank, String remark, int quantity, String accessKey,
			String checkSum, String msoda, Boolean isArchived,
			Date archiveDateTime, int userStamp, Date timeStamp,
			Date vstartDate, int miStatus, Date miStatusDate,
			MIActive miActive, MIImportance miImportance,
			DiagnosisType diagnosisType) {
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
	}
	public Pathology(String chapter, String location, String startAge,
			String teeths) {
		super();
		this.chapter = chapter;
		this.location = location;
		this.startAge = startAge;
		this.teeths = teeths;
	}	
	public Pathology() {
		super();
	}
	public String getChapter() {
		return chapter;
	}
	public String getLocation() {
		return location;
	}
	public String getStartAge() {
		return startAge;
	}
	public String getTeeths() {
		return teeths;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStartAge(String startAge) {
		this.startAge = startAge;
	}
	public void setTeeths(String teeths) {
		this.teeths = teeths;
	}
	@Transient
	@Override
	public String toString() {
		return "Pathology [chapter=" + chapter + ", location=" + location
				+ ", startAge=" + startAge + ", teeths=" + teeths
				+ ", getMi_Id()=" + getMi_Id() + ", getSupMI_Id()="
				+ getSupMI_Id() + ", getPatient_Id()=" + getPatient_Id()
				+ ", getRespUnit_Id()=" + getRespUnit_Id()
				+ ", getToRespUnit_Id()=" + getToRespUnit_Id()
				+ ", getFromRespUnit_Id()=" + getFromRespUnit_Id()
				+ ", getObject_Id()=" + getObject_Id() + ", getContact_Id()="
				+ getContact_Id() + ", getUser_Id()=" + getUser_Id()
				+ ", getToUser_Id()=" + getToUser_Id() + ", getFromUser_Id()="
				+ getFromUser_Id() + ", getMiClass()=" + getMiClass()
				+ ", getMiCode()=" + getMiCode() + ", getMiType()="
				+ getMiType() + ", getMiText()=" + getMiText()
				+ ", getMiCategory()=" + getMiCategory()
				+ ", getMiCertainty()=" + getMiCertainty() + ", getMiDate()="
				+ getMiDate() + ", getMiEndDate()=" + getMiEndDate()
				+ ", getMiRelative()=" + getMiRelative()
				+ ", getIsAffectsPatient()=" + getIsAffectsPatient()
				+ ", getIsNegative()=" + getIsNegative() + ", getRank()="
				+ getRank() + ", getRemark()=" + getRemark()
				+ ", getQuantity()=" + getQuantity() + ", getAccessKey()="
				+ getAccessKey() + ", getCheckSum()=" + getCheckSum()
				+ ", getMsoda()=" + getMsoda() + ", getIsArchived()="
				+ getIsArchived() + ", getArchiveDateTime()="
				+ getArchiveDateTime() + ", getUserStamp()=" + getUserStamp()
				+ ", getTimeStamp()=" + getTimeStamp() + ", getVstartDate()="
				+ getVstartDate() + ", getMiStatus()=" + getMiStatus()
				+ ", getMiStatusDate()=" + getMiStatusDate()
				+ ", getMiActive()=" + getMiActive() + ", getMiImportance()="
				+ getMiImportance() + ", getDiagnosisType()="
				+ getDiagnosisType() + "]";
	}
		
}
