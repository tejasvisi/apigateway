package com.example.apigateway.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentDTO {
	private String orderId;
	private String paymentId;
	private String razorpaySignature;
}
