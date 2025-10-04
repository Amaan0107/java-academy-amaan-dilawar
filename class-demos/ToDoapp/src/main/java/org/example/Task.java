package org.example;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dauDate;
    private boolean complete;
    private String urgency;
    private String notification;
    private boolean reminder;

    public Task(String title){
        this.title = title;
        System.out.println("Enter title: " + title);
    }
    public  void markComplete(){
        this.complete = true;
        System.out.println(title + " is now completed!!");
    }
    @Override
    public String toString() {
        if (complete) {
            return "[✓] " + title;
        } else {
            return "[ ] " + title;
        }
    }
    //String title
    //LocalDatestring due date
    //Boolean reminder yes or no, complete or incomplete
    //Urgency
    //String a reminder Notifications
}
