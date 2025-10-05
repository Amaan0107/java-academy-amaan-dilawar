package org.example;

public class Library {
    private int id;
    private int isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Library(int id, int isbn, String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void checkOut(String name){
        if(isCheckedOut){
            System.out.println(title + " ID: " + id + " has already been checked out!");
        }else{
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " ID: " + id + " has been checked out.");
        }
    }
    public void isCheckedIn(){
        if(!isCheckedOut){
            System.out.println(title + " ID: " + id + " is not checked out.");
        }else {
            isCheckedOut = false;
            System.out.println(title + " ID: " + id + " has been checked out.");
            checkedOutTo = "";
        }
    }
    @Override
    public String toString() {
        if (isCheckedOut) {
            return id + " | " + isbn + " | " + title + "(Checked out)";
    } else {
            return id + " | " + isbn + " | " + title +  "(Available)";
        } }

    public void checkIn() {
        if (!isCheckedOut) {
            System.out.println(title + " is not currently checked out.");
        } else { isCheckedOut = false; checkedOutTo = "";
            System.out.println(title + " has been checked in."); } }
    }


