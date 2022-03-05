package com.thinkitive.auditlog;

import java.util.List;

public interface AuditLogService {
	List<AuditLog> getAuditDetails(Integer pageNo, Integer pageSize);

	List<AuditLog> retrieveAuditLogs(String ehr,Integer pageNo, Integer pageSize);
}
