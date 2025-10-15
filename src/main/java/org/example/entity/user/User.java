package org.example.entity.user;

import java.time.LocalDate;

public class User {
    // フィールド
    private Name firstName;
    private Name lastName;
    private Email email;
    private Password password;
    private Address address;
    private PhoneNumber phoneNumber;
    private BirthDate birthDate;
    private Gender gender;

    // コンストラクタ
    public User(Name firstName, Name lastName, Email email, Password password, Address address, PhoneNumber phoneNumber, BirthDate birth, Gender gender) {
        if (firstName == null || lastName == null || email == null || password == null || address == null || phoneNumber == null || birth == null || gender == null) {
            throw new IllegalArgumentException("必須フィールドがnullです。");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birth;
        this.gender = gender;
    }

    // toString
    @Override
    public String toString() {
        return "User{" +
                "firstName=" + firstName.getFirstName() +
                ", lastName=" + lastName.getFirstName() +
                ", email=" + email.getEmail() +
                ", password=" + password.getPassword() +
                ", address=" + address.getAddress() +
                ", phoneNumber=" + phoneNumber.getPhoneNumber() +
                ", birthDate=" + birthDate.getBirthDate() +
                ", gender=" + gender.getGender() +
                '}';
    }

    // getters
    public Name getFirstName() {
        return firstName;
    }

    public Name getLastName() {
        return lastName;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }
}
