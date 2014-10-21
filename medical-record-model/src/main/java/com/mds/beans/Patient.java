package com.mds.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import thewebsemantic.Id;
import thewebsemantic.Namespace;
import thewebsemantic.Transient;
import thewebsemantic.binding.RdfBean;

import com.maidis.mdslib.DBV_T_Gender;
import com.mds.beans.type.ConfirmationStatus;
import com.mds.beans.type.MaritalStatus;
import com.mds.beans.type.PatientFamilyCorrespondant;


@XmlRootElement(name = "patient")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Namespace("http://maidis/medical-record#")
public class Patient extends RdfBean<Patient> implements Serializable{
	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8972204329803222545L;
	public int patient_Id;
	public int patientInsurance_Id;
	public int familyChief_Id;
	public int user_Id;
	public String civility;
	public String lastName;
	public String firstName;
	public Date birthDate;
	public String maidenName;
	public DBV_T_Gender gender;
	public MaritalStatus maritalStatus;
	public int nbChildren;
	public String profession;
	public String birthCity;
	public String birthCountry;
	public String nationality;
	public PatientFamilyCorrespondant destMail;
	public PatientFamilyCorrespondant destInvoice;
	public String mailCivility;
	public String mailLastName;
	public String mailFirstName;
	public Date deathDate;
	public Boolean isAnonym;
	public Boolean isDead;
	public Boolean isEmployed;
	public String employer;
	public Boolean isEDRate;
	public int eDRate;
	public String pin;
	public String bank;
	public String bankPlace;
	public Date creationDate;
	public Boolean isInvoiced;
	public Boolean isCareDone;
	public int color;
	public ConfirmationStatus status;
	public Boolean isDeleted;
	public String defaultAccessKey;
	public String accessKey;
	public String checkSum;
	public String globalId;
	public String remark;
	public Date timeStamp;
	public int userStamp;
	public String middleName;
	public String localFirstName;
	public String localMiddleName;
	public String localLastName;
	public String externalFileSource;
	public String externalFileId;
	public Boolean isActive;
	public Boolean isNotRealPatient;
	public String versionId;
	public Patient(int patient_Id, int patientInsurance_Id, int familyChief_Id,
			int user_Id, String civility, String lastName, String firstName,
			Date birthDate, String maidenName, DBV_T_Gender gender,
			MaritalStatus maritalStatus, int nbChildren, String profession,
			String birthCity, String birthCountry, String nationality,
			PatientFamilyCorrespondant destMail,
			PatientFamilyCorrespondant destInvoice, String mailCivility,
			String mailLastName, String mailFirstName, Date deathDate,
			Boolean isAnonym, Boolean isDead, Boolean isEmployed,
			String employer, Boolean isEDRate, int eDRate, String pin,
			String bank, String bankPlace, Date creationDate,
			Boolean isInvoiced, Boolean isCareDone, int color,
			ConfirmationStatus status, Boolean isDeleted,
			String defaultAccessKey, String accessKey, String checkSum,
			String globalId, String remark, Date timeStamp,
			int userStamp, String middleName, String localFirstName,
			String localMiddleName, String localLastName,
			String externalFileSource, String externalFileId, Boolean isActive,
			Boolean isNotRealPatient, String versionId) {
		super();
		this.patient_Id = patient_Id;
		this.patientInsurance_Id = patientInsurance_Id;
		this.familyChief_Id = familyChief_Id;
		this.user_Id = user_Id;
		this.civility = civility;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.maidenName = maidenName;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.nbChildren = nbChildren;
		this.profession = profession;
		this.birthCity = birthCity;
		this.birthCountry = birthCountry;
		this.nationality = nationality;
		this.destMail = destMail;
		this.destInvoice = destInvoice;
		this.mailCivility = mailCivility;
		this.mailLastName = mailLastName;
		this.mailFirstName = mailFirstName;
		this.deathDate = deathDate;
		this.isAnonym = isAnonym;
		this.isDead = isDead;
		this.isEmployed = isEmployed;
		this.employer = employer;
		this.isEDRate = isEDRate;
		this.eDRate = eDRate;
		this.pin = pin;
		this.bank = bank;
		this.bankPlace = bankPlace;
		this.creationDate = creationDate;
		this.isInvoiced = isInvoiced;
		this.isCareDone = isCareDone;
		this.color = color;
		this.status = status;
		this.isDeleted = isDeleted;
		this.defaultAccessKey = defaultAccessKey;
		this.accessKey = accessKey;
		this.checkSum = checkSum;
		this.globalId = globalId;
		this.remark = remark;
		this.timeStamp = timeStamp;
		this.userStamp = userStamp;
		this.middleName = middleName;
		this.localFirstName = localFirstName;
		this.localMiddleName = localMiddleName;
		this.localLastName = localLastName;
		this.externalFileSource = externalFileSource;
		this.externalFileId = externalFileId;
		this.isActive = isActive;
		this.isNotRealPatient = isNotRealPatient;
		this.versionId = versionId;
	}
	public Patient() {
		super();
	}
	@XmlAttribute
	@Id
	public int getPatient_Id() {
		return patient_Id;
	}
	
