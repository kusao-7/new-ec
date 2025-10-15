package org.example.entity.user;

import java.time.LocalDate;

public class BirthDate {
    private LocalDate birthDate;

    public BirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
