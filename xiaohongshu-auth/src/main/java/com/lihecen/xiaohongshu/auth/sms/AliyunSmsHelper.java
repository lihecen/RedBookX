package com.lihecen.xiaohongshu.auth.sms;

import com.aliyun.dypnsapi20170525.Client;
import com.aliyun.dypnsapi20170525.models.SendSmsVerifyCodeRequest;
import com.aliyun.dypnsapi20170525.models.SendSmsVerifyCodeResponse;
import com.aliyun.teautil.models.RuntimeOptions;
import com.lihecen.framework.common.util.JsonUtils;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AliyunSmsHelper {
    @Resource
    private Client client;

    /**
     * 发送短信
     * @param signName
     * @param templateCode
     * @param phone
     * @param templateParam
     * @return
     */
     public boolean sendMessage(String signName, String templateCode, String phone, String templateParam) {
         SendSmsVerifyCodeRequest request = new SendSmsVerifyCodeRequest().setSignName(signName)
                 .setTemplateCode(templateCode)
                 .setTemplateParam(templateParam)
                 .setPhoneNumber(phone);
         RuntimeOptions runtime = new RuntimeOptions();
         try {
             log.info("==> 开始短信发送, phone: {}, signName: {}, templateCode: {}, templateParam: {}", phone, signName,templateCode,templateParam);
             // 发送短信
             SendSmsVerifyCodeResponse response = client.sendSmsVerifyCodeWithOptions(request, runtime);
             log.info("==> 短信发送成功, response: {}", JsonUtils.toJsonString(response));
             return true;
         } catch (Exception error) {
             log.error("==> 短信发送失误: ", error);
             return false;
         }
     }
}
