package com.thinkitive.auditlog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditLogController {

	@Autowired
	private AuditLogService auditLogService;
	@Autowired
	AuditLogMapper auditLogMapper;
	

	@GetMapping("/audit-log-show-details")
	public List<AuditLog> getAuditData(@RequestParam Integer pageNo, @RequestParam Integer pageSize) {
		return auditLogService.getAuditDetails(pageNo, pageSize);
	}

	@GetMapping("/audit-log")
	public List<AuditLogDTO> getAuditLogs(@RequestParam Integer pageNo, @RequestParam Integer pageSize) {

		List<AuditLog> auditLogs = (List<AuditLog>) auditLogService.getAuditDetails(pageNo, pageSize);
		List<AuditLogDTO> list = new ArrayList<AuditLogDTO>();
		auditLogs.stream().forEach(auditLog -> {
			list.add(auditLogMapper.convertToDto(auditLog));
		});
		return list;

	}

	@GetMapping("/retrieve-audit-log")
	public List<AuditLog> getAuditLogs(@RequestParam(name = "ehr") String ehr, @RequestParam Integer pageNo,
			@RequestParam Integer pageSize) {
		return auditLogService.retrieveAuditLogs(ehr, pageNo, pageSize);
	}
}
