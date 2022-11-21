package com.lhm.testdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhm.testdemo.entity.StudentInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 学生信息表(StudentInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-21 10:47:04
 */
@Component
@SuppressWarnings("uncheck")
public interface StudentInfoDao extends BaseMapper<StudentInfo> {


}

