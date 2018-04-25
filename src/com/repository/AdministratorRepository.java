package com.repository;

import com.domain.Administrator;
import com.list.AdminList;

/**
 * Created by student on 25.04.2018.
 */
public interface AdministratorRepository {

    void addAdministrator(Administrator administrator);
    void removeAdministrator(Administrator administrator);
    AdminList getAllAdministrators();

}
