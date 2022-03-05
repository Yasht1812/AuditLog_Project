package com.thinkitive.auditlog;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuditLogMapper {
	
	@Autowired
	AuditLog auditLog;

	public AuditLogDTO convertToDto(AuditLog auditLog) {
		ModelMapper mapper = new ModelMapper();
		AuditLogDTO auditLogDTO = mapper.map(auditLog, AuditLogDTO.class);
		return auditLogDTO;
	}

	
}
