package com.appnetics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        ///System.out.println("Enter your year of birth: ");
        int counter = 1;
        System.out.println("Enter a Number #" + counter);
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){

            int sum = 0;

            while (counter <=10){
                counter++;
                int number = scanner.nextInt();


                sum += number;
                System.out.println("and the sum of the numbers is  " + sum);
                scanner.nextLine();
            }
        }else {
            System.out.println("Invalid Number");
        }









//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); //handle next line character, so that when you press enter,it gives you a chance to add your name as well.
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2019 - yearOfBirth;
//
//            if (age >=0 && age <= 100){
//                System.out.println("Your name is " + name + " , and you are " + age + " years old");
//            }else {
//                System.out.println("Invalid year of birth!");
//            }
//
//        } else {
//            System.out.println("Unable to verify year of birth");
//        }
        scanner.close();
    }
}
