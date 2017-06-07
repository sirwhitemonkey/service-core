package com.moxion.model;

/**
 * Response
 *
 */
public class Response {
	private Integer responseCode;
	private Object data;
	private Boolean hasError;
	
	/**
	 * Constructor
	 */
	public Response() {
		
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

}
