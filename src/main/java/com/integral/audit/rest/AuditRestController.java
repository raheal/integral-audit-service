package com.integral.audit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integral.audit.dto.Event;
import com.integral.audit.service.AuditService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/api/v1")
@RestController
public class AuditRestController {

	@Autowired
	private AuditService auditService;
	
	@Operation(summary="Log an event", description="log an event from a running microservice", tags= {"events"})
	@ApiResponse(responseCode="200", description="Successful Operation")
	@ApiResponse(responseCode="500", description="Internal Server Error")
	@PostMapping("/log/event")
	public Boolean logEvent(@RequestBody Event event) {
		auditService.logEvent(event);
		return true;
	}
}
