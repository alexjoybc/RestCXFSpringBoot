package io.fabric8.quickstarts.cxf.jaxrs;

import io.swagger.annotations.ApiModelProperty;

public class ClaimStatus {
	@ApiModelProperty(example = "OPEN, PAID, PENDING", value = "Claim Status value")
	String status = "";
	@ApiModelProperty(example = "A12434343", value = "Customer Id under policy")
	String custId = "";
	@ApiModelProperty(example = "PO882828", value = "Policy number")
	String polno ="";
	@ApiModelProperty(example = "CL232324232", value = "Claim number") 
	String claimNo="";
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustID() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPolno() {
		return polno;
	}
	public void setPolno(String polno) {
		this.polno = polno;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
}