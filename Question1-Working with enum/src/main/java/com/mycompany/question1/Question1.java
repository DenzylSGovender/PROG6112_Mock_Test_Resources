
package com.mycompany.question1;


public class Question1 {

    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu"};
        int[][] sales = {
            {22, 27, 18, 30},   // WRAP
            {35, 31, 28, 26},   // BURGER
            {19, 20, 22, 25}    // PASTA
        };

        CanteenReport report = new CanteenReport(days, sales);
        String result = report.buildReport();

        // If you want to display it in console
        System.out.println(result);
    }
}
