package com.lhm.testdemo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lhm.testdemo.entity.StudentInfo;

/**
 * 学生信息表(StudentInfo)表服务接口
 *
 * @author makejava
 * @since 2022-11-21 10:47:06
 */
public interface StudentInfoService extends IService<StudentInfo> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StudentInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param studentInfo 筛选条件
     * @return 查询结果
     */
    Page<StudentInfo> queryByPage(StudentInfo studentInfo);

    /**
     * 新增数据
     *
     * @param studentInfo 实例对象
     * @return 实例对象
     */
    StudentInfo insert(StudentInfo studentInfo);

    /**
     * 修改数据
     *
     * @param studentInfo 实例对象
     * @return 实例对象
     */
    StudentInfo update(StudentInfo studentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
