package com.mds.beans.type;

public enum DiagnosisType {
	PRINCIPALL(1),
	SECONDARY(2);

	private final int val;
	private DiagnosisType(int v) { val = v; }
	public int value() {
		return val;
	}
	public static DiagnosisType lookUpByOrdinal(int i) {  
	     return DiagnosisType.values()[i];  
	 }

	public boolean Compare(int i){return val == i;}
	public static DiagnosisType GetValue(int _id)
	{
		DiagnosisType[] As = DiagnosisType.values();
	    for(int i = 0; i < As.length; i++)
	    {
	        if(As[i].Compare(_id))
	            return As[i];
	    }
	    return null;
	}
}
