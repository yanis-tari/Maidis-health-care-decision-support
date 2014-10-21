package com.mds.healper;

import java.util.Date;
import java.util.List;

import com.maidis.mdskernel.MdsDate;
import com.maidis.mdskernel.MdsDateTime;
import com.mds.beans.Pami;
import com.mds.beans.type.DiagnosisType;
import com.mds.beans.type.MIActive;
import com.mds.beans.type.MIImportance;
import com.mds.beans.type.MiType;

public class MiBuilderDS {
	private MiBuilderDS(){};
	
	public static Pami buildPami(int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,	int toRespUnit_Id, int fromRespUnit_Id, int object_Id,	int contact_Id, int user_Id, int toUser_Id, int fromUser_Id,String miClass, String miCode, String miType, String miText, String miCategory, int miCertainty, MdsDateTime miDate, MdsDate miEndDate, String miRelative, boolean isAffectsPatient, boolean isNegative, int rank, String remark, int quantity, String accessKey, String checkSum, String msoda, boolean isArchived, MdsDateTime archiveDateTime, int userStamp, MdsDateTime timeStamp, MdsDateTime vstartDate, int miStatus, Date miStatusDate, MIActive miActive, MIImportance miImportance,	DiagnosisType diagnosisType, List<PamiValue> values){
		Pami pami=null;	

		switch (MiType.valueOf(miType)) {
		case AC:	pami = buildActe(values);		break;
		case AM:	pami = buildAllergy(values);	break;
		case XS:	pami = buildSimpleExam(values);	break;
		case ME:	pami = buildDrug(values);		break;	
		case SY:	pami = buildSymptom(values);	break;
		case DI:	pami = buildDisposable(values);	break;
		case RI:	pami = buildRisk(values);		break;
		case VAD:	pami = buildVaccinePrescription(values);break;
		case XBD:	pami = buildBiologicExamPrescription(values);break;
		case XBR:	pami = buildRealizedExam(values);break;
		case XRD:	pami = buildRadiologicExamPrescription(values);break;
		case XRR:	pami = buildRadiologicExamResult(values);break;
		case XSD:	pami = buildMonitoringExamPrescription(values);break;
		case PA:	pami = buildPathology(values);break;
		case NAC:	pami = buildNurseActe(values);break;
		
		default:	pami = MiFactory.getPami();		break;
		}		
		initPamiProperty(pami, mi_Id,  supMI_Id,  patient_Id, respUnit_Id,toRespUnit_Id,  fromRespUnit_Id,  object_Id,	contact_Id, user_Id, toUser_Id, fromUser_Id, miClass,  miCode,  miType,  miText, miCategory,  miCertainty,  miDate,  miEndDate,	 miRelative,  isAffectsPatient,  isNegative, rank,  remark,  quantity,  accessKey, checkSum,  msoda,  isArchived, archiveDateTime,  userStamp,  timeStamp, vstartDate,miStatus, miStatusDate, miActive, miImportance, diagnosisType);
		return pami;					
	}

	public static Pami buildNurseActe(List<PamiValue> values) {
		String codedPosology = null;
		Double duration = null;
		Date endDate = null;
		boolean isALD = false;
		boolean isFreePosology = false;
		Double nBox = null;
		boolean not_substitute = false;
		String pathology = null;
		String posology = null;
		String reason = null;
		String route = null;
		Date startDate = null;
		String unit = null;
		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("CodedPosology")){
				 //= value.get;
			}
	 
