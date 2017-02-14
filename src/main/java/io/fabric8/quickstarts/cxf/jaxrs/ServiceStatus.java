package io.fabric8.quickstarts.cxf.jaxrs;



import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.*;


import org.springframework.stereotype.Service;

@Path("/claims")
@Service
public interface ServiceStatus {
	
	@GET
    @Path("test/{a}")
	@Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
	@ApiOperation(httpMethod="GET", value = "Simple Test", tags={ "Test",  })
    String sayHello(@PathParam("a") String a);

	@GET
	@Path("/custId/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
	          @ApiResponse(code = 404, message = "No Claimns  not found for this customer")})
	@ApiOperation(httpMethod="GET" ,value = "List Claims", response=ClaimStatus.class, tags={ "Claim Status",  })
	public List<ClaimStatus> listClaims(@PathParam("id") String custId);
	
	@GET
	@Path("/status/{claimNo}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Customer ID supplied"),
	          @ApiResponse(code = 404, message = "No Claimns  not found for this customer")})
	@ApiOperation(httpMethod="GET" ,value = "Claims Listing", response=ClaimStatus.class, tags={ "Claims Listing",  })
	public ClaimStatus checkClaim(@PathParam("claimNo") String claimNo);
   
	@POST
	@Path("/restcancel/{claimNo}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid claimID supplied"),
	          @ApiResponse(code = 404, message = "Claim id not found")})
	@ApiOperation(httpMethod="POST", value = "Claim Cancel ", response=ClaimStatus.class, tags={ "Claim Cancel",  })
	public ClaimCancel restCancel(@PathParam("claimNo") String claimNo);
	
	@PUT
	@Path("/submit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid policyid  supplied"),
	          @ApiResponse(code = 404, message = "Customer not found")})
	@ApiOperation(httpMethod="PUT", value = "Claim Submit ", response=ClaimStatus.class, tags={ "Claim Submit",  })
	public ClaimStatus submitClaim( Claim claim);
}
