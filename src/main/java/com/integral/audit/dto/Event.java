package com.integral.audit.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Event {
	
	@NotBlank
	@Schema(description="The name of the service this event is logged from", example="download-service", required=true)
	private String serviceName;
	
	@NotBlank
	@Schema(description="The name of the event being logged", example="event.download.submitted", required=true)
	private String eventName;
	
	@NotBlank
	@Schema(description="Date and time of the event being logged", example="yyyyMMdd HH:mm:ss", required=true)
	private LocalDateTime eventTimestamp;	
	
	@Schema(description="The payload (if any) that was used in the event", example="{}", required=false)
	private String payload;

	
}
