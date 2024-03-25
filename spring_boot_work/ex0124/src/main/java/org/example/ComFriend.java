package org.example;

import lombok.ToString;

@ToString
public class ComFriend extends Friend{

    private String department;


    @Override
    public String toString() {
        return "ComFriend{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public ComFriend(String name, String department, String phone) {
        super(name,phone);
        this.department = department;


    }
}
