package com.khazan.rcmp.framework.common.pojo;

import java.util.Collection;
import java.util.Collections;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 集合结果
 * @author TP
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MultiResponse<T> extends Response {

	private static final long serialVersionUID = 1L;

	private Collection<T> data;

	public Collection<T> getData() {
		return data == null ? Collections.emptyList() : data;
	}

	public boolean isEmpty() {
		return data == null || data.isEmpty();
	}

	public boolean isNotEmpty() {
		return !isEmpty();
	}

}
