package com.mds.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import thewebsemantic.Namespace;
import thewebsemantic.Transient;

import com.mds.beans.type.DiagnosisType;
import com.mds.beans.type.MIActive;
import com.mds.beans.type.MIImportance;

@XmlRootElement(name="realizedExam")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class RealizedExam extends Pami implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8747872284202225129L;
	private String MaxNormalValue;
	private String MaxNormalValue2;
	private String MinNormalValue;
	private String MinNormalValue2;
	private String Value;

	
	
	public RealizedExam(int mi_Id, int supMI_Id, int patient_Id,
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
			DiagnosisType diagnosisType, String maxNormalValue,
			String maxNormalValue2, String minNormalValue,
			String minNormalValue2, String value) {
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
		MaxNormalValue = maxNormalValue;
		MaxNormalValue2 = maxNormalValue2;
		MinNormalValue = minNormalValue;
		MinNormalValue2 = minNormalValue2;
		Value = value;
	}

	public RealizedExam(int mi_Id, int supMI_Id, int patient_Id,
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
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
	}

	public RealizedExam(String maxNormalValue, String maxNormalValue2,
			String minNormalValue, String minNormalValue2, String value) {
		super();
		MaxNormalValue = maxNormalValue;
		MaxNormalValue2 = maxNormalValue2;
		MinNormalValue = minNormalValue;
		MinNormalValue2 = minNormalValue2;
		Value = value;
	}

	public RealizedExam() {
		super();
	}
	public String getMaxNormalValue() {
		return MaxNormalValue;
	}
	public String getMaxNormalValue2() {
		return MaxNormalValue2;
	}
	public String getMinNormalValue() {
		return MinNormalValue;
	}
	public String getMinNormalValue2() {
		return MinNormalValue2;
	}
	public String getValue() {
		return Value;
	}
	public void setMaxNormalValue(String maxNormalValue) {
		MaxNormalValue = maxNormalValue;
	}
	public void setMaxNormalValue2(String maxNormalValue2) {
		MaxNormalValue2 = maxNormalValue2;
	}
	public void setMinNormalValue(String minNormalValue) {
		MinNormalValue = minNormalValue;
	}
	public void setMinNormalValue2(String minNormalValue2) {
		MinNormalValue2 = minNormalValue2;
	}
	public void setValue(String value) {
		Value = value;
	}
	@Transient
	@Override
	public String toString() {
		return "RealizedExam [MaxNormalValue=" + MaxNormalValue
				+ ", MaxNormalValue2=" + MaxNormalValue2 + ", MinNormalValue="
				+ MinNormalValue + ", MinNormalValue2=" + MinNormalValue2
				+ ", Value=" + Value + ", getMi_Id()=" + getMi_Id()
				+ ", getSupMI_Id()=" + getSupMI_Id() + ", getPatient_Id()="
				+ getPatient_Id() + ", getRespUnit_Id()=" + getRespUnit_Id()
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
				+ getDiagnosisType()+ "]";
	}

	
	
}
