package com.main;

import com.brand.Iphone;
import com.brand.Nokia;
import com.brand.Samsung;
import com.brand.Transaction;

import java.util.Scanner;

public abstract class Cellphone {

    public static void main(String[] args)
    {
        boolean isCheck=true;
        // create Scanner obj to take the input.
        Scanner sc = new Scanner(System.in);

        // create a class objects fo accessing there methods.
        Iphone iphone = new Iphone(2,"128GB","48+12MP ","Qwerty ", "Itunes");
        Samsung samsung = new Samsung(2,"128GB","48+12MP ","Qwerty ", "Samsung Health");
        Nokia nokia = new Nokia(1, "6MB", "2MP", "Qwerty", "Snack game");
        Transaction trans = Transaction.createInstance();

        System.out.println("\n\n **** Welcome to cell-phone store **** \n");

        do
        {
            System.out.println("-----------------------------------------------");
            // create a design to ask there choice.
            System.out.println("1. Iphone");
            System.out.println("2. Samsung");
            System.out.println("3. Nokia");
            System.out.println("4. Exit");

            // take a input choice from user.
            System.out.print("\nEnter your choice : ");
            String input = sc.next();
            System.out.println("\n-----------------------------------------------");

            try
            {
                // create a switch case for showing choice related data.
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1 -> {
                        System.out.println("Following are the features of Iphone Brand !!!");
                        iphone.ios();
                        iphone.simCard();
                        iphone.inbuiltMemory();
                        iphone.camera();
                        iphone.keypad();
                        System.out.println("\nExtra Feature : \n");
                        iphone.itunes();
                        trans.transSwitch();
                    }
                    case 2 -> {
                        System.out.println("Following are the features of Samsung Brand !!!");
                        iphone.android();
                        samsung.simCard();
                        samsung.inbuiltMemory();
                        samsung.camera();
                        samsung.keypad();
                        System.out.println("\nExtra Feature : \n");
                        samsung.samsungHealth();
                        trans.transSwitch();
                    }
                    case 3 -> {
                        System.out.println("Following are the features of Nokia Brand !!!");
                        iphone.android();
                        nokia.simCard();
                        nokia.inbuiltMemory();
                        nokia.camera();
                        nokia.keypad();
                        System.out.println("\nExtra Feature : \n");
                        nokia.game();
                        trans.transSwitch();
                    }
                    case 4 -> {
                        System.out.println("Thank you for visiting us !!!");
                        isCheck = false;
                    }
                    default -> {
                        System.out.println("Invalid Input");
                        isCheck = true;
                    }
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter valid option");
                isCheck = true;
            }
        }while(isCheck);
        System.out.println("-----------------------------------------------");
    }


}
