package com.lihecen.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: lihecen
 * @date: 2025/10/12 19:10
 * @description: 逻辑删除
 */
@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(0),
    // 禁用
    DISABLED(1);

    private final Integer value;
}
