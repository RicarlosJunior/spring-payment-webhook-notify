 package br.com.link.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.link.payment.dto.TransactionCompletionNotificationJSON;
import br.com.link.payment.dto.TransactionCompletionNotificationPOST;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/notifications")
public class NotificationController {

	@PostMapping("/transaction/post")
	public ResponseEntity<TransactionCompletionNotificationPOST> transactionCompletionPOST(@RequestBody TransactionCompletionNotificationPOST dto) {
        try {
        	System.out.println("Chamou recurso: transactionCompletionPOST ");
        	System.out.println("**************************************** ");
        	
        	ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
			System.out.println(json);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return ResponseEntity.ok().build();
	}
	
	@PostMapping("/transaction/json")
	public ResponseEntity<TransactionCompletionNotificationJSON> transactionCompletionJSON(@RequestBody TransactionCompletionNotificationJSON dto) {
		try {
			System.out.println("Chamou recurso: transactionCompletionJSON ");
        	System.out.println("**************************************** ");
			
            ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
			System.out.println(json);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/status/change")
	public ResponseEntity<TransactionCompletionNotificationJSON> statusChange(@RequestBody TransactionCompletionNotificationJSON dto) {
		try {
			System.out.println("Chamou recurso: statusChange ");
        	System.out.println("**************************************** ");
			
            ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
			System.out.println(json);
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
}
