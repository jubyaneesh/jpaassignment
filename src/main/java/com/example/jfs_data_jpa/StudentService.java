package com.example.jfs_data_jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private  StudentRepository studentRepository;


    //return all data

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }



    public Optional<Student> findOne(Long studentId) {
        return studentRepository.findById(studentId);
    }



   public List<Student> findByName(String studentName)
   {
       return studentRepository.findByName(studentName);
   }



  public void  addStudent(Student student)
  {
      studentRepository.save(student);

  }



   public void  deleteStudent(Long studentId)
   {
        studentRepository.deleteById(studentId);

   }






}
