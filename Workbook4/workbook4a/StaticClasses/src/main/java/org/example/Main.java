package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(NameFormat.format("Mel", "Johnson"));

        System.out.println(NameFormat.format("Dr.", "Mel", "B", "Johnson", "PhD"));

        System.out.println(NameFormat.format("Mel B Johnson, PhD"));

        System.out.println(NameFormat.format("Dr. Mel Johnson"));
    }
}