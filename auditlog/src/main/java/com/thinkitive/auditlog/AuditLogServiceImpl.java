package com.thinkitive.auditlog;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
public class AuditLogServiceImpl implements AuditLogService {

	@Autowired
	AuditLogRepository auditLogRepository;

	public List<AuditLog> getAuditDetails(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<AuditLog> pagedResult = auditLogRepository.findAll(paging);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<AuditLog>();
		}
	}

	public List<AuditLog> getAuditLogsDetails(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<AuditLog> pagedResult = auditLogRepository.findAll(paging);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<AuditLog>();
		}
	}

	@Override
	public List<AuditLog> retrieveAuditLogs(String ehr, Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<AuditLog> pagedResult = auditLogRepository.findAll(paging);
		if (pagedResult.hasContent() && ehr.equals(null)) {
			List<AuditLog> list = pagedResult.getContent();
			return list;
		} else if (pagedResult.hasContent() && (!ehr.equals(null))) {
			List<AuditLog> list = auditLogRepository.findByEhr(ehr);
			return list;
		}

		return new ArrayList<AuditLog>();
	}

}
