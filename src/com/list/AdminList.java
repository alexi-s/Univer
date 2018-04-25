package com.list;

import com.domain.Administrator;

import java.util.Arrays;

/**
 * Created by student on 25.04.2018.
 */
public class AdminList {

    private static final int INITIAL_SIZE = 100;
    private int administratorsLogicSize = 0;

    private Administrator[] administrators = new Administrator[INITIAL_SIZE];

    public void addAdministrator(Administrator administrator) {
        administrators[administratorsLogicSize++] = administrator;
    }

    public void addAdministrators(Administrator[] administrators) {
        for (int i = 0; i < administrators.length; i++) {
            addAdministrator(administrators[i]);
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

    public Administrator[] getAdministrators() {
        return Arrays.copyOf(administrators, administratorsLogicSize);
    }

    @Override
    public String toString() {
        return Arrays.toString(administrators);
    }
}
