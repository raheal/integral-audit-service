package com.integral.audit.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.integral.audit.dto.Event;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_audit")
@Getter
@Setter
public class Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long oid;
	
	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "event_name")
	private String eventName;
	
	@Column(name = "event_timestamp")
	private LocalDateTime eventTimestamp;
	
	private String payload;
	
	public static Audit getInstance(final Event e) {
		final Audit audit = new Audit();
		audit.setServiceName(e.getServiceName());
		audit.setEventName(e.getEventName());
		audit.setEventTimestamp((e.getEventTimestamp() == null) ? LocalDateTime.now() : e.getEventTimestamp());
		audit.setPayload(e.getPayload());
		return audit;
	}
	
	
}
