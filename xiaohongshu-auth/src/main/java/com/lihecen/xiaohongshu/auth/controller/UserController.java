package com.lihecen.xiaohongshu.auth.controller;

import com.lihecen.framework.biz.operationlog.aspect.ApiOperationLog;
import com.lihecen.framework.common.response.Response;
import com.lihecen.xiaohongshu.auth.model.vo.user.UserLoginReqVO;
import com.lihecen.xiaohongshu.auth.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lihecen
 * @date: 2025/10/12 19:42
 * @version: v1.0.0
 * @description: TODO
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录/注册")
    public Response<String> loginAndRegister(@Validated @RequestBody UserLoginReqVO userLoginReqVO) {
        return userService.loginAndRegister(userLoginReqVO);
    }
}
