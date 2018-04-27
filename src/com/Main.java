package com;

import com.controller.MainController;
import com.domain.Administrator;
import com.domain.University;
import com.repository.AdministratorRepository;
import com.repository.impl.memory.AdministratorRepositoryMemoryImplementation;
import com.service.AdministratorService;

public class Main {

    public static void main(String[] args) {

        MainController m = new MainController();
        m.doWork();
    }
}
