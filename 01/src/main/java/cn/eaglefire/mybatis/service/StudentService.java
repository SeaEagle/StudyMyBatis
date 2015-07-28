package cn.eaglefire.mybatis.service;

import cn.eaglefire.mybatis.entity.Student;
import cn.eaglefire.mybatis.mapper.StudentMapper;
import cn.eaglefire.mybatis.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhenghy on 2015/7/27.
 */
public class StudentService {

    public List<Student> findAllStudents(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findAllStudents();
        }finally {
            sqlSession.close();
        }
    }

    public Student findStudentById(Integer id){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findStudentById(id);
        }finally {
            sqlSession.close();
        }
    }

    public void insertStudent(Student student){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

}
