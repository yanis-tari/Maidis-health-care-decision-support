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
public class VaccinePrescription extends Pami implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -3930093025794062907L;
	private String codedPosology;
	private Double duration;
	private Date endDate;
	private Boolean isALD;
	private Boolean isFreePosology;
	private Double nBox;
	private String posology;
	private String reason;
	private String route;
	private Date startDate;
	private String unit;
	private Double vaAlertId;
	private Double vaCommID;
	private Double vaCreateByType;
	private Date vaDate;
	private String vaDateType;
	private Boolean vaIsBooster;
	private Boolean vaIsValence;
	private Double vaNbDoses;
	private String vaNext;
	private String vaNumBooster;
	private Double vaPerformedByType;
	private String vaPrev;
	
	
	
	public VaccinePrescription(int mi_Id, int supMI_Id, int patient_Id,
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
			Date endDate, Boolean isALD, Boolean isFreePosology, Double nBox,
			String posology, String reason, String route, Date startDate,
			String unit, Double vaAlertId, Double vaCommID,
			Double vaCreateByType, Date vaDate, String vaDateType,
			Boolean vaIsBooster, Boolean vaIsValence, Double vaNbDoses,
			String vaNext, String vaNumBooster, Double vaPerformedByType,
			String vaPrev) {
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
		this.reason = reason;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
		this.vaAlertId = vaAlertId;
		this.vaCommID = vaCommID;
		this.vaCreateByType = vaCreateByType;
		this.vaDate = vaDate;
		this.vaDateType = vaDateType;
		this.vaIsBooster = vaIsBooster;
		this.vaIsValence = vaIsValence;
		this.vaNbDoses = vaNbDoses;
		this.vaNext = vaNext;
		this.vaNumBooster = vaNumBooster;
		this.vaPerformedByType = vaPerformedByType;
		this.vaPrev = vaPrev;
	}

	public VaccinePrescription(int mi_Id, int supMI_Id, int patient_Id,
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

	public VaccinePrescription(String codedPosology, Double duration,
			Date endDate, Boolean isALD, Boolean isFreePosology, Double nBox,
			String posology, String reason, String route, Date startDate,
			String unit, Double vaAlertId, Double vaCommID,
			Double vaCreateByType, Date vaDate, String vaDateType,
			Boolean vaIsBooster, Boolean vaIsValence, Double vaNbDoses,
			String vaNext, String vaNumBooster, Double vaPerformedByType,
			String vaPrev) {
		super();
		this.codedPosology = codedPosology;
		this.duration = duration;
		this.endDate = endDate;
		this.isALD = isALD;
		this.isFreePosology = isFreePosology;
		this.nBox = nBox;
		this.posology = posology;
		this.reason = reason;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
		this.vaAlertId = vaAlertId;
		this.vaCommID = vaCommID;
		this.vaCreateByType = vaCreateByType;
		this.vaDate = vaDate;
		this.vaDateType = vaDateType;
		this.vaIsBooster = vaIsBooster;
		this.vaIsValence = vaIsValence;
		this.vaNbDoses = vaNbDoses;
		this.vaNext = vaNext;
		this.vaNumBooster = vaNumBooster;
		this.vaPerformedByType = vaPerformedByType;
		this.vaPrev = vaPrev;
	}
	
	public VaccinePrescription() {
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
	public Boolean isALD() {
		return isALD;
	}
	public Boolean isFreePosology() {
		return isFreePosology;
	}
	public Double getnBox() {
		return nBox;
	}
	public String getPosology() {
		return posology;
	}
	public String getReason() {
		return reason;
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
	public Double getVaCreateByType() {
		return vaCreateByType;
	}
	public Date getVaDate() {
		return vaDate;
	}
	public String getVaDateType() {
		return vaDateType;
	}
	public Boolean isVaIsBooster() {
		return vaIsBooster;
	}
	public Boolean isVaIsValence() {
		return vaIsValence;
	}
	public Double getVaNbDoses() {
		return vaNbDoses;
	}
	public String getVaNext() {
		return vaNext;
	}
	public String getVaNumBooster() {
		return vaNumBooster;
	}
	public Double getVaPerformedByType() {
		return vaPerformedByType;
	}
	public String getVaPrev() {
		return vaPrev;
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
	public void setALD(Boolean isALD) {
		this.isALD = isALD;
	}
	public void setFreePosology(Boolean isFreePosology) {
		this.isFreePosology = isFreePosology;
	}
	public void setnBox(Double nBox) {
		this.nBox = nBox;
	}
	public void setPosology(String posology) {
		this.posology = posology;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
	public void setVaCreateByType(Double vaCreateByType) {
		this.vaCreateByType = vaCreateByType;
	}
	public void setVaDate(Date vaDate) {
		this.vaDate = vaDate;
	}
	public void setVaDateType(String vaDateType) {
		this.vaDateType = vaDateType;
	}
	public void setVaIsBooster(Boolean vaIsBooster) {
		this.vaIsBooster = vaIsBooster;
	}
	public void setVaIsValence(Boolean vaIsValence) {
		this.vaIsValence = vaIsValence;
	}
	public void setVaNbDoses(Double vaNbDoses) {
		this.vaNbDoses = vaNbDoses;
	}
	public void setVaNext(String vaNext) {
		this.vaNext = vaNext;
	}
	public void setVaNumBooster(String vaNumBooster) {
		this.vaNumBooster = vaNumBooster;
	}
	public void setVaPerformedByType(Double vaPerformedByType) {
		this.vaPerformedByType = vaPerformedByType;
	}
	public void setVaPrev(String vaPrev) {
		this.vaPrev = vaPrev;
	}
	@Transient
	@Override
	public String toString() {
		return "VaccinePrescription [codedPosology=" + codedPosology
				+ ", duration=" + duration + ", endDate=" + endDate
				+ ", isALD=" + isALD + ", isFreePosology=" + isFreePosology
				+ ", nBox=" + nBox + ", posology=" + posology + ", reason="
				+ reason + ", route=" + route + ", startDate=" + startDate
				+ ", unit=" + unit + ", vaAlertId=" + vaAlertId + ", vaCommID="
				+ vaCommID + ", vaCreateByType=" + vaCreateByType + ", vaDate="
				+ vaDate + ", vaDateType=" + vaDateType + ", vaIsBooster="
				+ vaIsBooster + ", vaIsValence=" + vaIsValence + ", vaNbDoses="
				+ vaNbDoses + ", vaNext=" + vaNext + ", vaNumBooster="
				+ vaNumBooster + ", vaPerformedByType=" + vaPerformedByType
				+ ", vaPrev=" + vaPrev + ", getMi_Id()=" + getMi_Id()
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
				+ getDiagnosisType() +"]";
	}
}
