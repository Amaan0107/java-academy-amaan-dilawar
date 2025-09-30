package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String myEmailadres = "rmailjard@yEARup.OrG";
        int atIndex = myEmailadres.indexOf("@");

        if (atIndex != -1) {
            String domain = myEmailadres.substring(atIndex + 1);

            if (domain.equalsIgnoreCase("yearup.org")) {
                System.out.println("Correct e-mail address.");
            } else {
                System.out.println("Wrong e-mail address.");
            }
        } else {
            System.out.println("Invalid e-mail(missing @).");
        }

        class EmailValidator {
            public static void main(String[] args) {
                ValidateEmailAddress("remsey.mailjard@skills4-it.nl");
                ValidateEmailAddress("remsey.mailjard@rmailjard@yearup.org");

            }

            public static void ValidateEmailAddress(String email) {
                if (email.toLowerCase().endsWith("@yearup.org")) {
                    System.out.println("Correct email address.");
                } else {
                    System.out.println("Wrong email address.");
                }
            }
        }
    }
}