package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (true) {
            year++;
            amount = (amount + amount * (percent / 100));
            if (amount <= salary) {
                break;
            }
            amount = amount - salary;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(1000, 1200, 20));
    }
}
