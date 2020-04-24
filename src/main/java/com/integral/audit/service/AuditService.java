package com.integral.audit.service;

import com.integral.audit.dto.Event;

public interface AuditService {

	void logEvent(final Event e);
	
}
