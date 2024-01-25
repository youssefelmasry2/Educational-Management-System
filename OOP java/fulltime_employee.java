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
public class fulltime_employee extends employee {

    private double bonus;
    private double deduction;

    public fulltime_employee() {
        bonus = 0;
        deduction = 0;
    }

    public fulltime_employee(String n, int a, String add, String nat, double sal, String j, double b, double d) {
        super(n, a, add, nat, sal, j);
        this.bonus = b;
        this.deduction = d;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public double getSalary() {
        return (salary + bonus) - deduction;
    }

    @Override
    public String toString() {
        super.toString();
        return "fulltime_employee{" + "bonus=" + bonus + ", deduction=" + deduction + '}';
    }

}
