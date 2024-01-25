/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_system;

/**
 *
 * @author youssef
 */
public class employee extends person {

    protected double salary;
    protected String job;

    public employee() {
        salary = 1000;
        job = "teacher";
    }

    public employee(String n, int a, String add, String nat, double sal, String j) {
        super(n, a, add, nat);
        this.salary = sal;
        this.job = j;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        super.toString();
        return "employee{" + "salary=" + salary + ", job=" + job + '}';
    }
}