	public int getPatientInsurance_Id() {
		return patientInsurance_Id;
	}
	
	public int getFamilyChief_Id() {
		return familyChief_Id;
	}
	
	public int getUser_Id() {
		return user_Id;
	}
	
	public String getCivility() {
		return civility;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public String getMaidenName() {
		return maidenName;
	}
	
	public DBV_T_Gender getGender() {
		return gender;
	}
	
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	
	public int getNbChildren() {
		return nbChildren;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public String getBirthCity() {
		return birthCity;
	}
	
	public String getBirthCountry() {
		return birthCountry;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public PatientFamilyCorrespondant getDestMail() {
		return destMail;
	}
	
	public PatientFamilyCorrespondant getDestInvoice() {
		return destInvoice;
	}
	
	public String getMailCivility() {
		return mailCivility;
	}
	
	public String getMailLastName() {
		return mailLastName;
	}
	
	public String getMailFirstName() {
		return mailFirstName;
	}
	
	public Date getDeathDate() {
		return deathDate;
	}
	
	public Boolean isAnonym() {
		return isAnonym;
	}
	
	public Boolean isDead() {
		return isDead;
	}
	
	public Boolean isEmployed() {
		return isEmployed;
	}
	
	public String getEmployer() {
		return employer;
	}
	
	public Boolean isEDRate() {
		return isEDRate;
	}
	
	public int geteDRate() {
		return eDRate;
	}
	
	public String getPin() {
		return pin;
	}
	
	public String getBank() {
		return bank;
	}
	
	public String getBankPlace() {
		return bankPlace;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	
	public Boolean isInvoiced() {
		return isInvoiced;
	}
	
	public Boolean isCareDone() {
		return isCareDone;
	}
	
	public int getColor() {
		return color;
	}
	
	public ConfirmationStatus getStatus() {
		return status;
	}
	
	public Boolean isDeleted() {
		return isDeleted;
	}
	
	public String getDefaultAccessKey() {
		return defaultAccessKey;
	}
	
	public String getAccessKey() {
		return accessKey;
	}
	
	public String getCheckSum() {
		return checkSum;
	}
	
	public String getGlobalId() {
		return globalId;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public int getUserStamp() {
		return userStamp;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLocalFirstName() {
		return localFirstName;
	}
	
	public String getLocalMiddleName() {
		return localMiddleName;
	}
	
	public String getLocalLastName() {
		return localLastName;
	}
	
	public String getExternalFileSource() {
		return externalFileSource;
	}
	
	public String getExternalFileId() {
		return externalFileId;
	}
	
	public Boolean isActive() {
		return isActive;
	}
	
	public Boolean isNotRealPatient() {
		return isNotRealPatient;
	}
	
	public String getVersionId() {
		return versionId;
	}
	
	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}
	public void setPatientInsurance_Id(int patientInsurance_Id) {
		this.patientInsurance_Id = patientInsurance_Id;
	}
	public void setFamilyChief_Id(int familyChief_Id) {
		this.familyChief_Id = familyChief_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public void setCivility(String civility) {
		this.civility = civility;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public void setGender(DBV_T_Gender gender) {
		this.gender = gender;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public void setNbChildren(int nbChildren) {
		this.nbChildren = nbChildren;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setDestMail(PatientFamilyCorrespondant destMail) {
		this.destMail = destMail;
	}
	public void setDestInvoice(PatientFamilyCorrespondant destInvoice) {
		this.destInvoice = destInvoice;
	}
	public void setMailCivility(String mailCivility) {
		this.mailCivility = mailCivility;
	}
	public void setMailLastName(String mailLastName) {
		this.mailLastName = mailLastName;
	}
	public void setMailFirstName(String mailFirstName) {
		this.mailFirstName = mailFirstName;
	}
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}
	public void setAnonym(Boolean isAnonym) {
		this.isAnonym = isAnonym;
	}
	public void setDead(Boolean isDead) {
		this.isDead = isDead;
	}
	public void setEmployed(Boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public void setEDRate(Boolean isEDRate) {
		this.isEDRate = isEDRate;
	}
	public void seteDRate(int eDRate) {
		this.eDRate = eDRate;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public void setBankPlace(String bankPlace) {
		this.bankPlace = bankPlace;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setInvoiced(Boolean isInvoiced) {
		this.isInvoiced = isInvoiced;
	}
	public void setCareDone(Boolean isCareDone) {
		this.isCareDone = isCareDone;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public void setStatus(ConfirmationStatus status) {
		this.status = status;
	}
	public void setDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public void setDefaultAccessKey(String defaultAccessKey) {
		this.defaultAccessKey = defaultAccessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public void setUserStamp(int userStamp) {
		this.userStamp = userStamp;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLocalFirstName(String localFirstName) {
		this.localFirstName = localFirstName;
	}
	public void setLocalMiddleName(String localMiddleName) {
		this.localMiddleName = localMiddleName;
	}
	public void setLocalLastName(String localLastName) {
		this.localLastName = localLastName;
	}
	public void setExternalFileSource(String externalFileSource) {
		this.externalFileSource = externalFileSource;
	}
	public void setExternalFileId(String externalFileId) {
		this.externalFileId = externalFileId;
	}
	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public void setNotRealPatient(Boolean isNotRealPatient) {
		this.isNotRealPatient = isNotRealPatient;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	@Transient
	@Override
	public String toString() {
		return "Patient [patient_Id=" + patient_Id + ", patientInsurance_Id="
				+ patientInsurance_Id + ", familyChief_Id=" + familyChief_Id
				+ ", user_Id=" + user_Id + ", civility=" + civility
				+ ", lastName=" + lastName + ", firstName=" + firstName
				+ ", birthDate=" + birthDate + ", maidenName=" + maidenName
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", nbChildren=" + nbChildren + ", profession=" + profession
				+ ", birthCity=" + birthCity + ", birthCountry=" + birthCountry
				+ ", nationality=" + nationality + ", destMail=" + destMail
				+ ", destInvoice=" + destInvoice + ", mailCivility="
				+ mailCivility + ", mailLastName=" + mailLastName
				+ ", mailFirstName=" + mailFirstName + ", deathDate="
				+ deathDate + ", isAnonym=" + isAnonym + ", isDead=" + isDead
				+ ", isEmployed=" + isEmployed + ", employer=" + employer
				+ ", isEDRate=" + isEDRate + ", eDRate=" + eDRate + ", pin="
				+ pin + ", bank=" + bank + ", bankPlace=" + bankPlace
				+ ", creationDate=" + creationDate + ", isInvoiced="
				+ isInvoiced + ", isCareDone=" + isCareDone + ", color="
				+ color + ", status=" + status + ", isDeleted=" + isDeleted
				+ ", defaultAccessKey=" + defaultAccessKey + ", accessKey="
				+ accessKey + ", checkSum=" + checkSum + ", globalId="
				+ globalId + ", remark=" + remark + ", timeStamp=" + timeStamp
				+ ", userStamp=" + userStamp + ", middleName=" + middleName
				+ ", localFirstName=" + localFirstName + ", localMiddleName="
				+ localMiddleName + ", localLastName=" + localLastName
				+ ", externalFileSource=" + externalFileSource
				+ ", externalFileId=" + externalFileId + ", isActive="
				+ isActive + ", isNotRealPatient=" + isNotRealPatient
				+ ", versionId=" + versionId + "]";
	}
	
	
	
	
	
}
