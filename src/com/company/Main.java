package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount userBankAccount = new BankAccount(10000);

        while (true) {
            System.out.println("Количество средств на счету: "+userBankAccount.getAmount());
            try {
                userBankAccount.withDraw(6000);
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                break;
            }
        }

        try {
            userBankAccount.withDraw(userBankAccount.getAmount());
        }catch (LimitException le){
            System.out.println(le.getMessage());
        }
        System.out.println("Количество средств на счету: "+userBankAccount.getAmount());
    }
}
