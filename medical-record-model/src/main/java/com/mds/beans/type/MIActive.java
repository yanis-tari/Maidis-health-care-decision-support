package com.mds.beans.type;

public enum MIActive {
	IN_PROGRESS(0),
	PAST(1),	
	FUTURE(2);
	
	
	private final int val;
	private MIActive(int v) { val = v; }
	public int value() {
		return val;
	}
	public static MIActive lookUpByOrdinal(int i) {  
	     return MIActive.values()[i];  
	 }

	public boolean Compare(int i){return val == i;}
	public static MIActive GetValue(int _id)
	{
		MIActive[] As = MIActive.values();
	    for(int i = 0; i < As.length; i++)
	    {
	        if(As[i].Compare(_id))
	            return As[i];
	    }
	    return null;
	}

}
