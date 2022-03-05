package com.thinkitive.auditlog;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends PagingAndSortingRepository<AuditLog, Integer> {
	public List<AuditLog> findByEhr(String ehr);
}
