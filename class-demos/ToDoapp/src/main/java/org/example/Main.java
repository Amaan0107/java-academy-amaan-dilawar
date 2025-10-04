package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Task[] tasks = new Task[3];
    public static void main(String[] args) {
    tasks[0] = new Task("Fill out Year-up form");
    tasks[1] = new Task("Share your most fun exercise we did in class");
    tasks[2] = new Task("Go to the gym at 5 P.M today");

    tasks[0].markComplete();

        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }
    }
}

