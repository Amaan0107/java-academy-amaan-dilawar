package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mathapplication {
    public static void main(String[] args) {
        //1
        double bobSalary = 63900.96; //State Bob's Salary
        double garySalary = 47865.56; //State Gary's Salary
        double highestSalary = Math.max(bobSalary,garySalary); //use max to find highest out of two
        System.out.println("Highest Salary is: " + highestSalary); //print the highest

        System.out.println("--------------------------");

        //2
        double carPrice = 20000.99; //State car Price
        double truckPrice = 45000.99; //state truck price
        double lowestPrice = Math.min(carPrice,truckPrice); //use min to find lowest number
        System.out.println("The lowest Price is: " + lowestPrice);//print lowest number

        System.out.println("--------------------------");

        //3
        double circleRadius = 7.25;//state circle radius
        double area = Math.PI * circleRadius * circleRadius;//square radius by itself and * by PI
        System.out.println("The area of the circle is : " + area); //print out area

        System.out.println("--------------------------");

        //4
        double number = 5.0; //set variable
        System.out.println("The square root is:" + Math.sqrt(number));//use sqrt to find square root n printed

        System.out.println("--------------------------");

        //5
        double x1 = 5, y1 = 10;// set variables for first set of numbers
        double x2 = 85, y2 = 50;// set variables for second set of numbers
        double distance = Math.hypot(x2-x1,y2-y1);//Use hypot to find the distance between the two points
        System.out.println("The distance between the points is: " + distance);//print out total distance

        System.out.println("--------------------------");

        //6
        double num1 = -3.8; //set variable
        double absoluteValue = Math.abs(num1); //use abs to find absolute value
        System.out.println("The Absolute value is: " + absoluteValue);// print absolute value

        System.out.println("--------------------------");

        //7
        double randomNumber = Math.random(); //set    basic random
        System.out.println("Random number between 0-1:" + randomNumber);// print random # 0-1

        System.out.println("--------------------------");

        //8
        int days = 24; // set # of days
        int hoursPerDay = 24; // set hours per day
        int minsPerDay = 60; // set mins per day

        int totalMins = days * hoursPerDay * minsPerDay; // multiply all into new variable
        System.out.println("Total Mins in " + days + " days is " + totalMins + " mins."); //print total mins
    }
}

