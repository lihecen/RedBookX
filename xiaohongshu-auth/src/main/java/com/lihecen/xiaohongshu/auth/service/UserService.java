package com.lihecen.xiaohongshu.auth.service;

import com.lihecen.framework.common.response.Response;
import com.lihecen.xiaohongshu.auth.model.vo.user.UserLoginReqVO;

/**
 * @author: lihecen
 * @date: 2025/10/12 19:34
 * @version: v1.0.0
 * @description: TODO
 */
public interface UserService {
    /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);
}
