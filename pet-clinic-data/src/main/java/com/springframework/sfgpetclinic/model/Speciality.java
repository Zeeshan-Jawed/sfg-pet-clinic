package com.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {
    private String discription;

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
