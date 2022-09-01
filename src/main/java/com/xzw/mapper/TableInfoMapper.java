package com.xzw.mapper;

import com.xzw.DO.TableInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 21:07
 */
public interface TableInfoMapper {
    /**
     * 获取表结构
     * @param tableName
     * @return
     */
    List<TableInfoDO> describeTable(@Param("tableName") String tableName);
}
