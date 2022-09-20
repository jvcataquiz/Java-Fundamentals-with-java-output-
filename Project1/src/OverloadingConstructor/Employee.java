package OverloadingConstructor;

import StudentSimulation.StudentInfo;

public class Employee {
    private String firstName, lastName;
    private String title, address , gender;


    Employee(String firstName, String lastname, String gender){
        this.firstName = firstName;
        this.lastName = lastname;
        this.gender =gender;


    }
    Employee(String firstName, String lastname, String title, String address, String gender){
        this.firstName = firstName;
        this.lastName = lastname;
        this.title = title;
        this.address = address;
        this.gender =gender;


    }
}
