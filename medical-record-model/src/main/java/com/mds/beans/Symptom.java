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

@XmlRootElement(name="symptom")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class Symptom extends Pami implements Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1046512486482390356L;
	private String	diagnostic;
	private String 	erytheme;
	private String inclusion;
	private Boolean	isDHL;
	private Boolean	isRC;
	private String	order;
	private String	papule;
	private String	position;
	private String	prurit;
	private String	suivi;
	private String	symptome;
	
	
	
	public Symptom(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
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
			DiagnosisType diagnosisType, String diagnostic, String erytheme,
			String inclusion, Boolean isDHL, Boolean isRC, String order,
			String papule, String position, String prurit, String suivi,
			String symptome) {
		super(mi_Id, supMI_Id, patient_Id, respUnit_Id, toRespUnit_Id,
				fromRespUnit_Id, object_Id, contact_Id, user_Id, toUser_Id,
				fromUser_Id, miClass, miCode, miType, miText, miCategory,
				miCertainty, miDate, miEndDate, miRelative, isAffectsPatient,
				isNegative, rank, remark, quantity, accessKey, checkSum, msoda,
				isArchived, archiveDateTime, userStamp, timeStamp, vstartDate,
				miStatus, miStatusDate, miActive, miImportance, diagnosisType);
		this.diagnostic = diagnostic;
		this.erytheme = erytheme;
		this.inclusion = inclusion;
		this.isDHL = isDHL;
		this.isRC = isRC;
		this.order = order;
		this.papule = papule;
		this.position = position;
		this.prurit = prurit;
		this.suivi = suivi;
		this.symptome = symptome;
	}
	public Symptom(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
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
	public Symptom(String diagnostic, String erytheme, String inclusion,
			Boolean isDHL, Boolean isRC, String order, String papule,
			String position, String prurit, String suivi, String symptome) {
		super();
		this.diagnostic = diagnostic;
		this.erytheme = erytheme;
		this.inclusion = inclusion;
		this.isDHL = isDHL;
		this.isRC = isRC;
		this.order = order;
		this.papule = papule;
		this.position = position;
		this.prurit = prurit;
		this.suivi = suivi;
		this.symptome = symptome;
	}
	public Symptom() {
		super();
	}
	
	public String getDiagnostic() {
		return diagnostic;
	}
	
	public String getErytheme() {
		return erytheme;
	}
	
	public String getInclusion() {
		return inclusion;
	}
	
	public Boolean isDHL() {
		return isDHL;
	}
	
	public Boolean isRC() {
		return isRC;
	}
	
	public String getOrder() {
		return order;
	}
	
	public String getPapule() {
		return papule;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getPrurit() {
		return prurit;
	}
	
	public String getSuivi() {
		return suivi;
	}
	
	public String getSymptome() {
		return symptome;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	public void setErytheme(String erytheme) {
		this.erytheme = erytheme;
	}
	public void setInclusion(String inclusion) {
		this.inclusion = inclusion;
	}
	public void setDHL(Boolean isDHL) {
		this.isDHL = isDHL;
	}
	public void setRC(Boolean isRC) {
		this.isRC = isRC;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public void setPapule(String papule) {
		this.papule = papule;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setPrurit(String prurit) {
		this.prurit = prurit;
	}
	public void setSuivi(String suivi) {
		this.suivi = suivi;
	}
	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}
	@Transient
	@Override
	public String toString() {
		return "Symptom [diagnostic=" + diagnostic + ", erytheme=" + erytheme
				+ ", inclusion=" + inclusion + ", isDHL=" + isDHL + ", isRC="
				+ isRC + ", order=" + order + ", papule=" + papule
				+ ", position=" + position + ", prurit=" + prurit + ", suivi="
				+ suivi + ", symptome=" + symptome + ", getMi_Id()="
				+ getMi_Id() + ", getSupMI_Id()=" + getSupMI_Id()
				+ ", getPatient_Id()=" + getPatient_Id()
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
