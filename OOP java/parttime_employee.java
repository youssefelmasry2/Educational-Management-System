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
public class parttime_employee extends employee {

    private double working_hours;
    private double hour_price;

    public parttime_employee() {
        this.working_hours = 1;
        this.hour_price = 50;
    }

    public parttime_employee(String n, int a, String add, String nat, double sal, String j, double wh, double hp) {
        super(n, a, add, nat, sal, j);
        this.working_hours = wh;
        this.hour_price = hp;
    }

    public double getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(double working_hours) {
        this.working_hours = working_hours;
    }

    public double getHour_price() {
        return hour_price;
    }

    public void setHour_price(double hour_price) {
        this.hour_price = hour_price;
    }

    @Override
    public double getSalary() {
        return (working_hours * hour_price) + salary;

    }

    @Override
    public String toString() {
        super.toString();
        return "parttime_employee{" + "working_hours=" + working_hours + '}';
    }
}
