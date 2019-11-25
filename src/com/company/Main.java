package com.company;
import java.util.*;

public class Main {


    private static void dayofProgrammer(int year, int d) {
        int sum = 0, c = 0;
        while (sum < d) {
            c++;
            if (c % 2 == 0)
                sum = sum + 30;
            else sum = sum + 31;
        }
        int date = sum - d;
        int month = 12 - (c - 1);
        String str = String.format("%02d", date);
        String str1 = String.format("%02d", month);
        String str2 = String.format("%04d", year);

        System.out.print(str + "." + str1 + "." + str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, d;
        year = sc.nextInt();
        // Main ob=new Main();
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                d = (366 - 256);
                dayofProgrammer(year, d);
            } else {
                d = 365 - 256;
                dayofProgrammer(year, d);
            }
        } else if (year == 1918) {
            d = 365 - 13 - 256;
            dayofProgrammer(year, d);
        } else if (year >= 1919 && year <= 2700) {
            if (year % 4 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                d = (366 - 256);
                dayofProgrammer(year, d);
            } else {
                d = 365 - 256;
                dayofProgrammer(year, d);
            }

        }
    }
}