package com.lhm.testdemo.common;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author lhm
 */
@Data
public class QueryRequest {

    @TableField(exist = false)
    private Integer currentPage;
    @TableField(exist = false)
    private Integer pageSize;
    @TableField(exist = false)
    private Integer total;



}
