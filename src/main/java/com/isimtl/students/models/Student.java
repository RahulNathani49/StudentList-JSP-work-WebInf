package com.isimtl.students.models;

import java.time.LocalDateTime;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isi
 */
public class Student {
    private static int nextId = 1001;
    private final String id;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private boolean graduated ;
    
    public Student(String id,String firstName,String lastName,LocalDateTime dateOfBirth,boolean graduated){
       nextId++;
        this.id = id;
        
        if (firstName==null || firstName=="")
            throw new IllegalArgumentException("First Name must not be Empty");
        if (lastName==null || lastName=="")
            throw new IllegalArgumentException("Last Name must not be Empty");
        if(dateOfBirth==null || dateOfBirth.isAfter(LocalDateTime.now()))
            throw new IllegalArgumentException("Date of Birth must not be Null or in be in future");
        
        this.firstName=firstName;  
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.graduated=graduated;
    }

    public String getId() {
        return id;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }
     public int getAge() {
         return LocalDateTime.now().getYear() - dateOfBirth.getYear();
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
          if (firstName==null || firstName=="")
            throw new IllegalArgumentException("First Name must not be Empty");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName==null || lastName=="")
            throw new IllegalArgumentException("Last Name must not be Empty");
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        if(dateOfBirth==null) 
            throw new IllegalArgumentException("Date of Birth must not be Null");
        if(dateOfBirth.isAfter(LocalDateTime.now()))
            throw new IllegalArgumentException("Date of Birth must not be in future");
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return  "Student : "+id+ " "+getFullName();
    }
    
    
}
