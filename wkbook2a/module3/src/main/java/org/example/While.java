package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("I love java " + count );
            count++;
        }

        System.out.println("------------------------");

        int iLuvJava = 1;
        do {
            System.out.println("I love java " + iLuvJava);
            iLuvJava++;
        } while (iLuvJava <= 5);
    }
}