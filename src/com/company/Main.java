package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Please input anything and press enter.");
        int keyNumber = (int)(Math.random() * 5 + 1);
        String message = kbInput.nextLine();
        Cipher user1 = new Cipher(message, keyNumber);
        boolean m = true;
        while (m ) {
            System.out.println("Type 0 to exit or 1 to retrieve the decrypted message.");
            String decision = kbInput.nextLine();
            if (decision.equals("0")) {
                System.out.println("Have a nice day!");
                System.exit(0);
            } else if (decision.equals("1")) {
                System.out.println(user1.decrypt());
                m = false;
            } else {
                System.out.println("That is not a 0 or a 1!");
                m = true;
            }
        }
    }
}
