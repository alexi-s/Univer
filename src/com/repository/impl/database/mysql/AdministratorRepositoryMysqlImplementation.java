package com.repository.impl.database.mysql;

import com.domain.Administrator;
import com.list.AdminList;
import com.repository.AdministratorRepository;

/**
 * Created by student on 27.04.2018.
 */
public class AdministratorRepositoryMysqlImplementation implements AdministratorRepository {

    private DBMysqlConnection dbMysqlConnection;

    public AdministratorRepositoryMysqlImplementation() {
        dbMysqlConnection = DBMysqlConnection.getInstance();
    }

    @Override
    public void addAdministrator(Administrator administrator) {

    }

    @Override
    public void removeAdministrator(Administrator administrator) {

    }

    @Override
    public AdminList getAllAdministrators() {
        return null;
    }
}
