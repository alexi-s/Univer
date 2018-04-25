package com.domain;

/**
 * Created by student on 25.04.2018.
 */
public abstract class Human {

    private String firstName;
    private String lastName;
    private String middleName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (firstName != null ? !firstName.equals(human.firstName) : human.firstName != null) return false;
        if (lastName != null ? !lastName.equals(human.lastName) : human.lastName != null) return false;
        return middleName != null ? middleName.equals(human.middleName) : human.middleName == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
