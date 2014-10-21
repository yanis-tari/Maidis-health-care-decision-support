package com.mds.beans.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum PatientFamilyCorrespondant { 
/// Possible value for \e PatientFamilyCorrespondant::PatientFamilyCorrespondant
PATIENT(0),
/// Possible value for \e PatientFamilyCorrespondant::PatientFamilyCorrespondant
INSURED(1),
/// Possible value for \e PatientFamilyCorrespondant::PatientFamilyCorrespondant
BREADWINNER(2); 

private final int val;
private PatientFamilyCorrespondant(int v) { val = v; }
public int value() {
	return val;
}
public static PatientFamilyCorrespondant lookUpByOrdinal(int i) {  
     return PatientFamilyCorrespondant.values()[i];  
 }

public boolean Compare(int i){return val == i;}
public static PatientFamilyCorrespondant GetValue(int _id)
{
	PatientFamilyCorrespondant[] As = PatientFamilyCorrespondant.values();
    for(int i = 0; i < As.length; i++)
    {
        if(As[i].Compare(_id))
            return As[i];
    }
    return null;
}

}
