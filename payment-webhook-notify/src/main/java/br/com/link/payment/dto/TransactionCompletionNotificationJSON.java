package br.com.link.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionCompletionNotificationJSON {

	@JsonProperty("MerchantId")
	private String merchantId;

	@JsonProperty("MerchantOrderNumber")
	private String merchantOrderNumber;

	@JsonProperty("Url")
	private String url;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantOrderNumber() {
		return merchantOrderNumber;
	}

	public void setMerchantOrderNumber(String merchantOrderNumber) {
		this.merchantOrderNumber = merchantOrderNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
