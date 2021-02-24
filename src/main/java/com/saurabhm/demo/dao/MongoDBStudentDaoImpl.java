package com.saurabhm.demo.dao;

import com.saurabhm.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("MongoDB")
public class MongoDBStudentDaoImpl implements StudentDao{

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students =  new ArrayList<>();
        students.add(new Student(UUID.randomUUID(), 29, "Virat", "Kohli", "Cricket" ));
        return students;
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return 0;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        return 0;
    }
}
