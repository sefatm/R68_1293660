/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgnt.ui;

/**
 *
 * @author Sefat Mahmud
 */
public class Student {
    private int id;
    private String name;
    private String subject;
    private double marks;
    private double fees;

    public Student(int id, String name, String subject, double marks, double fees) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.fees = fees;
    }

    Student() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
