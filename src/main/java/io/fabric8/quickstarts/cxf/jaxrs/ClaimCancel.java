package io.fabric8.quickstarts.cxf.jaxrs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;
@JsonInclude(Include.NON_EMPTY)

public class ClaimCancel {
	@ApiModelProperty( example = "CA233343434", value = "Claim Number")
	private String claimNo;
	@ApiModelProperty( example = "FEB022017022110", value = "Confirmation number")
	private String confNumber;
	@ApiModelProperty( example = "CLOSED", value = "Claim Status value")
	private String status;

	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getConfNumber() {
		return confNumber;
	}
	public void setConfNumber(String confNumber) {
		this.confNumber = confNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
