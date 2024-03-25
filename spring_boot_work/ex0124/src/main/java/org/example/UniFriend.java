package org.example;

import lombok.ToString;

@ToString
public class UniFriend extends Friend {

    private String major;

    @Override
    public String toString() {
        return "UniFriend{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public UniFriend(String name, String major, String phone) {
        super(name,phone);
        this.major = major;


    }
}
