package com.lhm.testdemo.controller;

import com.lhm.testdemo.entity.StudentScores;
import com.lhm.testdemo.service.StudentScoresService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (StudentScores)表控制层
 *
 * @author makejava
 * @since 2022-10-16 09:02:17
 */
@RestController
@RequestMapping("/test")
public class StudentScoresController {
    /**
     * 服务对象
     */
    @Resource
    private StudentScoresService studentScoresService;


    @GetMapping("/qry")
    public List<StudentScores> qryStudentScores(){
        return studentScoresService.qryStudent();
    }






}

