package com.thinkitive.auditlog;

public class AuditLogDTO {
	private int id;
	private String ehr;
	private String method;
	private String request_body;
	private String request_url;
	private String response_body;
	private String response_status;
	private String timestamp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEhr() {
		return ehr;
	}
	public void setEhr(String ehr) {
		this.ehr = ehr;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getRequest_body() {
		return request_body;
	}
	public void setRequest_body(String request_body) {
		this.request_body = request_body;
	}
	public String getRequest_url() {
		return request_url;
	}
	public void setRequest_url(String request_url) {
		this.request_url = request_url;
	}
	public String getResponse_body() {
		return response_body;
	}
	public void setResponse_body(String response_body) {
		this.response_body = response_body;
	}
	public String getResponse_status() {
		return response_status;
	}
	public void setResponse_status(String response_status) {
		this.response_status = response_status;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "AuditLogDTO [id=" + id + ", ehr=" + ehr + ", method=" + method + ", request_body=" + request_body
				+ ", request_url=" + request_url + ", response_body=" + response_body + ", response_status="
				+ response_status + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
