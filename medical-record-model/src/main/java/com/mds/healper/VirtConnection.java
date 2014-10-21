package com.mds.healper;


import thewebsemantic.binding.Jenabean;
import virtuoso.jena.driver.VirtGraph;
import virtuoso.jena.driver.VirtModel;

public class VirtConnection {
	
	  private static String url = "jdbc:virtuoso://smdspatst52:1111";
	 
	  private static String user = "dba";
	 
	  private static String passwd = "dba";
	 	  
	  private static String graphName="http://maidis/medical-record";

	  private static Jenabean jenabean;	 
	  
	  private VirtConnection(){};
	  public static Jenabean getInstance(){
	    if(jenabean == null){	      
	    	VirtGraph graph = new VirtGraph (graphName,url, user, passwd);		    	
	    	//OntModel m =  ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MICRO_RULE_INF, new VirtModel(graph));
	    	VirtModel m  = new VirtModel(graph);
	    	jenabean = Jenabean.instance();
	    	jenabean.bind(m);
	    	jenabean.bindAll("com.mds.beans");	    	
	    }      
	    return jenabean;
	  }	
}
