package io.fabric8.quickstarts.cxf.jaxrs;



import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Claim {
	
	public String getPolno() {
		return polno;
	}

	public void setPolno(String polno) {
		this.polno = polno;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@ApiModelProperty( example = "CA233343434", value = "Policy Number")
	@JsonProperty
	private String polno;
	@ApiModelProperty( example = "FEB022017022110", value = "Cutomer ID ")
	@JsonProperty
	private String custId;
	@ApiModelProperty( example = "PDS1111", value = "Provider ID")
	@JsonProperty
	private String providerId;
	@ApiModelProperty( example = "DRUG", value = "Claim Type")
	@JsonProperty
	private String type;
	@ApiModelProperty( example = "12.2", value = "Claim amount")
	@JsonProperty
	private String amount;
	@ApiModelProperty( example = "FEB-12-2017", value = "Claim Date")
	private String date;

}
