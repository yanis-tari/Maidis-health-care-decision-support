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

@XmlRootElement(name="radiologicalExamResult")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class RadiologicalExamResult extends Pami implements Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -5971009558259488445L;
	private Double ImageBlob_1;     
	private Double ImageBlob_2;     
	private Double ImageCount ;     
	private String ImageDesc_1;         
	private String ImageDesc_2;         
	private String RequestNumber;
	
	
	
	public RadiologicalExamResult(int mi_Id, int supMI_Id, int patient_Id,
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
			DiagnosisType diagnosisType, Double imageBlob_1,
			Double imageBlob_2, Double imageCount, String imageDesc_1,
			String imageDesc_2, String requestNumber) {
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
		ImageBlob_1 = imageBlob_1;
		ImageBlob_2 = imageBlob_2;
		ImageCount = imageCount;
		ImageDesc_1 = imageDesc_1;
		ImageDesc_2 = imageDesc_2;
		RequestNumber = requestNumber;
	}

	public RadiologicalExamResult(int mi_Id, int supMI_Id, int patient_Id,
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

	public RadiologicalExamResult(Double imageBlob_1, Double imageBlob_2,
			Double imageCount, String imageDesc_1, String imageDesc_2,
			String requestNumber) {
		super();
		ImageBlob_1 = imageBlob_1;
		ImageBlob_2 = imageBlob_2;
		ImageCount = imageCount;
		ImageDesc_1 = imageDesc_1;
		ImageDesc_2 = imageDesc_2;
		RequestNumber = requestNumber;
	}
	
	public RadiologicalExamResult() {
		super();
	}
	public Double getImageBlob_1() {
		return ImageBlob_1;
	}
	public Double getImageBlob_2() {
		return ImageBlob_2;
	}
	public Double getImageCount() {
		return ImageCount;
	}
	public String getImageDesc_1() {
		return ImageDesc_1;
	}
	public String getImageDesc_2() {
		return ImageDesc_2;
	}
	public String getRequestNumber() {
		return RequestNumber;
	}
	public void setImageBlob_1(Double imageBlob_1) {
		ImageBlob_1 = imageBlob_1;
	}
	public void setImageBlob_2(Double imageBlob_2) {
		ImageBlob_2 = imageBlob_2;
	}
	public void setImageCount(Double imageCount) {
		ImageCount = imageCount;
	}
	public void setImageDesc_1(String imageDesc_1) {
		ImageDesc_1 = imageDesc_1;
	}
	public void setImageDesc_2(String imageDesc_2) {
		ImageDesc_2 = imageDesc_2;
	}
	public void setRequestNumber(String requestNumber) {
		RequestNumber = requestNumber;
	}
	@Transient
	@Override
	public String toString() {
		return "RadiologicalExamResult [ImageBlob_1=" + ImageBlob_1
				+ ", ImageBlob_2=" + ImageBlob_2 + ", ImageCount=" + ImageCount
				+ ", ImageDesc_1=" + ImageDesc_1 + ", ImageDesc_2="
				+ ImageDesc_2 + ", RequestNumber=" + RequestNumber
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
				+ getDiagnosisType()+ "]";
	}
	
	
	
}
