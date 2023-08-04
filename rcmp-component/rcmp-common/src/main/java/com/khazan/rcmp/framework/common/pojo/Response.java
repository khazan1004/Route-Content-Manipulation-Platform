package com.khazan.rcmp.framework.common.pojo;

import com.khazan.rcmp.framework.common.exception.ErrorCode;

import lombok.Data;

/**
 * 无数据响应
 * @author TP
 */
@Data
public class Response {

	private static final long serialVersionUID = 1L;

	private boolean success;

	/**
	 * 错误码
	 */
	private Integer errCode;

	/**
	 * 错误提示
	 */
	private String errMessage;

	public static Response error(ErrorCode errorCode) {
		Response response = new Response();
		response.setSuccess(false);
		response.setErrCode(errorCode.getErrCode());
		response.setErrMessage(errorCode.getErrMessage());
		return response;
	}

}
