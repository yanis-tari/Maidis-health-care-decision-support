package com.mds.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import thewebsemantic.Namespace;
import thewebsemantic.Transient;

@XmlRootElement(name="drug")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class Drug extends Pami implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -8919707425736382772L;	

	private Date aldEndDate;
	private String chapter;
	private String codedPosology;//ok
	private Double Duration;//ok
	private Date endDate;//MdsDateTime
	private Boolean isALD;//
	private Boolean isDCI;//
	private Boolean isFreePosology;//
	private Boolean isFreeText;//
	private String mention;
	private String mentionDCI;
	private Double nBox;//int
	private Boolean not_substitute;//
	private String pathology;//
	private String posology;//	
	private String  prescription;
	private String reason;//
	private String route;//
	private Date startDate;//MdsDateTime
	private String unit;//
	public Drug(Date aldEndDate, String chapter, String codedPosology,
			Double duration, Date endDate, Boolean isALD, Boolean isDCI,
			Boolean isFreePosology, Boolean isFreeText, String mention,
			String mentionDCI, Double nBox, Boolean not_substitute,
			String pathology, String posology, String prescription,
			String reason, String route, Date startDate, String unit) {
		super();
		this.aldEndDate = aldEndDate;
		this.chapter = chapter;
		this.codedPosology = codedPosology;
		Duration = duration;
		this.endDate = endDate;
		this.isALD = isALD;
		this.isDCI = isDCI;
		this.isFreePosology = isFreePosology;
		this.isFreeText = isFreeText;
		this.mention = mention;
		this.mentionDCI = mentionDCI;
		this.nBox = nBox;
		this.not_substitute = not_substitute;
		this.pathology = pathology;
		this.posology = posology;
		this.prescription = prescription;
		this.reason = reason;
		this.route = route;
		this.startDate = startDate;
		this.unit = unit;
	}
	public Drug() {
		super();
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getAldEndDate() {
		return aldEndDate;
	}
	public String getChapter() {
		return chapter;
	}
	public String getCodedPosology() {
		return codedPosology;
	}
	public Double getDuration() {
		return Duration;
	}
	public Date getEndDate() {
		return endDate;
	}
	public Boolean isALD() {
		return isALD;
	}
	public Boolean isDCI() {
		return isDCI;
	}
	public Boolean isFreePosology() {
		return isFreePosology;
	}
	public Boolean isFreeText() {
		return isFreeText;
	}
	public String getMention() {
		return mention;
	}
	public String getMentionDCI() {
		return mentionDCI;
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
	public String getPrescription() {
		return prescription;
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
	public void setAldEndDate(Date aldEndDate) {
		this.aldEndDate = aldEndDate;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public void setCodedPosology(String codedPosology) {
		this.codedPosology = codedPosology;
	}
	public void setDuration(Double duration) {
		Duration = duration;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setALD(Boolean isALD) {
		this.isALD = isALD;
	}
	public void setDCI(Boolean isDCI) {
		this.isDCI = isDCI;
	}
	public void setFreePosology(Boolean isFreePosology) {
		this.isFreePosology = isFreePosology;
	}
	public void setFreeText(Boolean isFreeText) {
		this.isFreeText = isFreeText;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public void setMentionDCI(String mentionDCI) {
		this.mentionDCI = mentionDCI;
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
	public void setPrescription(String prescription) {
		this.prescription = prescription;
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
	@Transient
	@Override
	public String toString() {
		return "Drug [aldEndDate=" + aldEndDate + ", chapter=" + chapter
				+ ", codedPosology=" + codedPosology + ", Duration=" + Duration
				+ ", endDate=" + endDate + ", isALD=" + isALD + ", isDCI="
				+ isDCI + ", isFreePosology=" + isFreePosology
				+ ", isFreeText=" + isFreeText + ", mention=" + mention
				+ ", mentionDCI=" + mentionDCI + ", nBox=" + nBox
				+ ", not_substitute=" + not_substitute + ", pathology="
				+ pathology + ", posology=" + posology + ", prescription="
				+ prescription + ", reason=" + reason + ", route=" + route
				+ ", startDate=" + startDate + ", unit=" + unit
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
