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
public enum DeletedEnum {
    YES(true),
    NO(false);

    private final Boolean value;
}
