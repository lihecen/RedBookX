// 初始化一个短信发送客户端
package com.lihecen.xiaohongshu.auth.sms;

import com.aliyun.dypnsapi20170525.Client;
import com.aliyun.teaopenapi.models.Config;
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
    public Client smsClient() {
        try {
            Config config = new Config().setAccessKeyId(aliyunAccessKeyProperties.getAccessKeyId())
                    .setAccessKeySecret(aliyunAccessKeyProperties.getAccessKeySecret());
            config.endpoint = "dysmsapi.aliyuncs.com";
            return new Client(config);
        } catch (Exception e) {
            log.error("初始化阿里云短信发送客户端失误: ", e);
            return null;
        }
    }
}
