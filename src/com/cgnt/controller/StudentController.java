/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgnt.controller;

import com.cgnt.service.StudentService;
import com.cgnt.ui.Student;

/**
 *
 * @author Sefat Mahmud
 */
public class StudentController {
    public Student create(Student s){
        StudentService ss = new StudentService();
        Student s1 = ss.save(s);
        return s1;
    }
}
