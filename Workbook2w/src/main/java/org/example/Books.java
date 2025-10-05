package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Books {
    private static Library[] book_count = new Library[20];
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

    private static void preloadBooks() {
        book_count[0]= new Library(1,837723,"To Kill a Mockingbird");
        book_count[1]= new Library(2, 167332, "1984");
        book_count[2]= new Library(3, 238483, "The Great Gatsby");
        book_count[3]= new Library(4, 349394, "The Catcher in the Rye");
        book_count[4]= new Library(5, 330049, "Moby-Dick");
        book_count[5]= new Library(6, 394893, "Pride and Prejudice");
        book_count[6]= new Library(7, 494754,  "War and Peace");
        book_count[7]= new Library(8, 958343, "Jane Eyre");
        book_count[8]= new Library(9, 482923, "The Lord of the Rings");
        book_count[9]= new Library(10, 573821,  "The Hobbit");
        book_count[10]= new Library(11, 973822, "Brave New World");
        book_count[11]= new Library(12, 339203, "Fahrenheit 451");
        book_count[12]= new Library(13,893223, "Wuthering Heights");
        book_count[13]= new Library(14, 765742, "Crime and Punishment");
        book_count[14]= new Library(15, 938223, "The Odyssey");
        book_count[15]= new Library(16, 293828, "The Iliad");
        book_count[16]= new Library(17, 892924, "Les Misérables");
        book_count[17]= new Library(18,921901,  "The Picture of Dorian Gray");
        book_count[18]= new Library(19,120110, "Dracula");
        book_count[19]= new Library(20,203102, "Frankenstein");
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
        for (int i = 0; i < book_count.length; i++){
            if (!book_count[i].isCheckedOut()){
                System.out.println(book_count[i].getId() + ", " + book_count[i].getIsbn() + ", " + book_count[i].getTitle());
                anyAvailable = true;
            }
        }
        if (!anyAvailable){
            System.out.println("No books available right now");
            return;
        }
        int id = readInt(scanner, "\nEnter book ID to check out (or 0 to return): ");
                if (id == 0) return;
        int idx = findBookIndexById(id);
        if (idx == -1){
            System.out.println("No book found with the ID " + id);
            return;
        }
        if (book_count[idx].isCheckedOut()){
            System.out.println("That book is already checked out.");
            return;
        }

        String name = readLine(scanner, "Enter your name to check out the book:");
        if (name.isEmpty()){
            System.out.println("Name cannot be empty. Cancelled checkout.");
            return;
        }
        book_count[idx].checkOut(name);
    }
    private static void showCheckedOutBooks(Scanner scanner) {
        System.out.println("\n--- Checked Out Books ---");
        boolean anyCheckedOut = false;
        for (int i = 0; i < book_count.length; i++) {
            if (book_count[i].isCheckedOut()) {
                System.out.println(book_count[i].getId() + " | " + book_count[i].getIsbn()
                        + " | " + book_count[i].getTitle() + " | Checked out to: " + book_count[i].getCheckedOutTo());
                anyCheckedOut = true;
            }
        }
        if (!anyCheckedOut) {
            System.out.println("No books are currently checked out.");
            return;
        }
        String action = readLine(scanner, "\nEnter 'C' to check in a book, or 'X' to return: ");
        if (action.equalsIgnoreCase("X")) return;
        if (action.equalsIgnoreCase("C")) {
            int id = readInt(scanner, "Enter the ID of the book to check in: ");
            int idx = findBookIndexById(id); if (idx == -1) {
                System.out.println("No book found with ID " + id);
                return;
            }
            if (!book_count[idx].isCheckedOut()) {
                System.out.println("That book is not checked out.");
                return;
            } book_count[idx].checkIn();
            return;
        }
        System.out.println("Unknown action. Returning to main menu.");
    }
    private static int findBookIndexById(int id) {
        for (int i = 0; i < book_count.length; i++) {
            if (book_count[i].getId() == id) return i;
        }
        return -1;}

}