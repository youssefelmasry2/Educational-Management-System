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
public class department {

    private int department_number;
    private String department_name;
    private ArrayList<employee> emplist;

    public department() {
        department_number = 1;
        department_name = "school";
        emplist = new ArrayList<employee>();
    }

    public department(int dnu, String dna) {
        this.department_number = dnu;
        this.department_name = dna;
        emplist = new ArrayList<employee>();
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public void add_employee(employee e) {
        emplist.add(e);
    }

    public void remove_employee(int index) {
        emplist.remove(index);
    }

    public int getnumberofemployees() {
        return emplist.size();
    }

    public void print_emp_data() {
        for (int i = 0; i < emplist.size(); i++) {
            System.out.println(emplist.get(i).getName() + " " + emplist.get(i).getSalary());
        }
    }
}
