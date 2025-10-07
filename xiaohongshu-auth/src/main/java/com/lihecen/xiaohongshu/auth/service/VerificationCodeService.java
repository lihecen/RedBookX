package com.lihecen.xiaohongshu.auth.service;

import com.lihecen.framework.common.response.Response;
import com.lihecen.xiaohongshu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

public interface VerificationCodeService {
    /**
     * 发送短信验证码
     * @param sendVerificationCodeReqVO
     * @return
     */

    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}
