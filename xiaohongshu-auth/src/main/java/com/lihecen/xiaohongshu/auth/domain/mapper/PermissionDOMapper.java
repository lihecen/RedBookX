package com.lihecen.xiaohongshu.auth.domain.mapper;

import com.lihecen.xiaohongshu.auth.domain.dataobject.PermissionDO;

public interface PermissionDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionDO record);

    int insertSelective(PermissionDO record);

    PermissionDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionDO record);

    int updateByPrimaryKey(PermissionDO record);
}