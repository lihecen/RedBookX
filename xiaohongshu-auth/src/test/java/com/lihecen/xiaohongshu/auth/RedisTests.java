package com.lihecen.xiaohongshu.auth;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
@Slf4j
public class RedisTests {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * set key value
     */

    @Test
    public void testSetKeyValue() {
        // 添加一个 key 为 name, value 值为 栗赫岑
        redisTemplate.opsForValue().set("name", "栗赫岑");
    }

    /**
     * 判断某个 key 是否存在
     */
    @Test
    public void testHasKey() {
        log.info("key 是否存在: {}", Boolean.TRUE.equals(redisTemplate.hasKey("name")));
    }

    /**
     * 获取某个 key 的 value
     */
    @Test
    public void testGetValue() {
        log.info("value 值: {}", redisTemplate.opsForValue().get("name"));
    }

    /**
     * 删除某个 key
     */
    @Test
    public void testDelete() {
        redisTemplate.delete("name");
    }
}
