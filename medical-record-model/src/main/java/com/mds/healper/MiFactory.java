package com.mds.healper;

import java.util.Date;

import com.mds.beans.*;

public class MiFactory {
	private MiFactory(){}	

	public static Pami getPami()
	{
		return new Pami();
	}

	public static Pami getSimpleExam(Double nValue,String sValue, String unit)
	{
		return new SimpleExam(nValue, sValue, unit);
	}
	public static Pami getSimpleExam()
	{
		return new SimpleExam();
	}

	public static Pami getAllergy(Date aldEndDate, boolean isALD)
	{
		return new Allergy(aldEndDate, isALD);
	}

	public static Pami getAllergy()
	{
		return new Allergy();
	}

	public static Pami getDrug(Date aldEndDate, String chapter, String codedPosology, Double duration, Date endDate, boolean isALD, boolean isDCI,	boolean isFreePosology, boolean isFreeText, 
			String mention,	String mentionDCI, Double nBox, boolean not_substitute,	String pathology, String posology, String prescription,	String reason, String route, Date startDate, String unit)
	{
		return new Drug( aldEndDate,  chapter,  codedPosology, duration,  endDate,  isALD,  isDCI, isFreePosology,  isFreeText,  mention,
				mentionDCI,  nBox,  not_substitute, pathology,  posology,  prescription,	 reason,  route,  startDate,  unit);
	}

	public static Pami getDrug()
	{
		return new Drug();
	}

	public static  Pami getSymptom(String diagnostic, String erytheme, String inclusion,boolean isDHL, boolean isRC, String order, String papule,String position, String prurit, String suivi, String symptome)
	{
		return new Symptom(diagnostic, erytheme, inclusion, isDHL, isRC, order, papule, position, prurit, suivi, symptome);	
	}

	public static  Pami getSymptom()
	{
		return new Symptom();
	}

	public static Pami getActe(String codedPosology, Double duration, Date endDate,	boolean isALD, boolean isFreePosology, Double nBox,	String posology, String route, Date startDate, 
			String unit, Double vaAlertId, Double vaCommID, String vaCreateBy,	Double vaCreateByType, Date vaDate, String vaDateType,boolean vaIsPrimo, boolean vaIsVaccin, Double vaNumber,
			String vaPerformedBy, Double vaPerformedByType, boolean isMainProc,	String location, boolean not_substitute, String pathology,	String reason, String teeths)
	{
		return new Acte(codedPosology, duration, endDate, isALD, isFreePosology, nBox, posology, route, startDate, unit,vaAlertId, vaCommID, vaCreateBy, vaCreateByType, 
				vaDate, vaDateType, vaIsPrimo, vaIsVaccin, vaNumber, vaPerformedBy, vaPerformedByType, isMainProc, location, not_substitute, pathology, reason, teeths);
	}

	public static Pami getActe()
	{
		return new Acte();
	}

	public static Pami getDisposable(String codedPosology, Double duration, Date endDate,boolean isALD, boolean isFreePosology, Double nBox,boolean not_substitute, String pathology,
			String posology,String reason, String route, Date startDate, String unit)
	{
		return new Disposable(codedPosology, duration, endDate, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, route, startDate, unit);
	}

	public static Pami getDisposable()
	{
		return new Disposable();
	}

	public static Pami getRisk(Date aldEndDate, String chapter, boolean isALD, Double startAge)
	{
		return new Risk(aldEndDate, chapter, isALD, startAge);
	}

	public static Pami getRisk()
	{
		return new Risk();
	}