			if(value.getMiAttrName().equals("Duration")){
				 duration= value.getNumValue();
			}
	 
			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					endDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
	 
			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0) isALD = true;
			}
	 
			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue() != 0) isFreePosology = true;
			}
	 
			if(value.getMiAttrName().equals("NBox")){
				 nBox= value.getNumValue();
			}
	 
			if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
				if(value.getNumValue() != 0) not_substitute = true;
			}
	 
			if(value.getMiAttrName().equals("PATHOLOGY")){
				 pathology= value.getStringValue();
			}
	 
			if(value.getMiAttrName().equals("Posology")){
				 posology= value.getStringValue();
			}
	 
			if(value.getMiAttrName().equals("REASON")){
				 reason= value.getStringValue();
			}
	 
			if(value.getMiAttrName().equals("Route")){
				 route= value.getStringValue();
			}
	 
			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					startDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
	 
			if(value.getMiAttrName().equals("Unit")){
				 unit= value.getStringValue();
			}		 	
	 		
		}					
		return MiFactory.getNurseActe(codedPosology, duration, endDate, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, route, startDate, unit);
	}
	public static Pami buildPathology(List<PamiValue> values) {
		String chapter = null;         
		String location = null;
		String startAge = null;
		String teeths = null;
		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("CHAPTER")){
				 chapter= value.getStringValue();
			}
	 
			if(value.getMiAttrName().equals("Location")){
				 location= value.getStringValue();
			}
	 
			if(value.getMiAttrName().equals("StartAge")){
				startAge= value.getStringValue();				
			}
	 
			if(value.getMiAttrName().equals("Teeth(s)")){
				 teeths= value.getStringValue();
			}
			
		}
		return MiFactory.getPathology(chapter, location, startAge, teeths);
	}
	public static Pami buildMonitoringExamPrescription(List<PamiValue> values) {
		String codedPosology = null;
		Double duration = null;
		Date endDate = null;
		boolean isALD = false;
		boolean isFreePosology = false;
		Double nBox = null;
		boolean not_substitute = false;
		String pathology = null;
		String posology = null;
		String reason = null;
		String route = null;
		Date startDate = null;
		String unit = null;
		for (PamiValue value : values) {
     
				if(value.getMiAttrName().equals("Duration")){
					 duration= value.getNumValue();
				}
		 
				if(value.getMiAttrName().equals("EndDate")){
					MdsDateTime mdsDT = new MdsDateTime();
					try {
						mdsDT.FromReverse(value.getStringValue());
						endDate =  mdsDT.getDate();
					} catch (Exception e) { 
						e.printStackTrace();
					}
				}
		 
				if(value.getMiAttrName().equals("IsALD")){
					if(value.getNumValue() != 0) isALD = true;
				}
		 
				if(value.getMiAttrName().equals("IsFreePosology")){
					if(value.getNumValue() != 0) isFreePosology = true;
				}
		 
				if(value.getMiAttrName().equals("NBox")){
					 nBox= value.getNumValue();
				}
		 
				if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
					if(value.getNumValue() != 0) not_substitute = true;
				}
		 
				if(value.getMiAttrName().equals("PATHOLOGY")){
					 pathology= value.getStringValue();
				}
		 
				if(value.getMiAttrName().equals("Posology")){
					 posology= value.getStringValue();
				}
		 
				if(value.getMiAttrName().equals("REASON")){
					 reason= value.getStringValue();
				}
		 
				if(value.getMiAttrName().equals("Route")){
					 route= value.getStringValue();
				}
		 
				if(value.getMiAttrName().equals("StartDate")){
					MdsDateTime mdsDT = new MdsDateTime();
					try {
						mdsDT.FromReverse(value.getStringValue());
						startDate =  mdsDT.getDate();
					} catch (Exception e) { 
						e.printStackTrace();
					}
				}
		 
				if(value.getMiAttrName().equals("Unit")){
					 unit= value.getStringValue();
				}		 			 		
		 }
		return MiFactory.getMonitoringExamPrescription(codedPosology, duration, endDate, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, route, startDate, unit);
	}
	public static Pami buildRadiologicExamResult(List<PamiValue> values) {
		 Double imageBlob_1 = null ;     
		 Double imageBlob_2 = null ;     
		 Double imageCount  = null ;     
		 String imageDesc_1 = null ;         
		 String imageDesc_2 = null ;         
		 String requestNumber = null ;
         
		 for (PamiValue value : values) {

				if(value.getMiAttrName().equals("ImageBlob_1")){
					imageBlob_1 = value.getNumValue();
				}

				if(value.getMiAttrName().equals("ImageBlob_2")){
					imageBlob_2= value.getNumValue();
				}

				if(value.getMiAttrName().equals("ImageCount")){
					imageCount= value.getNumValue();
				}

				if(value.getMiAttrName().equals("ImageDesc_1")){
					imageDesc_1= value.getStringValue();
				}

				if(value.getMiAttrName().equals("ImageDesc_2")){
					imageDesc_2= value.getStringValue();
				}

				if(value.getMiAttrName().equals("RequestNumber")){
					requestNumber= value.getStringValue();
				}		
		}		 
		 
		return MiFactory.getRadiologicalExamResult(imageBlob_1, imageBlob_2, imageCount, imageDesc_1, imageDesc_2, requestNumber);
	}
	public static Pami buildRadiologicExamPrescription(List<PamiValue> values) {
		String codedPosology= null;
		Double duration= null;
		Date endDate= null;
		Double imageBlob_1= null;
		Double imageBlob_2= null;
		Double imageCount= null;
		String imageDesc_1= null;
		String imageDesc_2= null;
		boolean isALD= false;
		boolean isFreePosology= false;
		Double nBox= null;
		boolean not_substitute= false;
		String pathology= null;
		String posology= null;
		String reason= null;
		String requestNumber= null;
		String route= null;
		Date startDate= null;
		String unit= null;


		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("CodedPosology")){
				//	 = value.get;
			}

			if(value.getMiAttrName().equals("Duration")){
				duration= value.getNumValue();
			}

			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					endDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("ImageBlob_1")){
				imageBlob_1= value.getNumValue();
			}

			if(value.getMiAttrName().equals("ImageBlob_2")){
				imageBlob_2= value.getNumValue();
			}

			if(value.getMiAttrName().equals("ImageCount")){
				imageCount= value.getNumValue();
			}

			if(value.getMiAttrName().equals("ImageDesc_1")){
				imageDesc_1= value.getStringValue();
			}

			if(value.getMiAttrName().equals("ImageDesc_2")){
				imageDesc_2= value.getStringValue();
			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0) isALD =true;
			}

			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue() != 0) isFreePosology =true;
			}

			if(value.getMiAttrName().equals("NBox")){
				nBox= value.getNumValue();
			}   

			if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
				if(value.getNumValue() != 0) not_substitute =true;
			}

			if(value.getMiAttrName().equals("PATHOLOGY")){
				pathology= value.getStringValue();
			}

			if(value.getMiAttrName().equals("Posology")){
				posology= value.getStringValue();
			}

			if(value.getMiAttrName().equals("REASON")){
				reason = value.getStringValue();
			}

			if(value.getMiAttrName().equals("RequestNumber")){
				requestNumber= value.getStringValue();
			}

			if(value.getMiAttrName().equals("Route")){
				route = value.getStringValue();
			}

			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					startDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("Unit")){
				unit= value.getStringValue();
			}			
		}
		return MiFactory.getRadiologicExamPrescription(codedPosology, duration, endDate, imageBlob_1, imageBlob_2, imageCount, imageDesc_1, imageDesc_2, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, requestNumber, route, startDate, unit);		
	}	
	public static Pami buildRealizedExam(List<PamiValue> values) {
		String maxNormalValue =null;
		String maxNormalValue2=null;
		String minNormalValue=null;
		String minNormalValue2=null;		
		String myvalue=null;

		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("MaxNormalValue")){
				maxNormalValue = value.getStringValue();
			}

			if(value.getMiAttrName().equals("MaxNormalValue2")){
				maxNormalValue2 = value.getStringValue();
			}

			if(value.getMiAttrName().equals("MinNormalValue")){
				minNormalValue = value.getStringValue();
			}

			if(value.getMiAttrName().equals("MinNormalValue2")){
				minNormalValue2 = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Value")){
				myvalue = value.getStringValue();
			}

		}


		return MiFactory.getRealizedExam(maxNormalValue, maxNormalValue2, minNormalValue, minNormalValue2, myvalue);

	}
	public static Pami buildBiologicExamPrescription(List<PamiValue> values) {
		String codedPosology = null;
		Double duration = null;
		Date endDate = null;
		Double examTerm_Id = null;
		boolean isALD = false;
		boolean isFreePosology = false;
		boolean isImmediate = false;
		Double nBox = null;
		boolean not_substitute = false;
		String pathology = null;
		String posology = null;
		String reason = null;
		Date receptionDate = null;
		String route = null;
		Date startDate = null;
		String unit = null;

		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("CodedPosology")){
				//codedPosology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Duration")){
				duration= value.getNumValue() ;
			}

			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					endDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("ExamTerm_Id")){
				examTerm_Id = value.getNumValue() ;
			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0) isALD = true;
			}

			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue() != 0) isFreePosology = true;
			}

			if(value.getMiAttrName().equals("IsImmediate")){
				if(value.getNumValue() != 0) isImmediate = true;
			}

			if(value.getMiAttrName().equals("NBox")){
				nBox= value.getNumValue() ;
			}

			if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
				if(value.getNumValue() != 0) not_substitute = true;
			}

			if(value.getMiAttrName().equals("PATHOLOGY")){
				pathology = value.getStringValue() ;
			}

			if(value.getMiAttrName().equals("Posology")){
				posology = value.getStringValue() ;
			}

			if(value.getMiAttrName().equals("REASON")){
				reason= value.getStringValue() ;
			}

			if(value.getMiAttrName().equals("ReceptionDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					receptionDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("Route")){
				route = value.getStringValue() ;
			}

			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					startDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("Unit")){
				unit = value.getStringValue() ;
			}

		}

		return MiFactory.getBiologicExamPrescription(codedPosology, duration, endDate, examTerm_Id, isALD, isFreePosology, isImmediate, nBox, not_substitute, pathology, posology, reason, receptionDate, route, startDate, unit);		
	}
	public static Pami buildVaccinePrescription(List<PamiValue> values) {
		String codedPosology = null;
		Double duration = 0.;
		Date endDate  = null;
		boolean isALD = false;
		boolean isFreePosology = false;
		Double nBox =0.;
		String posology  = null;
		String reason = null;
		String route = null;
		Date startDate = null;
		String unit = null;
		Double vaAlertId = 0.;
		Double vaCommID =0.;
		Double vaCreateByType =0.;
		Date vaDate = null ;
		String vaDateType = null;
		boolean vaIsBooster = false;
		boolean vaIsValence = false;
		Double vaNbDoses =0.;
		String vaNext  = null;
		String vaNumBooster = null;
		Double vaPerformedByType =0.;
		String vaPrev  = null;
		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("CodedPosology")){
				//codedPosology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Duration")){
				duration = value.getNumValue();
			}

			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					endDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}

			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0 ) isALD = true;
			}

			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue() != 0 ) isFreePosology = true;
			}

			if(value.getMiAttrName().equals("NBox")){
				nBox = value.getNumValue();

			}

			if(value.getMiAttrName().equals("Posology")){
				posology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("REASON")){
				reason = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Route")){
				route = value.getStringValue();
			}

			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					startDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}

			}

			if(value.getMiAttrName().equals("Unit")){
				unit = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VAAlertId")){
				vaAlertId = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VACommID")){
				vaCommID = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VACreateByType")){
				vaCreateByType = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VADate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					vaDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("VADateType")){
				vaDateType = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VAIsBooster")){
				if(value.getNumValue() != 0) vaIsBooster=true;
			}

			if(value.getMiAttrName().equals("VAIsValence")){
				if(value.getNumValue() != 0) vaIsValence=true;
			}

			if(value.getMiAttrName().equals("VANbDoses")){
				vaNbDoses = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VANext")){
				vaNext = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VANumBooster")){
				vaNumBooster = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VAPerformedByType")){
				vaPerformedByType = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VAPrev")){
				vaPrev = value.getStringValue();
			}

		}
		return MiFactory.getVaccinePrescription(codedPosology, duration, endDate, isALD, isFreePosology, nBox, posology, reason, route, startDate, unit, vaAlertId, vaCommID, vaCreateByType, vaDate, vaDateType, vaIsBooster, vaIsValence, vaNbDoses, vaNext, vaNumBooster, vaPerformedByType, vaPrev);
	}
	public static Pami buildRisk(List<PamiValue> values) {
		Date aldEndDate = null;
		String chapter = null;
		boolean isALD = false;
		Double startAge = 0.;
		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("AldEndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					aldEndDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}	
			}

			if(value.getMiAttrName().equals("CHAPTER")){
				chapter = value.getStringValue();
			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0) isALD = true;	
			}

			if(value.getMiAttrName().equals("StartAge")){
				startAge = value.getNumValue();
			}
		}
		return MiFactory.getRisk(aldEndDate, chapter, isALD, startAge);
	}
	public static Pami buildDisposable(List<PamiValue> values) {
		String codedPosology = null;
		Double duration=0.;
		Date endDate = null;
		boolean isALD = false;
		boolean isFreePosology = false;
		Double nBox =0.;
		boolean not_substitute = false;
		String pathology  = null;
		String posology = null;
		String reason = null;
		String route = null;
		Date startDate = null;
		String unit = null;
		for (PamiValue value : values) {


			if(value.getMiAttrName().equals("CodedPosology")){
				//codedPosology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Duration")){
				duration = value.getNumValue();
			}

			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					endDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0 ) isALD = true;
			}

			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue() != 0 ) isFreePosology = true;
			}

			if(value.getMiAttrName().equals("NBox")){
				nBox = value.getNumValue();						 
			}

			if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
				if(value.getNumValue() != 0 ) not_substitute = true;
			}

			if(value.getMiAttrName().equals("PATHOLOGY")){
				pathology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Posology")){
				posology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("REASON")){
				reason  = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Route")){
				route = value.getStringValue();
			}

			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					startDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("Unit")){
				unit = value.getStringValue();
			}


		}
		return MiFactory.getDisposable(codedPosology, duration, endDate, isALD, isFreePosology, nBox, not_substitute, pathology, posology, reason, route, startDate, unit);
	}
	public static Pami buildActe(List<PamiValue> values) {
		String codedPosology = null;
		Double duration = 0.;
		Date endDate = null;
		boolean isALD =false;
		boolean isFreePosology = false;
		Double nBox =0.;
		String posology = null;
		String route = null;
		Date startDate = null;
		String unit = null;
		Double vaAlertId = 0.;
		Double vaCommID = 0.;
		String vaCreateBy = null;
		Double vaCreateByType = 0.;
		Date vaDate = null ;
		String vaDateType = null;
		boolean vaIsPrimo = false;
		boolean vaIsVaccin =false;
		Double vaNumber =0.;
		String vaPerformedBy = null;
		Double vaPerformedByType =0.;
		boolean isMainProc =false;
		String location = null;
		boolean not_substitute = false;
		String pathology = null;
		String reason = null;
		String teeths = null;
		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("CodedPosology")){
				// codedPosology  = value.getStringValue();

			}

			if(value.getMiAttrName().equals("Duration")){
				duration = value.getNumValue();
			}

			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					endDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() !=0 ) isALD = true;
			}

			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue() !=0 ) isFreePosology = true;
			}

			if(value.getMiAttrName().equals("NBox")){
				nBox = value.getNumValue();
			}

			if(value.getMiAttrName().equals("Posology")){
				posology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Route")){
				route = value.getStringValue();
			}

			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					startDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("Unit")){
				unit = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VAAlertId")){
				vaAlertId = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VACommID")){
				vaCommID = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VACreateBy")){
				vaCreateBy = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VACreateByType")){
				vaCreateByType = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VADate")){
				MdsDateTime mdsDT = new MdsDateTime();
				try {
					mdsDT.FromReverse(value.getStringValue());
					vaDate =  mdsDT.getDate();
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("VADateType")){
				vaDateType = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VAIsPrimo")){
				if(value.getNumValue() != 0) vaIsPrimo = true;
			}

			if(value.getMiAttrName().equals("VAIsVaccin")){
				if(value.getNumValue() != 0) vaIsVaccin = true;
			}			

			if(value.getMiAttrName().equals("VANumber")){
				vaNumber = value.getNumValue();
			}

			if(value.getMiAttrName().equals("VAPerformedBy")){
				vaPerformedBy = value.getStringValue();
			}

			if(value.getMiAttrName().equals("VAPerformedByType")){
				vaPerformedByType = value.getNumValue();
			}

			if(value.getMiAttrName().equals("IsMainProc")){
				if(value.getNumValue() != 0) isMainProc = true;
			}

			if(value.getMiAttrName().equals("Location")){
				location = value.getStringValue();
			}

			if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
				if(value.getNumValue() != 0) not_substitute = true;
			}

			if(value.getMiAttrName().equals("PATHOLOGY")){
				pathology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("REASON")){
				reason = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Teeths")){
				teeths = value.getStringValue();
			}
		}
		return MiFactory.getActe(codedPosology, duration, endDate, isALD, isFreePosology, nBox, posology, route, startDate, unit, vaAlertId, vaCommID, vaCreateBy, vaCreateByType, vaDate, vaDateType, vaIsPrimo, vaIsVaccin, vaNumber, vaPerformedBy, vaPerformedByType, isMainProc, location, not_substitute, pathology, reason, teeths);
	}
	public static Pami buildSymptom(List<PamiValue> values) {
		String	diagnostic = null;
		String erytheme= null;
		String inclusion= null;
		boolean isDHL= false;
		boolean isRC= false;
		String	order = null;
		String	papule = null;
		String	position = null;
		String	prurit = null;
		String	suivi = null;
		String	symptome= null;
		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("Diagnostic")){
				diagnostic = value.getStringValue(); 
			}

			if(value.getMiAttrName().equals("Erytheme")){
				erytheme = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Inclusion")){
				inclusion = value.getStringValue();
			}

			if(value.getMiAttrName().equals("IsDHL")){
				if(value.getNumValue() != 0 )isDHL = true;
			}

			if(value.getMiAttrName().equals("IsRC")){
				if(value.getNumValue() != 0) isRC = true;

			}

			if(value.getMiAttrName().equals("Order")){
				order = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Papule")){
				papule = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Position")){
				position = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Prurit")){
				prurit = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Suivi")){
				suivi = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Symptome")){
				symptome = value.getStringValue();
			}			 		
		}
		return MiFactory.getSymptom(diagnostic, erytheme, inclusion, isDHL, isRC, order, papule, position, prurit, suivi, symptome);
	}
	public static Pami buildDrug(List<PamiValue> values){		
		Date aldEndDate = null;
		String chapter = null;
		String codedPosology = null;
		Double duration = 0.0;
		Date endDate = null;
		boolean isALD = false;
		boolean isDCI = false;
		boolean isFreePosology = false;
		boolean isFreeText = false;
		String mention  = null;
		String mentionDCI = null;
		Double nBox = 0.0;
		boolean not_substitute = false;
		String pathology  = null;
		String posology  = null;
		String prescription  = null;
		String reason = null;
		String route = null;
		Date startDate = null;
		String unit = null;


		for (PamiValue value : values) {


			if(value.getMiAttrName().equals("AldEndDate")){
				MdsDateTime dt = new MdsDateTime();
				try {
					dt.FromReverse(value.getStringValue());
					aldEndDate = dt.getDate();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("CHAPTER")){
				chapter = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Duration")){
				duration = value.getNumValue();
			}

			if(value.getMiAttrName().equals("EndDate")){
				MdsDateTime dt = new MdsDateTime();
				try {
					dt.FromReverse(value.getStringValue());
					endDate = dt.getDate();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("IsALD")){
				if(value.getNumValue() != 0) isALD = true;
			}

			if(value.getMiAttrName().equals("IsDCI")){
				if(value.getNumValue()!= 0) isDCI = true;			
			}

			if(value.getMiAttrName().equals("IsFreePosology")){
				if(value.getNumValue()!= 0) isFreePosology = true;
			}

			if(value.getMiAttrName().equals("IsFreeText")){
				if(value.getNumValue()!= 0) isFreeText = true;
			}

			if(value.getMiAttrName().equals("Mention")){
				mention = value.getStringValue();
			}

			if(value.getMiAttrName().equals("MentionDCI")){
				mentionDCI = value.getStringValue();
			}

			if(value.getMiAttrName().equals("NBox")){
				nBox = value.getNumValue();
			}																											

			if(value.getMiAttrName().equals("NOT_SUBSTITUTE")){
				if(value.getNumValue()!= 0) not_substitute = true;	
			}

			if(value.getMiAttrName().equals("PATHOLOGY")){
				pathology = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Posology")){
				posology= value.getStringValue();
			}

			if(value.getMiAttrName().equals("PRESCRIPTION")){
				prescription = value.getStringValue();
			}

			if(value.getMiAttrName().equals("REASON")){
				reason = value.getStringValue();
			}

			if(value.getMiAttrName().equals("Route")){
				route = value.getStringValue();
			}

			if(value.getMiAttrName().equals("StartDate")){
				MdsDateTime dt = new MdsDateTime();
				try {
					dt.FromReverse(value.getStringValue());
					startDate = dt.getDate();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if(value.getMiAttrName().equals("Unit")){
				unit = value.getStringValue();
			}
		}	

		return MiFactory.getDrug(aldEndDate, chapter, codedPosology, duration, endDate, isALD, isDCI, isFreePosology, isFreeText, mention, mentionDCI, nBox, not_substitute, pathology, posology, prescription, reason, route, startDate, unit);
	}
	public static Pami buildSimpleExam(List<PamiValue> values){		
		for (PamiValue value : values) {
			if(value.getMiAttrName().equals("SimpleExamResult"))
				return MiFactory.getSimpleExam(value.getNumValue(),value.getStringValue(), value.getMeasureUnit());

		}		
		return null;
	}
	public static Pami buildAllergy(List<PamiValue> values){
		boolean ald= false;
		Date aldEndDate=null;

		for (PamiValue value : values) {

			if(value.getMiAttrName().equals("IsALD"))
				if(value.getNumValue()!=0) ald=true;

			if(value.getMiAttrName().equals("AldEndDate"))
				if(!value.getStringValue().equals("")){
					MdsDateTime mdsDT = new MdsDateTime();
					try {
						mdsDT.FromReverse(value.getStringValue());
						aldEndDate =  mdsDT.getDate();
					} catch (Exception e) { 
						e.printStackTrace();
					}									
				}			
		}										
		return MiFactory.getAllergy(aldEndDate, ald);
	}
	public static void initPamiProperty(Pami pami , int mi_Id, int supMI_Id, int patient_Id, int respUnit_Id,
			int toRespUnit_Id, int fromRespUnit_Id, int object_Id,
			int contact_Id, int user_Id, int toUser_Id, int fromUser_Id,
			String miClass, String miCode, String miType, String miText,
			String miCategory, int miCertainty, MdsDateTime miDate, MdsDate miEndDate,
			String miRelative, boolean isAffectsPatient, boolean isNegative,
			int rank, String remark, int quantity, String accessKey,
			String checkSum, String msoda, boolean isArchived,
			MdsDateTime archiveDateTime, int userStamp, MdsDateTime timeStamp, MdsDateTime vstartDate,int miStatus, Date miStatusDate, MIActive miActive, MIImportance miImportance,	DiagnosisType diagnosisType){

		pami.setMi_Id(mi_Id); 
		pami.setSupMI_Id(supMI_Id);
		pami.setPatient_Id(patient_Id);
		pami.setRespUnit_Id(respUnit_Id);
		pami.setToRespUnit_Id(toRespUnit_Id);
		pami.setFromRespUnit_Id(fromRespUnit_Id);
		pami.setObject_Id(object_Id);
		pami.setContact_Id(contact_Id);
		pami.setUser_Id(user_Id);
		pami.setToUser_Id(toUser_Id);
		pami.setFromUser_Id(fromUser_Id);
		pami.setMiClass(miClass);
		pami.setMiCode(miCode);
		pami.setMiType(miType);
		pami.setMiText(miText);				
		pami.setMiCategory(miCategory);
		pami.setMiCertainty(miCertainty);
		if(! isDateNull(miDate))	pami.setMiDate(miDate.getDate());	
		if(! isDateNull(miEndDate))		pami.setMiEndDate(miEndDate.getDate());
		pami.setMiRelative(miRelative);
		pami.setIsAffectsPatient(isAffectsPatient);		
		pami.setIsNegative(isNegative);
		pami.setRank(rank);
		pami.setRemark(remark);
		pami.setQuantity(quantity);
		pami.setAccessKey(accessKey);
		pami.setCheckSum(checkSum);
		pami.setMsoda(msoda);
		pami.setIsArchived(isArchived);
		if(! isDateNull(archiveDateTime))		pami.setArchiveDateTime(archiveDateTime.getDate());
		pami.setUserStamp(userStamp);
		if(! isDateNull(timeStamp))		pami.setTimeStamp(timeStamp.getDate());
		if(! isDateNull(vstartDate))		pami.setVstartDate(vstartDate.getDate());
		pami.setMiStatus(miStatus);
		pami.setMiStatusDate(miStatusDate);
		pami.setMiActive(miActive);
		pami.setMiImportance(miImportance);
		pami.setDiagnosisType(diagnosisType) ;
		
	}
	private static boolean isDateNull(MdsDate date){	if(date == null || date.getYear()<3){return true;}else{return false;	}}
	private static boolean isDateNull(MdsDateTime date){if(date == null || date.getYear()<3){	return true;}else{return false;	}}

}
