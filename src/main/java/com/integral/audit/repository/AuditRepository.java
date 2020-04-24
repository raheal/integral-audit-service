package com.integral.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.integral.audit.domain.Audit;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Long> {

}
