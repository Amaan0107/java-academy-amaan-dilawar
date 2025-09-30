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

        import java.util.Scanner;

        class Main {

            public static void main(String[] args) {
                Boolean isThisValid = ValidateEmailAdres("rmailjard@sasa.org");

                ValidateEmailAdres("rmailjard@yEARup.OrG");
                ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");
                ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");
                ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");
                ValidateEmailAdres("rmailjard@yxxxxxRup.OrG");

                LogginChecker();


            }

            private static void LogginChecker() {

                Scanner read = new Scanner(System.in);

                System.out.println("What is your password");
                String password = read.nextLine();
                String correctPassword = "1234";
                if (password.equals(correctPassword)) {
                    System.out.println("That is correct, you are logged in");
                } else {
                    System.out.println("That is incorrect, try again");
                }

            }

            public static Boolean ValidateEmailAdres(String mail) {

                boolean isValid;
                String lowercased = mail.toLowerCase();
                int AtPosition = lowercased.indexOf("@");//9
                String extraction = lowercased.substring(AtPosition + 1);//cuts the text between 0 and 9
                System.out.println(extraction);

                if (extraction.equals("yearup.org")) {
                    isValid = true;
                } else {
                    isValid = false;
                }
                return isValid;

            }
        }
    }
}