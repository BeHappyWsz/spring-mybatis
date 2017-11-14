package com.wsz.mybatis.service.impl;

import com.wsz.mybatis.dao.StudentDao;
import com.wsz.mybatis.domain.Student;
import com.wsz.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wsz
 * @Des:
 * @Date: 2017/11/14
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findOne(int id) {
        return studentDao.findOne(id);
    }

    @Override
    public Student findByUsername(String username) {
        return studentDao.findByUsername(username);
    }

    @Override
    public List<Student> findByRealname(String realname) {
        return studentDao.findByRealname(realname);
    }

    @Override
    public int saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public int batchSaveStudent(List<Student> students) {
        return studentDao.batchSaveStudent(students);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int deleteUser(int id) {
        return studentDao.deleteUser(id);
    }

    @Override
    public int batchDeleteStudent(List<Integer> ids) {
        return studentDao.batchDeleteStudent(ids);
    }
}
