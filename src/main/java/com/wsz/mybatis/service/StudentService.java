package com.wsz.mybatis.service;

import com.wsz.mybatis.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> findAll();

    Student findOne(int id);

    Student findByUsername(String username);

    void findByUname(Map<String,Object> map );

    List<Student> findByRealname(String realname);

    int saveStudent(Student student);

    int batchSaveStudent(List<Student> students);

    int updateStudent(Student student);

    int deleteUser(int id);

    int batchDeleteStudent(List<Integer> ids);

}
