package com.example.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employees em = new Employees("vikash " , 23 , 50000.00);
        System.out.println(em.getEmployeeDetails());
        em.setName("vishal");
        em.setAge(25);
        em.setSalary(45000.00);
        System.out.println(em.getEmployeeDetails());
    }
}
