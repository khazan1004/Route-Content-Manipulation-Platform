package com.khazan.rcmp.framework.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author TP
 */
@Data
@AllArgsConstructor
public class ErrorCode {

	/**
	 * 错误码
	 */
	private final Integer errCode;

	/**
	 * 错误提示
	 */
	private final String errMessage;

}
