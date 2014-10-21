package com.mds.beans.type;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum ConfirmationStatus { 
	/// Possible value for \e ConfirmationStatus::ConfirmationStatus
	TEMPORARY(0),
	/// Possible value for \e ConfirmationStatus::ConfirmationStatus
	CONFIRMED(1); 

	private final int val;
	private ConfirmationStatus(int v) { val = v; }
	public int value() {
		return val;
	}
	public static ConfirmationStatus lookUpByOrdinal(int i) {  
	     return ConfirmationStatus.values()[i];  
	 }

	public boolean Compare(int i){return val == i;}
	public static ConfirmationStatus GetValue(int _id)
	{
		ConfirmationStatus[] As = ConfirmationStatus.values();
	    for(int i = 0; i < As.length; i++)
	    {
	        if(As[i].Compare(_id))
	            return As[i];
	    }
	    return null;
	}

	}
