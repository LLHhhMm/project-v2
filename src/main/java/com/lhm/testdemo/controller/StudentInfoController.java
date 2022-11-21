package com.lhm.testdemo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lhm.testdemo.entity.StudentInfo;
import com.lhm.testdemo.service.StudentInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学生信息表(StudentInfo)表控制层
 *
 * @author makejava
 * @since 2022-11-21 10:47:03
 */
@RestController
@RequestMapping("studentInfo")
public class StudentInfoController {
    /**
     * 服务对象
     */
    @Resource
    private StudentInfoService studentInfoService;

    /**
     * 分页查询
     *
     * @param studentInfo 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<StudentInfo>> queryByPage(StudentInfo studentInfo) {
        Page<StudentInfo> studentInfoPage = studentInfoService.queryByPage(studentInfo);
        return ResponseEntity.ok(studentInfoPage);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public ResponseEntity<StudentInfo> queryById(@PathVariable("id") Integer id) {
        StudentInfo studentInfo = this.studentInfoService.queryById(id);
        System.out.println(studentInfo);
        return ResponseEntity.ok(studentInfo);
    }

    /**
     * 新增数据
     *
     * @param studentInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<StudentInfo> add(StudentInfo studentInfo) {
        return ResponseEntity.ok(this.studentInfoService.insert(studentInfo));
    }

    /**
     * 编辑数据
     *
     * @param studentInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<StudentInfo> edit(StudentInfo studentInfo) {
        return ResponseEntity.ok(this.studentInfoService.update(studentInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.studentInfoService.deleteById(id));
    }

}

