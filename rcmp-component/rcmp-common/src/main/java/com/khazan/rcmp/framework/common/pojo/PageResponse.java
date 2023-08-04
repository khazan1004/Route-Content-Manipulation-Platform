package com.khazan.rcmp.framework.common.pojo;

import java.util.Collection;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页结果
 * @author TP
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PageResponse<T> extends Response {

	private static final long serialVersionUID = 1L;

	/**
	 * 页码
	 */
	private int pageIndex = 1;

	/**
	 * 页大小
	 */
	private int pageSize = 1;

	/**
	 * 总数量
	 */
	private int totalCount = 0;

	private Collection<T> data;

}
