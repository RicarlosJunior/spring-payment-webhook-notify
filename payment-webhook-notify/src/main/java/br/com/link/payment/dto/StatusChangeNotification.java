package br.com.link.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusChangeNotification {

	@JsonProperty("checkout_cielo_order_number")
	private String checkoutCieloOrderNumber;

	@JsonProperty("amount")
	private String amount;

	@JsonProperty("order_number")
	private String orderNumber;

	@JsonProperty("payment_status")
	private String paymentStatus;

	@JsonProperty("test_transaction")
	private boolean testTransaction; // "False" no JSON se torna false em Java

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("nsu")
	private String nsu;

	@JsonProperty("authorization_code")
	private String authorizationCode;

	public String getCheckoutCieloOrderNumber() {
		return checkoutCieloOrderNumber;
	}

	public void setCheckoutCieloOrderNumber(String checkoutCieloOrderNumber) {
		this.checkoutCieloOrderNumber = checkoutCieloOrderNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public boolean isTestTransaction() {
		return testTransaction;
	}

	public void setTestTransaction(boolean testTransaction) {
		this.testTransaction = testTransaction;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNsu() {
		return nsu;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	
}
