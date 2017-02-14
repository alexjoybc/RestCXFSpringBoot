package io.fabric8.quickstarts.cxf.jaxrs;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;

@Api("/claims")
public class ServiceStatusImpl implements ServiceStatus {
	
	 public String sayHello(String a) {
	        return "Hello " + a + ", Welcome to Redhat CXF RS on Spring Boot World!!!";
	    }
	 
	public ClaimStatus checkClaim(String custId){

		ClaimStatus clm = new ClaimStatus();
    	clm.setClaimNo("111-ADDD-12345");
    	clm.setPolno("PO123444445");
    	clm.setCustId(custId);
    	clm.setStatus("CLOSED");
  
    	return clm;
	}

   
	public ClaimCancel restCancel( String claimNo){
		ClaimCancel clm = new ClaimCancel();
    	clm.setClaimNo(claimNo);
    	clm.setConfNumber("Feb122017AB344545");
   
    	clm.setStatus("CANCELED");
  
        return clm;
	}
	
	
	public List<ClaimStatus> listClaims(String custId) {
		
		List<ClaimStatus> clist =  new  ArrayList<ClaimStatus>();
		for (int i=0; i < 4; i++){
			
			ClaimStatus cl = new ClaimStatus();
			cl.setCustId(custId);
			cl.setClaimNo(Integer.toString(1000+ i));
			cl.setPolno("A123245DF");
			cl.setStatus("PAID");
	        clist.add(cl);
		}
		
		return clist;
			
			
		}
	
	public ClaimStatus submitClaim(Claim claim) {
		ClaimStatus cs = new ClaimStatus();
		System.out.println("GOT claim !!!");
		cs.setStatus("RECEIVED");
		cs.setCustId(claim.getCustId());
		cs.setPolno(claim.getPolno());
		cs.setClaimNo("DS3343545454543");
		
		return cs;
		
	}
}
