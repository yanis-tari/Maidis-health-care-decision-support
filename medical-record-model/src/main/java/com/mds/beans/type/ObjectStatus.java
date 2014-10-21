package com.mds.beans.type;


public enum ObjectStatus { 
/// Possible value for \e ObjectStatus::ObjectStatus
UNSET(0); 

private final int val;
private ObjectStatus(int v) { val = v; }
public int value() {
	return val;
}
public static ObjectStatus lookUpByOrdinal(int i) {  
     return ObjectStatus.values()[i];  
 }

public boolean Compare(int i){return val == i;}
public static ObjectStatus GetValue(int _id)
{
	ObjectStatus[] As = ObjectStatus.values();
    for(int i = 0; i < As.length; i++)
    {
        if(As[i].Compare(_id))
            return As[i];
    }
    return null;
}

}
