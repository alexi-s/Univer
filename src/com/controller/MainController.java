package com.controller;

import com.domain.Administrator;
import com.service.AdministratorService;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by student on 27.04.2018.
 */
public class MainController {

    private AdministratorService administratorService = new AdministratorService();

    public void doWork(){
        showHelloMessage();
        while(true) {
            showMenu();
            makeChoice();
        }
    }

    private void showMenu(){
        System.out.println("Make your choice:");
        System.out.println("1. Show list of Administrators");
        System.out.println("2. Add new Administrator");
        System.out.println("3. Remove Administrator");
        System.out.println("\n0. Exit");
    }

    public void makeChoice(){
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        switch (choice) {
            case 1:{
                showAdministratorsList();
                break;
            }
            case 2:{
                addAdministrator();
                break;
            }
            case 3:{
                removeAdministrator();
                break;
            }
            case 0:{
                System.out.println("Goodbye!");
                System.exit(1);
            }
            default: {
                System.out.println("Wrong choice");
            }
        }
    }

    private void showAdministratorsList(){
        administratorService.printAdministrators(administratorService.getAllAdministrators());
    }

    private void addAdministrator(){
        Administrator administrator = new Administrator();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = s.nextLine();
        System.out.print("Enter last name: ");
        String lastName = s.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = s.nextLine();
        System.out.print("Enter typing speed: ");
        int typingSpeed = s.nextInt();

        administrator.setFirstName(firstName);
        administrator.setLastName(lastName);
        administrator.setMiddleName(middleName);
        administrator.setTypingSpeed(typingSpeed);

        administratorService.addAdministrator(administrator);
    }

    private void removeAdministrator(){
        System.out.println("Remove administrator... missing method");
    }

    private void showHelloMessage(){
        System.out.println("*******************");
        System.out.println("University Database");
        System.out.println("*******************");
        System.out.println();
    }
}
