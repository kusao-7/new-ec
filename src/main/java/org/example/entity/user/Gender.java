package org.example.entity.user;

public enum Gender {
    MALE("男性"),
    FEMALE("女性");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
