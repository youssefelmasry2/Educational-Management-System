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
public class person {

    protected String name;
    protected int age;
    protected String address;
    protected String nationality;

    public person() {
        name = "john mark johny ";
        age = 4;
        address = "liverpol st 34";
        nationality = "Egyptian";
    }

    public person(String n, int a, String add, String nat) {
        name = n;
        age = a;
        address = add;
        nationality = nat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", age=" + age + ", address=" + address + ", nationality=" + nationality + '}';
    }

}
