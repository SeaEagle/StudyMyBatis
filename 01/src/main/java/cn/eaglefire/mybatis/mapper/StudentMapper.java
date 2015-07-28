package cn.eaglefire.mybatis.mapper;

import cn.eaglefire.mybatis.entity.Student;

import java.util.List;

/**
 * Created by zhenghy on 2015/7/27.
 */
public interface StudentMapper {

    public List<Student> findAllStudents();

    public Student findStudentById(Integer id);

    public void insertStudent(Student student);

}
