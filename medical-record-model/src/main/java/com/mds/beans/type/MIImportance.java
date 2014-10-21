package com.mds.beans.type;

public enum MIImportance {
	NORMAL(3),
	HIGH(4),
	VERY_HIGH(5);
	
	private final int val;
	private MIImportance(int v) { val = v; }
	public int value() {
		return val;
	}
	public static MIImportance lookUpByOrdinal(int i) {  
	     return MIImportance.values()[i];  
	 }

	public boolean Compare(int i){return val == i;}
	public static MIImportance GetValue(int _id)
	{
		MIImportance[] As = MIImportance.values();
	    for(int i = 0; i < As.length; i++)
	    {
	        if(As[i].Compare(_id))
	            return As[i];
	    }
	    return null;
	}
}
