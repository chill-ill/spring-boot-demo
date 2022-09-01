package com.xzw.service;

import com.xzw.DO.TableInfoDO;

import java.util.List;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 21:18
 */
public interface TableInfoService {

    List<TableInfoDO> getTableInfo(String tableName);

}
