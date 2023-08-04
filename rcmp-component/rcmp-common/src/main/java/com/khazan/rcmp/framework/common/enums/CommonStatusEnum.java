package com.khazan.rcmp.framework.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import com.khazan.rcmp.framework.common.core.IntMapValuable;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用状态枚举
 * @author TP
 */
@Getter
@AllArgsConstructor
public enum CommonStatusEnum implements IntMapValuable {
	/**
	 * 0 - 关闭
	 */
	DISABLE(0, "关闭"),
	/**
	 * 1 - 开启
	 */
	ENABLE(1, "开启"),;

	private final Integer status;
	private final String name;

	public static final Map<Integer, String> MAP = Arrays.stream(values())
			.collect(Collectors.toMap(CommonStatusEnum::getStatus, CommonStatusEnum::getName));

	@Override
	public Map<Integer, String> map() {
		return null;
	}
}
