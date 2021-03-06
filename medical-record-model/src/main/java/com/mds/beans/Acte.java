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

@XmlRootElement(name="acte")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class Acte extends Pami implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -258215882489269358L;
	private String codedPosology;
	private Double duration;
	private Date endDate;
	private Boolean isALD ;
	private Boolean isFreePosology;
	private Double nBox;
	private String posology;
	private String route;
	private Date startDate;
	private String unit;
	private Double vaAlertId;
	private Double vaCommID;
	private String vaCreateBy;
	private Double vaCreateByType;
	private Date vaDate;
	private String vaDateType;
	private Boolean vaIsPrimo;
	private Boolean vaIsVaccin;
	private Double vaNumber;
	private String vaPerformedBy;
	private Double vaPerformedByType;
	private Boolean isMainProc;
	private String location;
	private Boolean not_substitute;
	private String pathology;
	private String reason;
	private String teeths;
	
	
	
	public Acte(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
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
			DiagnosisType diagnosisType, String codedPosology, Double duration,
			Date endDate, Boolean isALD, Boolean isFreePosology, Double nBox,
			String posology, String route, Date startDate, String unit,
			Double vaAlertId, Double vaCommID, String vaCreateBy,
			Double vaCreateByType, Date vaDate, String vaDateType,
			Boolean vaIsPrimo, Boolean vaIsVaccin, Double vaNumber,
			String vaPerformedBy, Double vaPerformedByType, Boolean isMainProc,
			String location, Boolean not_substitute, String pathology,
			String reason, String teeths) {
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
		this.isALD = isALD;
		this.isFreePosology = isFreePosology;
		this.nBox = nBox;
		this.posology = posology;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
		this.vaAlertId = vaAlertId;
		this.vaCommID = vaCommID;
		this.vaCreateBy = vaCreateBy;
		this.vaCreateByType = vaCreateByType;
		this.vaDate = vaDate;
		this.vaDateType = vaDateType;
		this.vaIsPrimo = vaIsPrimo;
		this.vaIsVaccin = vaIsVaccin;
		this.vaNumber = vaNumber;
		this.vaPerformedBy = vaPerformedBy;
		this.vaPerformedByType = vaPerformedByType;
		this.isMainProc = isMainProc;
		this.location = location;
		this.not_substitute = not_substitute;
		this.pathology = pathology;
		this.reason = reason;
		this.teeths = teeths;
	}
	
	

	public Acte(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
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



	public Acte(String codedPosology, Double duration, Date endDate,
			Boolean isALD, Boolean isFreePosology, Double nBox,
			String posology, String route, Date startDate, String unit,
			Double vaAlertId, Double vaCommID, String vaCreateBy,
			Double vaCreateByType, Date vaDate, String vaDateType,
			Boolean vaIsPrimo, Boolean vaIsVaccin, Double vaNumber,
			String vaPerformedBy, Double vaPerformedByType, Boolean isMainProc,
			String location, Boolean not_substitute, String pathology,
			String reason, String teeths) {
		super();
		this.codedPosology = codedPosology;
		this.duration = duration;
		this.endDate = endDate;
		this.isALD = isALD;
		this.isFreePosology = isFreePosology;
		this.nBox = nBox;
		this.posology = posology;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
		this.vaAlertId = vaAlertId;
		this.vaCommID = vaCommID;
		this.vaCreateBy = vaCreateBy;
		this.vaCreateByType = vaCreateByType;
		this.vaDate = vaDate;
		this.vaDateType = vaDateType;
		this.vaIsPrimo = vaIsPrimo;
		this.vaIsVaccin = vaIsVaccin;
		this.vaNumber = vaNumber;
		this.vaPerformedBy = vaPerformedBy;
		this.vaPerformedByType = vaPerformedByType;
		this.isMainProc = isMainProc;
		this.location = location;
		this.not_substitute = not_substitute;
		this.pathology = pathology;
		this.reason = reason;
		this.teeths = teeths;
	}

	public Acte() {
		super();
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	
	public Boolean getIsALD() {
		return isALD;
	}
	
	public Boolean getIsFreePosology() {
		return isFreePosology;
	}
	
	public Double getnBox() {
		return nBox;
	}
	
	public String getPosology() {
		return posology;
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
	
	public Double getVaAlertId() {
		return vaAlertId;
	}
	
	public Double getVaCommID() {
		return vaCommID;
	}
	
	public String getVaCreateBy() {
		return vaCreateBy;
	}
	
	public Double getVaCreateByType() {
		return vaCreateByType;
	}
	
	public Date getVaDate() {
		return vaDate;
	}
	
	public String getVaDateType() {
		return vaDateType;
	}
	
	public Boolean getVaIsPrimo() {
		return vaIsPrimo;
	}
	
	public Boolean getVaIsVaccin() {
		return vaIsVaccin;
	}
	
	public Double getVaNumber() {
		return vaNumber;
	}
	
	public String getVaPerformedBy() {
		return vaPerformedBy;
	}
	
	public Double getVaPerformedByType() {
		return vaPerformedByType;
	}
	
	public Boolean getIsMainProc() {
		return isMainProc;
	}
	
	public String getLocation() {
		return location;
	}
	
	public Boolean getNot_substitute() {
		return not_substitute;
	}
	
	public String getPathology() {
		return pathology;
	}
	
	public String getReason() {
		return reason;
	}
	
	public String getTeeths() {
		return teeths;
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
	public void setIsALD(Boolean isALD) {
		this.isALD = isALD;
	}
	public void setIsFreePosology(Boolean isFreePosology) {
		this.isFreePosology = isFreePosology;
	}
	public void setnBox(Double nBox) {
		this.nBox = nBox;
	}
	public void setPosology(String posology) {
		this.posology = posology;
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
	public void setVaAlertId(Double vaAlertId) {
		this.vaAlertId = vaAlertId;
	}
	public void setVaCommID(Double vaCommID) {
		this.vaCommID = vaCommID;
	}
	public void setVaCreateBy(String vaCreateBy) {
		this.vaCreateBy = vaCreateBy;
	}
	public void setVaCreateByType(Double vaCreateByType) {
		this.vaCreateByType = vaCreateByType;
	}
	public void setVaDate(Date vaDate) {
		this.vaDate = vaDate;
	}
	public void setVaDateType(String vaDateType) {
		this.vaDateType = vaDateType;
	}
	public void setVaIsPrimo(Boolean vaIsPrimo) {
		this.vaIsPrimo = vaIsPrimo;
	}
	public void setVaIsVaccin(Boolean vaIsVaccin) {
		this.vaIsVaccin = vaIsVaccin;
	}
	public void setVaNumber(Double vaNumber) {
		this.vaNumber = vaNumber;
	}
	public void setVaPerformedBy(String vaPerformedBy) {
		this.vaPerformedBy = vaPerformedBy;
	}
	public void setVaPerformedByType(Double vaPerformedByType) {
		this.vaPerformedByType = vaPerformedByType;
	}
	public void setIsMainProc(Boolean isMainProc) {
		this.isMainProc = isMainProc;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setNot_substitute(Boolean not_substitute) {
		this.not_substitute = not_substitute;
	}
	public void setPathology(String pathology) {
		this.pathology = pathology;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setTeeths(String teeths) {
		this.teeths = teeths;
	}


	@Transient
	@Override
	public String toString() {
		return "Acte [codedPosology=" + codedPosology + ", duration="
				+ duration + ", endDate=" + endDate + ", isALD=" + isALD
				+ ", isFreePosology=" + isFreePosology + ", nBox=" + nBox
				+ ", posology=" + posology + ", route=" + route
				+ ", startDate=" + startDate + ", unit=" + unit
				+ ", vaAlertId=" + vaAlertId + ", vaCommID=" + vaCommID
				+ ", vaCreateBy=" + vaCreateBy + ", vaCreateByType="
				+ vaCreateByType + ", vaDate=" + vaDate + ", vaDateType="
				+ vaDateType + ", vaIsPrimo=" + vaIsPrimo + ", vaIsVaccin="
				+ vaIsVaccin + ", vaNumber=" + vaNumber + ", vaPerformedBy="
				+ vaPerformedBy + ", vaPerformedByType=" + vaPerformedByType
				+ ", isMainProc=" + isMainProc + ", location=" + location
				+ ", not_substitute=" + not_substitute + ", pathology="
				+ pathology + ", reason=" + reason + ", teeths=" + teeths
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
