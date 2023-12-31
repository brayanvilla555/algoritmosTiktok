package ArrayLis;

import java.time.LocalDate;

public class Persona {
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Persona(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Persona(String name) {
        this.name = name;
        this.surname = null;
        this.birthdate = null;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.birthdate;
    }
}
