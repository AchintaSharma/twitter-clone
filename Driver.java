package com.upgrad.twitterclone;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Twitter!");
        Application application = new Application();
        int option;
        String name;
        String msg;

        do {
            System.out.println("Please choose your option: ");
            System.out.println("1. Create a new user");
            System.out.println("2. Post a tweet");
            System.out.println("Press anything else to quit...");
            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:
                    System.out.println("Please enter the user name:");
                    name=input.nextLine();
                    application.create_new_user(name);
                    break;
                case 2:
                    System.out.println("Please enter your user name:");
                    name=input.nextLine();
                    System.out.println("Please enter the tweet:");
                    msg= input.nextLine();
                    application.post_tweet(name,msg);
                    break;
                default:
                    System.out.println("Thank you for using!");
            }

        } while (option>=1 && option<=8);


    }

}
