package com.lhm.testdemo.service;

import com.lhm.testdemo.entity.StudentScores;

import java.util.List;

/**
 * (StudentScores)表服务接口
 *
 * @author makejava
 * @since 2022-10-16 09:02:19
 */
public interface StudentScoresService {


    /**
     * 查询学生信息
     * @return
     */
    List<StudentScores> qryStudent();
}
