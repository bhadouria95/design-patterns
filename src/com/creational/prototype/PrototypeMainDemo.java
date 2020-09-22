package com.creational.prototype;

import java.util.List;

public class PrototypeMainDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew2 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list2 = empsNew2.getEmpList();
        list2.remove("Pankaj");


        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + empsNew.getEmpList());
        System.out.println("empsNew2 List: " + empsNew2.getEmpList());
    }
}
