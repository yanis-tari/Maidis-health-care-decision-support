package com.mds.beans;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import thewebsemantic.Namespace;

import com.mds.beans.type.DiagnosisType;
import com.mds.beans.type.MIActive;
import com.mds.beans.type.MIImportance;

@XmlJavaTypeAdapter(Pami.Adapter.class)
@Namespace("http://maidis/medical-record#")
public interface PamiI {
	public int getMi_Id();
	public int getSupMI_Id();
	public int getPatient_Id();
	public int getRespUnit_Id();
	public int getToRespUnit_Id();
	public int getFromRespUnit_Id();
	public int getObject_Id();
	public int getContact_Id();
	public int getUser_Id();
	public int getToUser_Id();
	public int getFromUser_Id();
	public String getMiClass();
	public String getMiCode();
	public String getMiType();
	public String getMiText();
	public String getMiCategory();
	public int getMiCertainty();
	public Date getMiDate();
	public Date getMiEndDate();
	public String getMiRelative();
	public Boolean getIsAffectsPatient();
	public Boolean getIsNegative();
	public int getRank();
	public String getRemark();
	public int getQuantity();
	public String getAccessKey();
	public String getCheckSum() ;
	public String getMsoda();
	public Boolean getIsArchived();
	public Date getArchiveDateTime();
	public int getUserStamp();
	public Date getTimeStamp();
	public Date getVstartDate() ;
	public int getMiStatus();
	public Date getMiStatusDate();
	public MIActive getMiActive();
	public MIImportance getMiImportance();
	public DiagnosisType getDiagnosisType() ;
	public void setMi_Id(int mi_Id);
	public void setSupMI_Id(int supMI_Id);
	public void setPatient_Id(int patient_Id);
	public void setRespUnit_Id(int respUnit_Id);
	public void setToRespUnit_Id(int toRespUnit_Id);
	public void setFromRespUnit_Id(int fromRespUnit_Id);
	public void setObject_Id(int object_Id);
	public void setContact_Id(int contact_Id);
	public void setUser_Id(int user_Id);
	public void setToUser_Id(int toUser_Id);
	public void setFromUser_Id(int fromUser_Id);
	public void setMiClass(String miClass);
	public void setMiCode(String miCode);
	public void setMiType(String miType);
	public void setMiText(String miText);
	public void setMiCategory(String miCategory);
	public void setMiCertainty(int miCertainty);
	public void setMiDate(Date miDate);
	public void setMiEndDate(Date miEndDate);
	public void setMiRelative(String miRelative);
	public void setIsAffectsPatient(Boolean isAffectsPatient);
	public void setIsNegative(Boolean isNegative);
	public void setRank(int rank);
	public void setRemark(String remark);
	public void setQuantity(int quantity);
	public void setAccessKey(String accessKey);
	public void setCheckSum(String checkSum);
	public void setMsoda(String msoda);
	public void setIsArchived(Boolean isArchived);
	public void setArchiveDateTime(Date archiveDateTime);
	public void setUserStamp(int userStamp);
	public void setTimeStamp(Date timeStamp);
	public void setVstartDate(Date vstartDate);
	public void setMiStatus(int miStatus);
	public void setMiStatusDate(Date miStatusDate);
	public void setMiActive(MIActive miActive);
	public void setMiImportance(MIImportance miImportance);
	public void setDiagnosisType(DiagnosisType diagnosisType) ;

}
