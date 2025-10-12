// 初始化一个短信发送客户端
package com.lihecen.xiaohongshu.auth.sms;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AliyunSmsClientConfig {
    @Resource
    private AliyunAccessKeyProperties aliyunAccessKeyProperties;
    @Bean
    public com.aliyun.dypnsapi20170525.Client smsClient() {
        try {
            com.aliyun.credentials.Client credential = new com.aliyun.credentials.Client();
            com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                    .setCredential(credential);
            // Endpoint 请参考 https://api.aliyun.com/product/Dypnsapi
            config.endpoint = "dypnsapi.aliyuncs.com";
            config.accessKeyId = aliyunAccessKeyProperties.getAccessKeyId();
            config.accessKeySecret = aliyunAccessKeyProperties.getAccessKeySecret();
            return new com.aliyun.dypnsapi20170525.Client(config);
        } catch (Exception e) {
            log.error("初始化阿里云短信发送客户端错误: ", e);
            return null;
        }
    }
}
