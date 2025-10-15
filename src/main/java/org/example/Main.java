package org.example;

import org.example.entity.user.*;
import java.time.LocalDate;

public class Main {
    static void main() {
        System.out.println("Start application");
        System.out.println("Createing User Entity");

        Name firstName = new Name("Atsuki");
        Name lastName = new Name("Sekine");
        Email email = new Email("sekine3142@gmail.com");
        Password password = new Password("123456aA!");
        Prefecture prefecture = Prefecture.FUKUOKA;
        Address address = new Address(prefecture, "Japan");
        PhoneNumber phoneNumber = new PhoneNumber("090-1234-5678");
        BirthDate birthDate = new BirthDate(LocalDate.of(1995, 3, 14));
        Gender gender = Gender.FEMALE;

        User user = new User(firstName, lastName, email, password, address, phoneNumber, birthDate, gender);
        System.out.println("User Entity created");
        System.out.println(user);
    }
}
