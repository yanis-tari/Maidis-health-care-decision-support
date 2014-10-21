package com.mds.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import thewebsemantic.Namespace;
import thewebsemantic.Transient;


@XmlRootElement(name = "simpleExam")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class SimpleExam extends Pami implements Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 4885114617321656354L;

	private  Double nValue;
	private String sValue;
	private String unit;
	public SimpleExam( Double nValue, String sValue, String unit) {
		super();
		this.nValue = nValue;
		this.sValue = sValue;
		this.unit = unit;
	}
	public SimpleExam() {
		super();
	}

	public Double getnValue() {
		return nValue;
	}
	public void setnValue(Double nValue) {
		this.nValue = nValue;
	}

	public String getsValue() {
		return sValue;
	}
	public void setsValue(String sValue) {
		this.sValue = sValue;
	}

	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Transient
	@Override
	public String toString() {
		return "SimpleExam [nValue=" + nValue + ", sValue=" + sValue + ", unit="
				+ unit + ", getMi_Id()=" + getMi_Id() + ", getSupMI_Id()="
				+ getSupMI_Id() + ", getPatient_Id()=" + getPatient_Id()
				+ ", getRespUnit_Id()=" + getRespUnit_Id()
				+ ", getToRespUnit_Id()=" + getToRespUnit_Id()
				+ ", getFromRespUnit_Id()=" + getFromRespUnit_Id()
				+ ", getObject_Id()=" + getObject_Id() + ", getContact_Id()="
				+ getContact_Id() + ", getUser_Id()=" + getUser_Id()
				+ ", getToUser_Id()=" + getToUser_Id() + ", getFromUser_Id()="
				+ getFromUser_Id() + ", getMiClass()=" + getMiClass()
				+ ", getMiCode()=" + getMiCode() + ", getMiType()=" + getMiType()
				+ ", getMiText()=" + getMiText() + ", getMiCategory()="
				+ getMiCategory() + ", getMiCertainty()=" + getMiCertainty()
				+ ", getMiDate()=" + getMiDate() + ", getMiEndDate()="
				+ getMiEndDate() + ", getMiRelative()=" + getMiRelative()
				+ ", getIsAffectsPatient()=" + getIsAffectsPatient()
				+ ", getIsNegative()=" + getIsNegative() + ", getRank()="
				+ getRank() + ", getRemark()=" + getRemark() + ", getQuantity()="
				+ getQuantity() + ", getAccessKey()=" + getAccessKey()
				+ ", getCheckSum()=" + getCheckSum() + ", getMsoda()=" + getMsoda()
				+ ", getIsArchived()=" + getIsArchived()
				+ ", getArchiveDateTime()=" + getArchiveDateTime()
				+ ", getUserStamp()=" + getUserStamp() + ", getTimeStamp()="
				+ getTimeStamp() + ", getVstartDate()=" + getVstartDate()
				+ ", getMiStatus()=" + getMiStatus() + ", getMiStatusDate()="
				+ getMiStatusDate() + ", getMiActive()=" + getMiActive()
				+ ", getMiImportance()=" + getMiImportance()
				+ ", getDiagnosisType()=" + getDiagnosisType() + "]";
	}



}
