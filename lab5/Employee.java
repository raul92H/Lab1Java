package lab5;

import java.util.Scanner;

public class Employee {
    private String name;
    private String email;
    private Integer hourRate;
    private Integer capacity;
    private Integer freeDay;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHourRate() {
        return hourRate;
    }

    public void setHourRate(Integer hourRate) {
        this.hourRate = hourRate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFreeDay() {
        return freeDay;
    }

    public void setFreeDay(Integer freeDay) {
        this.freeDay = freeDay;
    }


    private int calculateDailyIncome(){
        int dailyIncome = this.hourRate * this.capacity;
        return dailyIncome;
    }

    public void calculateMonthlyIncome(){
        int income = calculateDailyIncome() * (20 - this.freeDay);
        System.out.println(income);
    }
}
