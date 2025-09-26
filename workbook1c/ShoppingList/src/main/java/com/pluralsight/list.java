package com.pluralsight;

public class list {
    public static void main(String[] args) {
        String catname = "Hennessy";
        int catage = 2;
        double catweight = 3.7;
        boolean ishungry = true;
        boolean isoutside = true;
        System.out.println(catname + " is a " + catage + "-years old cat"
                + " who weighs " + catweight + "KG");
        if (ishungry && isoutside) {
            System.out.println("The cat is hunting.");
        } else if (ishungry && !isoutside) {
            System.out.println("The cat wants you to feed it.");
        } else {
            System.out.println("The cat is fine for now.");
        }
    }
}
