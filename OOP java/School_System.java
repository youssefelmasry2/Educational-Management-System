/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_system;

import java.util.Scanner;

/**
 *
 * @author youssef
 */
public class School_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0;
        int o = 0;

        System.out.print("ADD : (1- Employees 2- students ) : ");
        int z = sc.nextInt();

        if (z == 1) {
            System.out.print("Enter the department number : ");
            int y = sc.nextInt();
            System.out.print("Enter the department name : ");
            String v = sc.next();
            department d1 = new department(y, v);
            while (x != 3) {
                if (x == 0) {
                    System.out.print("Choose the number which you want to add : ");
                    System.out.print(" 1- Fulltime employee");
                    System.out.print(" 2- Parttime employee");
                    System.out.print(" (choose 3 to stop adding) : ");
                    x = sc.nextInt();
                }
                if (x == 1) {
                    System.out.print("name : ");
                    String n = sc.next();
                    System.out.print("age : ");
                    int a = sc.nextInt();
                    System.out.print("address : ");
                    String add = sc.next();
                    System.out.print("nationality : ");
                    String nat = sc.next();
                    System.out.print("salary : ");
                    double sal = sc.nextDouble();
                    System.out.print("job : ");
                    String j = sc.next();
                    System.out.print("bonus : ");
                    double b = sc.nextDouble();
                    System.out.print("deduction : ");
                    double d = sc.nextDouble();

                    fulltime_employee e1 = new fulltime_employee(n, a, add, nat, sal, j, b, d);
                    d1.add_employee(e1);
                    x = 0;
                } else if (x == 2) {
                    System.out.print("name : ");
                    String n = sc.next();
                    System.out.print("age : ");
                    int a = sc.nextInt();
                    System.out.print("address : ");
                    String add = sc.next();
                    System.out.print("nationality : ");
                    String nat = sc.next();
                    System.out.print("salary if there : ");
                    double sal = sc.nextDouble();
                    System.out.print("job : ");
                    String j = sc.next();
                    System.out.print("working hours : ");
                    double wh = sc.nextDouble();
                    System.out.print("hour price : ");
                    double hp = sc.nextDouble();

                    parttime_employee e2 = new parttime_employee(n, a, add, nat, sal, j, wh, hp);
                    d1.add_employee(e2);
                    x = 0;
                } else if (x > 3 || x < 1) {
                    System.out.print("your input is wrong");
                }

            }
            System.out.println(" ");
            d1.print_emp_data();
            System.out.println(" ");
        } else if (z == 2) {
            System.out.print("Enter the grade number : ");
            int c = sc.nextInt();
            grade g1 = new grade(c);
            while (o != 2) {
                if (o == 0) {
                    System.out.print("Choose (1) to add student , choose (2) to stop adding : ");
                    o = sc.nextInt();
                }
                if (o == 1) {
                    System.out.print("name : ");
                    String n = sc.next();
                    System.out.print("age : ");
                    int a = sc.nextInt();
                    System.out.print("address : ");
                    String add = sc.next();
                    System.out.print("nationality : ");
                    String nat = sc.next();
                    System.out.print("term : ");
                    int sal = sc.nextInt();
                    System.out.print("section : ");
                    String sec = sc.next();
                    System.out.print("degrees from 400 : ");
                    double deg = sc.nextDouble();

                    student s2 = new student(n, a, add, nat, sal, sec, deg);
                    g1.add_student(s2);
                    o = 0;

                } else if (o > 2 || o < 1) {
                    System.out.print("your input is wrong");
                    o = 0;
                }
            }
            System.out.println();
            g1.print_stu_data();
            System.out.println();
        }

    }

}
