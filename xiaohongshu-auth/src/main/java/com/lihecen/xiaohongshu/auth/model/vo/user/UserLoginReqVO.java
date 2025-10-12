package com.lihecen.xiaohongshu.auth.model.vo.user;

import com.lihecen.framework.common.validator.PhoneNumber;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * @author:  lihecen
 * @date: 2025/10/08 18:33
 * @version: v1.0.0
 * @description: 用户登录（支持密码和验证码两种方式）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginReqVO {
    /**
     * 手机号
     */
    @NotBlank(message = "手机号不能为空")
    @PhoneNumber
    private String phone;

    /**
     * 验证码
     */
    private String code;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录类型: 手机号验证码, 或者是账号密码
     */
    @NotNull(message = "登录类型不能为空")
    private Integer type;
}
