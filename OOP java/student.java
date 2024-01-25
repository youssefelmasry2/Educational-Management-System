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
public class student extends person {

    private int term;
    private String section;
    private double degrees;

    public student() {
        term = 1;
        section = "Science Science section";
        degrees = 0.0;
    }

    public student(String n, int a, String add, String nat, int t, String sec, double deg) {
        super(n, a, add, nat);
        this.term = t;
        this.section = sec;
        this.degrees = deg;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getDegrees() {
        return (degrees / 400) * 100;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        super.toString();
        return "student{" + "term=" + term + ", section=" + section + ", degrees=" + degrees + "%}";
    }
}
