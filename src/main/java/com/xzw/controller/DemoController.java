package com.xzw.controller;

import com.xzw.DO.TableInfoDO;
import com.xzw.service.TableInfoService;
import com.xzw.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 20:27
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private TableInfoService tableInfoService;

    @GetMapping("describe")
    public Result<List<TableInfoDO>> getTableInfo() {

        List<TableInfoDO> tableInfo = tableInfoService.getTableInfo("t_user");

        return Result.success(tableInfo);
    }

}
