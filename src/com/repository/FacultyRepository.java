package com.repository;

import com.domain.Faculty;
import com.list.FacultyList;

/**
 * Created by student on 25.04.2018.
 */
public interface FacultyRepository {

    void addFaculty(Faculty faculty);
    void removeFaculty(Faculty faculty);
    FacultyList getAllFaculties();

}
