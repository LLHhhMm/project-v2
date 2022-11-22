package com.lhm.testdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhm.testdemo.entity.StudentInfo;
import org.springframework.stereotype.Component;

/**
 * 学生信息表(StudentInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-21 10:47:04
 */
@Component
public interface StudentInfoDao extends BaseMapper<StudentInfo> {


}

