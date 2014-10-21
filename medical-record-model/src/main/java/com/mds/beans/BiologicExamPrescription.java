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

@XmlRootElement(name="vaccinePrescription")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class BiologicExamPrescription extends Pami implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -211412219604088725L;
	private String codedPosology;
	private Double duration;
	private Date endDate;
	private Double examTerm_Id;
	private Boolean isALD;
	private Boolean isFreePosology;
	private Boolean isImmediate;
	private Double nBox;
	private Boolean not_substitute;
	private String pathology;
	private String posology;
	private String reason;
	private Date receptionDate;
	private String route;
	private Date startDate;
	private String unit;
	
	
	
	public BiologicExamPrescription(int mi_Id, int supMI_Id, int patient_Id,
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
			DiagnosisType diagnosisType, String codedPosology, Double duration,
			Date endDate, Double examTerm_Id, Boolean isALD,
			Boolean isFreePosology, Boolean isImmediate, Double nBox,
			Boolean not_substitute, String pathology, String posology,
			String reason, Date receptionDate, String route, Date startDate,
			String unit) {
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
		this.codedPosology = codedPosology;
		this.duration = duration;
		this.endDate = endDate;
		this.examTerm_Id = examTerm_Id;
		this.isALD = isALD;
		this.isFreePosology = isFreePosology;
		this.isImmediate = isImmediate;
		this.nBox = nBox;
		this.not_substitute = not_substitute;
		this.pathology = pathology;
		this.posology = posology;
		this.reason = reason;
		this.receptionDate = receptionDate;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
	}

	public BiologicExamPrescription(int mi_Id, int supMI_Id, int patient_Id,
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

	public BiologicExamPrescription(String codedPosology, Double duration,
			Date endDate, Double examTerm_Id, Boolean isALD,
			Boolean isFreePosology, Boolean isImmediate, Double nBox,
			Boolean not_substitute, String pathology, String posology,
			String reason, Date receptionDate, String route, Date startDate,
			String unit) {
		super();
		this.codedPosology = codedPosology;
		this.duration = duration;
		this.endDate = endDate;
		this.examTerm_Id = examTerm_Id;
		this.isALD = isALD;
		this.isFreePosology = isFreePosology;
		this.isImmediate = isImmediate;
		this.nBox = nBox;
		this.not_substitute = not_substitute;
		this.pathology = pathology;
		this.posology = posology;
		this.reason = reason;
		this.receptionDate = receptionDate;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
	}
	
	public BiologicExamPrescription() {
		super();
	}
	public String getCodedPosology() {
		return codedPosology;
	}
	public Double getDuration() {
		return duration;
	}
	public Date getEndDate() {
		return endDate;
	}
	public Double getExamTerm_Id() {
		return examTerm_Id;
	}
	public Boolean isALD() {
		return isALD;
	}
	public Boolean isFreePosology() {
		return isFreePosology;
	}
	public Boolean isImmediate() {
		return isImmediate;
	}
	public Double getnBox() {
		return nBox;
	}
	public Boolean isNot_substitute() {
		return not_substitute;
	}
	public String getPathology() {
		return pathology;
	}
	public String getPosology() {
		return posology;
	}
	public String getReason() {
		return reason;
	}
	public Date getReceptionDate() {
		return receptionDate;
	}
	public String getRoute() {
		return route;
	}
	public Date getStartDate() {
		return startDate;
	}
	public String getUnit() {
		return unit;
	}
	public void setCodedPosology(String codedPosology) {
		this.codedPosology = codedPosology;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setExamTerm_Id(Double examTerm_Id) {
		this.examTerm_Id = examTerm_Id;
	}
	public void setALD(Boolean isALD) {
		this.isALD = isALD;
	}
	public void setFreePosology(Boolean isFreePosology) {
		this.isFreePosology = isFreePosology;
	}
	public void setImmediate(Boolean isImmediate) {
		this.isImmediate = isImmediate;
	}
	public void setnBox(Double nBox) {
		this.nBox = nBox;
	}
	public void setNot_substitute(Boolean not_substitute) {
		this.not_substitute = not_substitute;
	}
	public void setPathology(String pathology) {
		this.pathology = pathology;
	}
	public void setPosology(String posology) {
		this.posology = posology;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setReceptionDate(Date receptionDate) {
		this.receptionDate = receptionDate;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Transient
	@Override
	public String toString() {
		return "BiologicExamPrescription [codedPosology=" + codedPosology
				+ ", duration=" + duration + ", endDate=" + endDate
				+ ", examTerm_Id=" + examTerm_Id + ", isALD=" + isALD
				+ ", isFreePosology=" + isFreePosology + ", isImmediate="
				+ isImmediate + ", nBox=" + nBox + ", not_substitute="
				+ not_substitute + ", pathology=" + pathology + ", posology="
				+ posology + ", reason=" + reason + ", receptionDate="
				+ receptionDate + ", route=" + route + ", startDate="
				+ startDate + ", unit=" + unit + ", getMi_Id()=" + getMi_Id()
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
