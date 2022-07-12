/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isimtl.students.services;

import com.isimtl.students.models.Student;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author isi
 */
//     class compareByName implements Comparator<Student> {
//  
//    // override the compare() method
//      public int compareByName(Student a, Student b)
//    {
//        return a.getFullName().compareTo(b.getFullName());
//    }
//}
public class StudentService {
    HashMap<String, Student> students = new HashMap<String, Student>();
    private static int id = 1001;
public ArrayList<Student> getStudentlist(){
    // Create an ArrayList object
            ArrayList<Student> studentList = new ArrayList<Student>(); // Create an ArrayList object
         for(HashMap.Entry<String, Student> set :
             students.entrySet()) {
           studentList.add(set.getValue());
           
        }
        return studentList;
    }

    public StudentService() {
        String newId= String.valueOf(id);
        students.put(newId, new Student(newId,"Rahul","Nathani",LocalDateTime.now(),true));
        id++;
        newId =String.valueOf(id);
        students.put(newId, new Student(newId,"Het","Patel",LocalDateTime.now(),false));
        id++;
        newId =String.valueOf(id);
        students.put(newId, new Student(newId,"Omkar","Singh",LocalDateTime.now(),true));
        id++;
        newId =String.valueOf(id);
        students.put(newId, new Student(newId,"Harmeet","Singh",LocalDateTime.now(),false));
    }
    public Student getStudent(String id){
        if (id==null) {
            throw new IllegalArgumentException("ID IS NULL");
        }
        if(students.containsKey(id)){
            return students.get(id);
        }
        
        return null;
    }
    public boolean isEnrolled(String id){
        if (id==null) {
            throw new IllegalArgumentException("ID IS NULL");
        }
       return students.containsKey(id);
    }
    
}
