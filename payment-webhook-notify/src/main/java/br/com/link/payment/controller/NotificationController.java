 package br.com.link.payment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.link.payment.dto.TransactionCompletionNotificationJSON;
import br.com.link.payment.dto.TransactionCompletionNotificationPOST;
import jakarta.servlet.http.HttpServletRequest;



@RestController
@RequestMapping("/notifications")
public class NotificationController {

	
	/*
	@PostMapping("/transaction/post")
	public ResponseEntity<TransactionCompletionNotificationPOST> transactionCompletionPOST(@RequestBody TransactionCompletionNotificationPOST dto) {
        try {
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
		
            ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
			System.out.println(json);
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
	*/
	
	
	@PostMapping("/transaction/post")
	public ResponseEntity<TransactionCompletionNotificationPOST> transactionCompletionPOST(HttpServletRequest request) {
        Map<String, String> params = new HashMap<>();
        
    
        request.getParameterMap().forEach((key, value) -> {
            params.put(key, value[0]);
        });


        params.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        return ResponseEntity.ok().build(); 
    }
	
	
	@PostMapping("/transaction/json")
	public ResponseEntity<TransactionCompletionNotificationJSON> transactionCompletionJSON(HttpServletRequest request) {
        Map<String, String> params = new HashMap<>();
        
        
        request.getParameterMap().forEach((key, value) -> {
            params.put(key, value[0]);
        });

        params.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        return ResponseEntity.ok().build(); 
    }
	
	@PostMapping("/status/change")
	public ResponseEntity<TransactionCompletionNotificationJSON> statusChange(HttpServletRequest request) {
        Map<String, String> params = new HashMap<>();
       
        request.getParameterMap().forEach((key, value) -> {
            params.put(key, value[0]);
        });

        params.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        return ResponseEntity.ok().build();
    }

}
