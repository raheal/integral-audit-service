package com.integral.audit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integral.audit.domain.Audit;
import com.integral.audit.dto.Event;
import com.integral.audit.repository.AuditRepository;

@Service
public class AuditServiceImpl implements AuditService {

	@Autowired
	private AuditRepository auditRepository;
	
	@Override
	public void logEvent(Event e) {
		auditRepository.save(Audit.getInstance(e));
	}

}
