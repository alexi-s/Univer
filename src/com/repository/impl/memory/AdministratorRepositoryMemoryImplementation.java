package com.repository.impl.memory;

import com.domain.Administrator;
import com.list.AdminList;
import com.repository.AdministratorRepository;

/**
 * Created by student on 27.04.2018.
 */
public class AdministratorRepositoryMemoryImplementation implements AdministratorRepository {

    private AdminList adminList; //  = new AdminList();

    private static AdministratorRepository instance;

    public AdministratorRepositoryMemoryImplementation() {
        adminList = new AdminList();
    }

    public static AdministratorRepository getInstance(){
        if (instance == null){
            instance = new AdministratorRepositoryMemoryImplementation();
        }
        return instance;
    }

    @Override
    public void addAdministrator(Administrator administrator) {
        adminList.addAdministrator(administrator);
    }

    @Override
    public void removeAdministrator(Administrator administrator) {
        adminList.removeAdministrator(administrator);
    }

    @Override
    public AdminList getAllAdministrators() {
        return adminList;
    }
}