	public static Pami getVaccinePrescription(String codedPosology, Double duration,
			Date endDate, boolean isALD, boolean isFreePosology, Double nBox,
			String posology, String reason, String route, Date startDate,
			String unit, Double vaAlertId, Double vaCommID,
			Double vaCreateByType, Date vaDate, String vaDateType,
			boolean vaIsBooster, boolean vaIsValence, Double vaNbDoses,
			String vaNext, String vaNumBooster, Double vaPerformedByType,
			String vaPrev)
	{

		return new VaccinePrescription(codedPosology, duration, endDate, isALD, isFreePosology, nBox, posology, reason, route, startDate, unit, vaAlertId, vaCommID, vaCreateByType, vaDate,
				vaDateType, vaIsBooster, vaIsValence, vaNbDoses, vaNext, vaNumBooster, vaPerformedByType, vaPrev);		
	}

	public static Pami getVaccinePrescription()
	{
		return new VaccinePrescription();
	}


	public static Pami getBiologicExamPrescription(String codedPosology, Double duration, Date endDate, Double examTerm_Id, boolean isALD,	boolean isFreePosology, boolean isImmediate, Double nBox,
			boolean not_substitute, String pathology, String posology, String reason, Date receptionDate, String route, Date startDate,	String unit)
	{
		return new BiologicExamPrescription(codedPosology, duration, endDate, examTerm_Id, isALD, isFreePosology, isImmediate, nBox, not_substitute, pathology, posology, reason, receptionDate, route, startDate, unit);	
	}

	public static Pami getBiologicExamPrescription()
	{
		return new BiologicExamPrescription();	
	}
	
	public static Pami getRealizedExam(String maxNormalValue, String maxNormalValue2, String minNormalValue, String minNormalValue2, String value)
	{
	return new RealizedExam(maxNormalValue, maxNormalValue2, minNormalValue, minNormalValue2, value);	
	}
	
	public static Pami getRealizedExam()
	{
		return new RealizedExam();		
	}
	
	public static Pami getRadiologicExamPrescription(String codedPosology, Double duration,	Date endDate, Double imageBlob_1, Double imageBlob_2,Double imageCount, String imageDesc_1, String imageDesc_2,
			boolean isALD, boolean isFreePosology, Double nBox,	boolean not_substitute, String pathology, String posology,	String reason, String requestNumber, String route, Date startDate,String unit)
	{
		return new RadiologicExamPrescription(codedPosology, duration, endDate, imageBlob_1, imageBlob_2, imageCount, imageDesc_1, imageDesc_2, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, requestNumber, route, startDate, unit);		
		
	}
	public static Pami getRadiologicExamPrescription()
	{
		return new RadiologicExamPrescription();
	}
	
	public static Pami getRadiologicalExamResult(Double imageBlob_1, Double imageBlob_2,
			Double imageCount, String imageDesc_1, String imageDesc_2,
			String requestNumber)
	{
		
		return new com.mds.beans.RadiologicalExamResult(imageBlob_1, imageBlob_2, imageCount, imageDesc_1, imageDesc_2, requestNumber);
	}
	
	public static Pami getRadiologicalExamResult()
	{
		return new com.mds.beans.RadiologicalExamResult();
	}
	
	public static Pami getMonitoringExamPrescription(String codedPosology, Double duration, Date endDate, boolean isALD, boolean isFreePosology, Double nBox,
			boolean not_substitute, String pathology, String posology, String reason, String route, Date startDate, String unit)
	{
			return new MonitoringExamPrescription(codedPosology, duration, endDate, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, route, startDate, unit);		
	}

	public static Pami getMonitoringExamPrescription()
	{
			return new MonitoringExamPrescription();		
	}
	
	public static Pami getPathology(String chapter, String location, String startAge,
			String teeths)
	{
		return new Pathology(chapter, location, startAge, teeths);		
	}
	
	public static Pami getPathology()
	{
		return new Pathology();		
	}
	
	public static Pami getNurseActe(String codedPosology, Double duration, Date endDate, boolean isALD, boolean isFreePosology, Double nBox,
			boolean not_substitute, String pathology, String posology,	String reason, String route, Date startDate, String unit)
	{
		return new NurseActe(codedPosology, duration, endDate, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, route, startDate, unit);
	}
	
	public static Pami getNurseActe()
	{
		return new NurseActe();
	}
	
}
