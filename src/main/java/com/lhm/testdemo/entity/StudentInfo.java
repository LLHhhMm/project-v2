package com.lhm.testdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lhm.testdemo.common.QueryRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 学生信息表(StudentInfo)实体类
 *
 * @author makejava
 * @since 2022-11-21 10:47:05
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("student_info")
public class StudentInfo extends QueryRequest implements Serializable {
    private static final long serialVersionUID = -72150314518218905L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别 1男 2女
     */
    private Integer sex;
    /**
     * 学生年龄
     */
    private Integer age;
    /**
     * 学号
     */
    private Integer number;
    /**
     * 班级
     */
    private String classes;
    /**
     * 学生状态
     */
    private String state;
    /**
     * 学生地址
     */
    private String address;
    /**
     * 联系电话
     */
    private String phone;

}

