package com.mds.beans.type;


public enum ContactState { 
/// Possible value for \e ContactState::ContactState
UNSET(0),
/// Possible value for \e ContactState::ContactState
IN_PROGRESS(1),
/// Possible value for \e ContactState::ContactState
CLOSED(2); 

private final int val;
private ContactState(int v) { val = v; }
public int value() {
	return val;
}
public static ContactState lookUpByOrdinal(int i) {  
     return ContactState.values()[i];  
 }

public boolean Compare(int i){return val == i;}
public static ContactState GetValue(int _id)
{
	ContactState[] As = ContactState.values();
    for(int i = 0; i < As.length; i++)
    {
        if(As[i].Compare(_id))
            return As[i];
    }
    return null;
}

}
