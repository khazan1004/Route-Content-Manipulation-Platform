package com.khazan.rcmp.framework.common.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 单记录结果
 * @author TP
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class SingleResponse<T> extends Response {

	private static final long serialVersionUID = 1L;

	private T data;

}
