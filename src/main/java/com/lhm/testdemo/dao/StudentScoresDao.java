package com.lhm.testdemo.dao;

import com.lhm.testdemo.entity.StudentScores;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (StudentScores)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-16 09:02:17
 */
@Component
public interface StudentScoresDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    List<StudentScores> queryById();

    /**
     * 查询指定行数据
     *
     * @param studentScores 查询条件
     * @return 对象列表
     */
    List<StudentScores> queryAllByLimit(StudentScores studentScores);

    /**
     * 统计总行数
     *
     * @param studentScores 查询条件
     * @return 总行数
     */
    long count(StudentScores studentScores);

    /**
     * 新增数据
     *
     * @param studentScores 实例对象
     * @return 影响行数
     */
    int insert(StudentScores studentScores);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<StudentScores> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<StudentScores> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<StudentScores> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<StudentScores> entities);

    /**
     * 修改数据
     *
     * @param studentScores 实例对象
     * @return 影响行数
     */
    int update(StudentScores studentScores);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}

