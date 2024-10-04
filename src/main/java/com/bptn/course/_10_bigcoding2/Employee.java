package com.bptn.course._10_bigcoding2;

public class Employee {
	// Private instance variables
    private int salary;
    private int hoursPerDay;

    // Constructor to initialize salary and hoursPerDay
    public Employee(int salary, int hoursPerDay) {
        setSalary(salary);
        setHoursPerDay(hoursPerDay);
    }

    // Method to set the salary and apply the condition to increase it by 10 if less than 500
    public void setSalary(int salary) {
        if (salary < 500) {
            this.salary = salary + 10; // Increase by 10 if salary is less than 500
        } else {
            this.salary = salary; // Keep salary unchanged if it's 500 or more
        }
    }

    // Method to set hours per day and adjust the salary if hours per day are more than 6
    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        if (hoursPerDay > 6) {
            this.salary += 5; // Increase salary by 5 if hours per day is greater than 6
        }
    }

    // Method to get the salary
    public int getSalary() {
        return salary;
    }
}
