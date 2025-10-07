package org.example;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PayReport {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("payroll_report.txt"));

            writer.write("Pay roll Report: \n ");
            writer.write("ID    Name                 Hours      Rate       Gross Pay");
            writer.newLine();
            writer.write("----------------------------------------------------------");
            writer.newLine();
            writer.write("10    Dana Wyatt           52.50      12.50      656.25");
            writer.newLine();
            writer.write("20    Ezra Aiden           17.00      16.75      284.75");
            writer.newLine();
            writer.write("30    Brittany Thibbs      40.00      16.50      660.00");
            writer.newLine();
            writer.write("40    Zephaniah Hughes     2.00       10.00      20.00");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        writer.close();
        System.out.println("Payroll Report successfully uploaded onto payroll_report.txt");

    }}

