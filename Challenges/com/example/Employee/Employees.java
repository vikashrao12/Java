package com.example.Employee;

public class Employees {
    private String name ;
    private int age ;
    private Double salary ;

    public Employees(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    String getEmployeeDetails (){
        return "Employee Details :  Name :"+ name+
                " , Age :" + age
                +" , Salary:"+salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
