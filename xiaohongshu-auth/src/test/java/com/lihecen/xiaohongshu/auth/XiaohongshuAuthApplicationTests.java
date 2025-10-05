package com.lihecen.xiaohongshu.auth;

import com.lihecen.framework.common.util.JsonUtils;
import com.lihecen.xiaohongshu.auth.domain.dataobject.UserDO;
import com.lihecen.xiaohongshu.auth.domain.mapper.UserDOMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class XiaohongshuAuthApplicationTests {
    @Resource
    private UserDOMapper userDOMapper;

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        UserDO userDO = UserDO.builder().username("栗赫岑").createTime(LocalDateTime.now()).updateTime(LocalDateTime.now()).build();
        userDOMapper.insert(userDO);
    }

    /**
     * 查询数据
     */
    @Test
    void testSelect() {
        // 查询主键 ID 为 2 的记录
        UserDO userDO = userDOMapper.selectByPrimaryKey(2L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }

    /**
     * 更新数据
     */
    @Test
    void testUpdate() {
        UserDO userDO = UserDO.builder().id(2L).username("lihecen").updateTime(LocalDateTime.now()).createTime(LocalDateTime.now()).build();
        //　根据主键 ID 更新记录
        userDOMapper.updateByPrimaryKey(userDO);
    }

    /**
     * 删除数据
     */
    @Test
    void testDelete() {
        //　删除主键 ID　为 1 的记录
        userDOMapper.deleteByPrimaryKey(2L);
    }
}
