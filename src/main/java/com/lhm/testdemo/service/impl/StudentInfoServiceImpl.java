package com.lhm.testdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhm.testdemo.dao.StudentInfoDao;
import com.lhm.testdemo.entity.StudentInfo;
import com.lhm.testdemo.service.StudentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 学生信息表(StudentInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-11-21 10:47:06
 */
@Service("studentInfoService")
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoDao, StudentInfo> implements StudentInfoService{
    @Resource
    private StudentInfoDao studentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public StudentInfo queryById(Integer id) {
        return this.studentInfoDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param studentInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<StudentInfo> queryByPage(StudentInfo studentInfo) {

        Page<StudentInfo> page = new Page<>(1,5);
        return this.studentInfoDao.selectPage(page, new QueryWrapper<>());

    }

    /**
     * 新增数据
     *
     * @param studentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public StudentInfo insert(StudentInfo studentInfo) {
        this.studentInfoDao.insert(studentInfo);
        return studentInfo;
    }

    /**
     * 修改数据
     *
     * @param studentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public StudentInfo update(StudentInfo studentInfo) {
        this.studentInfoDao.update(studentInfo, new QueryWrapper<>());
        return this.queryById(studentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.studentInfoDao.deleteById(id) > 0;
    }
}
