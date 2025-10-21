package org.pluralsight;

public class Employee {
  private int employeeId;
  private String name;
  private String department;
  private double payRate;
  private double hoursWorked;
  private double startTime;

  public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
      this.employeeId = employeeId;
      this.name = name;
      this.department = department;
      this.payRate = payRate;
      this.hoursWorked = hoursWorked;

  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
      return name;
  }

  public String getDepartment() {
      return department;
  }

  public double getPayRate() {
      return payRate;
  }

  public double getHoursWorked() {
      return hoursWorked;
  }

  public double getRegularHours(){
      return Math.min(hoursWorked, 40);
  }

  public double getOverTimeHours(){
      return Math.max(0, hoursWorked - 40);
  }

  public double getTotalPay(){
      double regularPay = getRegularHours() * payRate;
      double overTimePay = getOverTimeHours() * payRate * 1.5;
      return regularPay + overTimePay;
  }

  public void punchIn(double time) {
        startTime = time;
        System.out.println(name + " punched in at " + time);
  }

  public void punchOut(double time) {
      if (startTime == 0) {
          System.out.println("Error: " + name + " has not punched in yet!");
          return;
      }

      double hoursWorkedThisShift = time - startTime;
      hoursWorked += hoursWorkedThisShift;
      System.out.println(name + " punched out at " + time + " (worked " + hoursWorkedThisShift + " hrs)");

      startTime = 0;
  }
    public void punchIn() {
        startTime = java.time.LocalTime.now().getHour();
        System.out.println(name + "has been automatically punched in at " + startTime);
    }


}
