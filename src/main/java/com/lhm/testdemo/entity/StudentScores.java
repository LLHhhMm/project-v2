package com.lhm.testdemo.entity;

import lombok.Builder;

import java.io.Serializable;

/**
 * (StudentScores)实体类
 *
 * @author makejava
 * @since 2022-10-16 09:02:18
 */
public class StudentScores implements Serializable {
    private static final long serialVersionUID = 676333744540550510L;
    
    private Integer id;
    
    private Integer studentId;
    
    private Integer language;
    
    private Integer math;
    
    private Integer english;
    
    private String classid;
    
    private String departmentid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

}

