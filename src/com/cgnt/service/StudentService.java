/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgnt.service;

import com.cgnt.dao.StudentDAO;
import com.cgnt.ui.Student;

/**
 *
 * @author Sefat Mahmud
 */
public class StudentService {
    public Student save(Student s){
        StudentDAO sdao = new StudentDAO();
        return sdao.insert(s);
    }
}
