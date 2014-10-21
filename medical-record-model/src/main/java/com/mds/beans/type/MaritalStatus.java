package com.mds.beans.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum MaritalStatus { 
/// Possible value for \e MaritalStatus::MaritalStatus
UNSET(0),
/// Possible value for \e MaritalStatus::MaritalStatus
SINGLE(1),
/// Possible value for \e MaritalStatus::MaritalStatus
CONCUBINE(2),
/// Possible value for \e MaritalStatus::MaritalStatus
COMMON_LAW(3),
/// Possible value for \e MaritalStatus::MaritalStatus
MARRIED(4),
/// Possible value for \e MaritalStatus::MaritalStatus
DIVORCED(5),
/// Possible value for \e MaritalStatus::MaritalStatus
WIDOW(6); 

private final int val;
private MaritalStatus(int v) { val = v; }
public int value() {
	return val;
}
public static MaritalStatus lookUpByOrdinal(int i) {  
     return MaritalStatus.values()[i];  
 }

public boolean Compare(int i){return val == i;}
public static MaritalStatus GetValue(int _id)
{
	MaritalStatus[] As = MaritalStatus.values();
    for(int i = 0; i < As.length; i++)
    {
        if(As[i].Compare(_id))
            return As[i];
    }
    return null;
}

}
