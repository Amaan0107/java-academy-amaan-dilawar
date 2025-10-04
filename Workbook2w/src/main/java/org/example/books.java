package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class books {
    private static Library[] books = new Library[20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        preloadBooks();

        while (true) {
            printMainMenu();
            int choice = readInt(scanner, "Choose an option:");

            switch (choice){
                case 1:
                    showAvalibleBooks(scanner);
                    break;
                case 2:
                    showCheckedOutBooks(scanner);
                    break;
                case 3:
                    System.out.println("Thanks for visiting the library!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid. Please enter 1, 2, or 3");
            }
        }
    }
    private static void preloadBooks{
        books[0]= new Library(1,987625,"To Kill a Mockingbird");
        books[1]= new Library(2, 673562, "1984");
        books[2]= new Library(3, 782932, "The Great Gatsby");
        books[3]= new Library(4, 091723, "The Catcher in the Rye");
        books[4]= new Library(5, 827192, "Moby-Dick");
        books[5]= new Library(6, 192019, "Pride and Prejudice");
        books[6]= new Library(7, 812910,  "War and Peace");
        books[7]= new Library(8, 192010, "Jane Eyre");
        books[8]= new Library(9,010112, "The Lord of the Rings");
        books[9]= new Library(10, 210921,  "The Hobbit");
        books[10]= new Library(11, 932282, "Brave New World");
        books[11]= new Library(12, 039203, "Fahrenheit 451");
        books[12]= new Library(13,902823, "Wuthering Heights");
        books[13]= new Library(14, 290322, "Crime and Punishment");
        books[14]= new Library(15, 893202, "The Odyssey");
        books[15]= new Library(16, 198210, "The Iliad");
        books[16]= new Library(17, 012901, "Les Misérables");
        books[17]= new Library(18,921901,  "The Picture of Dorian Gray");
        books[18]= new Library(19,020110, "Dracula");
        books[19]= new Library(20,203102, "Frankenstein");
    }
    private static  void printMainMenu(){
        System.out.println("\n Library/Home");
        System.out.println("1. Show available books");
        System.out.println("2. Show checked out books");
        System.out.println("3. Exit");
    }
    private static int readInt(Scanner scanner, String prompt){
        while(true){
            System.out.println(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            }catch (NumberFormatException e){
                System.out.println("Please enter valid number");
            }
        }
    }
    private static String readLine(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
    private static void showAvalibleBooks(Scanner scanner){
        System.out.println("\n Available Books ");
        boolean anyAvailable = false;
        for (int i = 0; i < books.length; i++){
            if (!books[i].isCheckedOut()){
                System.out.println(books[i].getId() + ", " + books[i].getIsbn() + ", " + books[i].getTitle());
                anyAvailable = true;
            }
        }
        if (!anyAvailable){
            System.out.println("No books available right now");
            return;
        }
        int id = readInt(scanner, "\nEnter book ID to check out (or 0 to return): ")
                if (id == 0) return;
        int idx = findBookIndexById(id);
        if (idx == -1){
            System.out.println("No book found with the ID " + id);
            return;
        }
        if (books[idx].isCheckedOut()){
            System.out.println("That book is already checked out.");
            return;
        }

        String name = readLine(scanner, "Enter your name to check out the book:");
        if (name.isEmpty()){
            System.out.println("Name cannot be empty. Cancelled checkout.");
            return;
        }
        books[idx].checkOut(name);
    }
}