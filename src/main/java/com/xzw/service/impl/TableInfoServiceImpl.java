package com.xzw.service.impl;

import com.xzw.DO.TableInfoDO;
import com.xzw.mapper.TableInfoMapper;
import com.xzw.service.TableInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 21:19
 */
@Service
public class TableInfoServiceImpl implements TableInfoService {

    @Autowired
    private TableInfoMapper tableInfoMapper;

    @Override
    public List<TableInfoDO> getTableInfo(String tableName) {
        return tableInfoMapper.describeTable(tableName);
    }
}
