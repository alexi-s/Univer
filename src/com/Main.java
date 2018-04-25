package com;

import com.domain.Administrator;
import com.domain.University;

public class Main {

    public static void main(String[] args) {
	// write your code here
        University u1 = new University();
        System.out.println(u1);
        u1.addAdministrator(new Administrator());
        System.out.println(u1);
        u1.removeAdministrator(new Administrator());
        System.out.println(u1);
    }
}
