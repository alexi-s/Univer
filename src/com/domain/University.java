package com.domain;

import java.util.Arrays;

/**
 * Created by student on 25.04.2018.
 */
public class University {

    private String name;
    private String city;
    private int yearOfFound;
    private int accreditation;
    private Rector rector;
    private Administrator[] administrators;
    private Faculty[] faculties;

    private static final int INITIAL_SIZE = 100;

    private int administratorsLogicSize = 0;
    private int facultiesLogicSize = 0;

    {

        administrators = new Administrator[INITIAL_SIZE];
        faculties = new Faculty[INITIAL_SIZE];
    }

    public University() {
    }

    public University(String name, String city, int yearOfFound, int accreditation, Rector rector, Administrator[] administrators, Faculty[] faculties) {
        this.name = name;
        this.city = city;
        this.yearOfFound = yearOfFound;
        this.accreditation = accreditation;
        this.rector = rector;
        this.administrators = administrators;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfFound() {
        return yearOfFound;
    }

    public void setYearOfFound(int yearOfFound) {
        this.yearOfFound = yearOfFound;
    }

    public int getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(int accreditation) {
        this.accreditation = accreditation;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public Administrator[] getAdministrators() {
        return Arrays.copyOf(administrators, administratorsLogicSize);
    }

    public void setAdministrators(Administrator[] administrators) {
        this.administrators = administrators;
    }

    public Faculty[] getFaculties() {
        return Arrays.copyOf(faculties, facultiesLogicSize);
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    public void addAdministrator(Administrator administrator) {
        administrators[administratorsLogicSize++] = administrator;
    }

    public void addAdministrators(Administrator[] administrators) {
        for (int i = 0; i < administrators.length; i++) {
            addAdministrator(administrators[i]);
        }
    }

    public void addFaculty(Faculty faculty) {
        faculties[facultiesLogicSize++] = faculty;
    }

    public void addFaculties(Faculty[] faculties) {
        for (int i = 0; i < faculties.length; i++) {
            addFaculty(faculties[i]);
        }
    }

    public void removeAdministrator(Administrator administrator) {
        Administrator[] result = new Administrator[INITIAL_SIZE];
        int resultIndex = 0;
        for (int i = 0; i < administratorsLogicSize; i++) {
            if(!administrators[i].equals(administrator)){
                result[resultIndex++] = administrators[i];
            }
        }
        administrators = result;
        administratorsLogicSize = resultIndex;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearOfFound=" + yearOfFound +
                ", accreditation=" + accreditation +
                ", rector=" + rector +
                ", administrators=" + Arrays.toString(getAdministrators()) +
                ", faculties=" + Arrays.toString(getFaculties()) +
                '}';
    }

}
