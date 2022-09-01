package com.xzw.DO;

import lombok.Data;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 21:04
 */
@Data
public class TableInfoDO {

    /**
     * 字段名
     */
    private String field;

    /**
     * 字段类型
     */
    private String type;

    /**
     * 是否为空
     */
    private String isNull;

    /**
     * 键
     */
    private String key;

    /**
     * 默认值
     */
    private String defaultVal;

    /**
     * 额外信息
     */
    private String extra;
}
