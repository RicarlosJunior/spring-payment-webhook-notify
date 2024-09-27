package br.com.link.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionCompletionNotificationPOST {

	@JsonProperty("order_number")
	private String orderNumber;

	@JsonProperty("amount")
	private String amount;

	@JsonProperty("checkout_cielo_order_number")
	private String checkoutCieloOrderNumber;

	@JsonProperty("created_date")
	private String createdDate;

	@JsonProperty("customer_name")
	private String customerName;

	@JsonProperty("customer_phone")
	private String customerPhone;

	@JsonProperty("customer_identity")
	private String customerIdentity;

	@JsonProperty("customer_email")
	private String customerEmail;

	@JsonProperty("shipping_type")
	private String shippingType;

	@JsonProperty("shipping_price")
	private String shippingPrice;

	@JsonProperty("payment_method_type")
	private String paymentMethodType;

	@JsonProperty("payment_method_brand")
	private String paymentMethodBrand;

	@JsonProperty("payment_maskedcreditcard")
	private String paymentMaskedCreditCard;

	@JsonProperty("payment_installments")
	private String paymentInstallments;

	@JsonProperty("payment_antifraudresult")
	private String paymentAntifraudResult;

	@JsonProperty("payment_status")
	private String paymentStatus;

	@JsonProperty("tid")
	private String tid;

	@JsonProperty("test_transaction")
	private boolean testTransaction;

	@JsonProperty("product_id")
	private String productId;

	@JsonProperty("product_type")
	private String productType;

	@JsonProperty("product_description")
	private String productDescription;

	@JsonProperty("nsu")
	private String nsu;

	@JsonProperty("authorization_code")
	private String authorizationCode;

	@JsonProperty("start_date")
	private String startDate;

	@JsonProperty("recurrent_status")
	private String recurrentStatus;

	@JsonProperty("interval")
	private String interval;

	@JsonProperty("pagador_recurrent_payment_id")
	private String pagadorRecurrentPaymentId;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCheckoutCieloOrderNumber() {
		return checkoutCieloOrderNumber;
	}

	public void setCheckoutCieloOrderNumber(String checkoutCieloOrderNumber) {
		this.checkoutCieloOrderNumber = checkoutCieloOrderNumber;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerIdentity() {
		return customerIdentity;
	}

	public void setCustomerIdentity(String customerIdentity) {
		this.customerIdentity = customerIdentity;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(String shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public String getPaymentMethodType() {
		return paymentMethodType;
	}

	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	public String getPaymentMethodBrand() {
		return paymentMethodBrand;
	}

	public void setPaymentMethodBrand(String paymentMethodBrand) {
		this.paymentMethodBrand = paymentMethodBrand;
	}

	public String getPaymentMaskedCreditCard() {
		return paymentMaskedCreditCard;
	}

	public void setPaymentMaskedCreditCard(String paymentMaskedCreditCard) {
		this.paymentMaskedCreditCard = paymentMaskedCreditCard;
	}

	public String getPaymentInstallments() {
		return paymentInstallments;
	}

	public void setPaymentInstallments(String paymentInstallments) {
		this.paymentInstallments = paymentInstallments;
	}

	public String getPaymentAntifraudResult() {
		return paymentAntifraudResult;
	}

	public void setPaymentAntifraudResult(String paymentAntifraudResult) {
		this.paymentAntifraudResult = paymentAntifraudResult;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public boolean isTestTransaction() {
		return testTransaction;
	}

	public void setTestTransaction(boolean testTransaction) {
		this.testTransaction = testTransaction;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getRecurrentStatus() {
		return recurrentStatus;
	}

	public void setRecurrentStatus(String recurrentStatus) {
		this.recurrentStatus = recurrentStatus;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getPagadorRecurrentPaymentId() {
		return pagadorRecurrentPaymentId;
	}

	public void setPagadorRecurrentPaymentId(String pagadorRecurrentPaymentId) {
		this.pagadorRecurrentPaymentId = pagadorRecurrentPaymentId;
	}
	
}
