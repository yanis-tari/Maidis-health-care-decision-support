package com.mds.beans;

import thewebsemantic.As;
import thewebsemantic.Namespace;
@Namespace("http://maidis/medical-record#")
public interface MedicalRecord extends As{
	interface Person extends MedicalRecord {}
	interface Patient extends MedicalRecord {}
	interface MedicalItem extends MedicalRecord {}
	interface Contact extends MedicalRecord {}
	interface SEObject extends MedicalRecord {}
	
	
	
	
}
