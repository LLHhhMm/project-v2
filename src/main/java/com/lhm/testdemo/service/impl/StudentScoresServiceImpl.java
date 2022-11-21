package com.lhm.testdemo.service.impl;

import com.lhm.testdemo.entity.StudentScores;
import com.lhm.testdemo.dao.StudentScoresDao;
import com.lhm.testdemo.service.StudentScoresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentScores)表服务实现类
 *
 * @author makejava
 * @since 2022-10-16 09:02:19
 */
@Service("studentScoresService")
public class StudentScoresServiceImpl implements StudentScoresService {
    @Resource
    private StudentScoresDao studentScoresDao;


    @Override
    public List<StudentScores> qryStudent() {

        StudentScores studentScores = new StudentScores();
        studentScores.setId(1);
        studentScores.setStudentId(111);
        return studentScoresDao.queryAllByLimit(studentScores);


    }
}
