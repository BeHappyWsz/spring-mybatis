package com.wsz.mybatis.dao;

import com.wsz.mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author wsz
 * @Des:
 * @Date: 2017/11/14
 */
@Repository
@Mapper
public interface StudentDao {

    List<Student> findAll();

    Student findOne(int id);

    Student findByUsername(String username);

    List<Student> findByRealname(String realname);

    int saveStudent(Student student);

    int batchSaveStudent(List<Student> students);

    int updateStudent(Student student);

    int deleteUser(int id);

    int batchDeleteStudent(List<Integer> ids);
}
