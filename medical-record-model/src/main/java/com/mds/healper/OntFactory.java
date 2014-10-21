package com.mds.healper;

import java.util.Collection;

import thewebsemantic.NotFoundException;
import thewebsemantic.binding.Jenabean;
import thewebsemantic.binding.RdfBean;

import com.mds.beans.Contact;
import com.mds.beans.Pami;
import com.mds.beans.Patient;
import com.mds.beans.SEObject;

public class OntFactory {
private static Jenabean jenaBean = VirtConnection.getInstance();

private OntFactory(){};

public static Collection<Patient> getPatient(){
	try{
	return Jenabean.load(Patient.class);
	}catch(NotFoundException e) {
		return null;
	}
}

public static Patient getPatient(int patientId){	
	try{
	return Jenabean.load(Patient.class, patientId);
	}catch(NotFoundException e) {
		return null;
	}
}
public static void saveEntity(RdfBean bean){
	bean.save();
}

public static Collection<Contact> getContact(){
	try{
	return Jenabean.load(Contact.class);
	}catch(NotFoundException e) {
		return null;
	}
}

public static Contact getContact(int contactId){
	try{
	return Jenabean.load(Contact.class, contactId);
	}catch(NotFoundException e) {
		return null;
	}
}


public static Collection<SEObject> getObject(){
	
	try{
	return Jenabean.load(SEObject.class);
	}catch(NotFoundException e) {
		return null;
	}
}

public static SEObject getObject(int objectId){
	try{
	return Jenabean.load(SEObject.class, objectId);
	}catch(NotFoundException e) {
		return null;
	}
}

public static Collection<Pami> getPami(){
	try{
	return Jenabean.load(Pami.class);
	}catch(NotFoundException e) {
		return null;
	}
}

public static Pami getPami(int pamiId){
	try{	
	return Jenabean.load(Pami.class, pamiId);
	}catch(NotFoundException e) {
		return null;
	}
	
}



}