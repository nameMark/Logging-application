package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String settingLoginNameFirst;  // first time we write our login name
        String settingLoginNameSecond; // second time we put our login name to check if settingLoginNameFirst = settingLoginNameSecond

        String passwordFirst;
        String passwordSecond;

        String loginName;
        String password;


        // setting your login name
        while (true) {
            System.out.print("What login name do you want?:");
            settingLoginNameFirst = scanner.nextLine();
            System.out.print("login name for check:");
            settingLoginNameSecond = scanner.nextLine();

            if (settingLoginNameFirst.equals(settingLoginNameSecond)){
                System.out.println("Great so far haha");
                break;
            }
            System.out.println("mismatch in login names!");
        }

        // setting your password
        while (true) {
            System.out.print("What password do you want?:");
            passwordFirst = scanner.nextLine();
            System.out.print("password for check:");
            passwordSecond = scanner.nextLine();

            if (passwordFirst.equals(passwordSecond)){
                System.out.println("Great so far haha");
                break;
            }
            System.out.println("mismatch in login names!");
        }


        // primitive "cleaning" your terminal
        for (int i = 0; i < 100; i++){
            System.out.println("");
        }
        // asking you for ligin
        while (true) {
            System.out.print("login:");
            loginName = scanner.nextLine();

            if (loginName.equals(settingLoginNameSecond)) {
                break;
            }
            System.out.println("wrong login name");
        }
        // asking you to write your password
        while (true) {
            System.out.print("password:");
            password = scanner.nextLine();
            if (password.equals(passwordSecond)) {
                System.out.println(" greight success");
                break;
            }
            System.out.println("wrong password");
        }
    }
}
