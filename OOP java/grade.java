/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_system;

import java.util.ArrayList;

/**
 *
 * @author youssef
 */
public class grade {

    private int grade_number;
    private ArrayList<student> stulist;

    public grade() {
        grade_number = 1;
        stulist = new ArrayList<student>();
    }

    public grade(int gn) {
        this.grade_number = gn;
        stulist = new ArrayList<student>();
    }

    public int getGrade_number() {
        return grade_number;
    }

    public void setGrade_number(int grade_number) {
        this.grade_number = grade_number;
    }

    public void add_student(student s) {
        stulist.add(s);
    }

    public void remove_student(int index) {
        stulist.remove(index);
    }

    public int getnumberofstudents() {
        return stulist.size();
    }

    public void print_stu_data() {
        for (int i = 0; i < stulist.size(); i++) {
            System.out.println(stulist.get(i).getName() + " " + stulist.get(i).getDegrees() + "%");
        }
    }

}
