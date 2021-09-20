package com.brand;
import java.util.Scanner;

public class Transaction {
    private static Transaction instance;
    private String cardNo;
    private  String cardCvv;

    private Transaction() {

    }

    public static Transaction createInstance() {
        if (instance == null) {
            instance = new Transaction();
        }
        return instance;
    }

    public void credentials() {
        Scanner strInput = new Scanner(System.in);
        System.out.println("\n+++ Enter your card details +++ ");
        System.out.print("Enter card number : ");
        cardNo = strInput.nextLine();
        System.out.print("Enter CVV : ");
        cardCvv = strInput.nextLine();

    }

    public void phonePe() {
        this.credentials();
        System.out.println("\nTransaction Successful");
    }

    public void paytm() {
        this.credentials();
        System.out.println("\nTransaction Successful");
    }

    public void paypal() {
        this.credentials();
        System.out.println("\nTransaction Successful");
    }

    public void tez() {
        this.credentials();
        System.out.println("\nTransaction Successful");
    }

    public void transSwitch() {

        boolean isCheck = false;
        Transaction tr = new Transaction();

        do {
            System.out.println("\n----Select 1 app for transaction----");
            System.out.println("1. PhonePe");
            System.out.println("2. PayTm");
            System.out.println("3. Paypal");
            System.out.println("4. tez");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice : ");
            String transInput = sc.next();

            try {
                int transChoice = Integer.parseInt(transInput);

                switch (transChoice) {
                    case 1 -> {
                        tr.phonePe();
                    }
                    case 2 -> {
                        tr.paytm();
                    }
                    case 3 -> {
                        tr.paypal();
                    }
                    case 4 -> {
                        tr.tez();
                    }
                    case 5 -> {
                        System.out.println("Thank you for visiting us !!!");
                        isCheck = false;
                    }
                    default -> {
                        System.out.println("Invalid Input");
                        isCheck = true;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid option");
                isCheck = true;
            }
        }while(isCheck);
    }
}