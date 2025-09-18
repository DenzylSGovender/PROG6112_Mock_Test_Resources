
package com.mycompany.question1;


public class CanteenReport {
     private String[] days;
    private int[][] sales;

    public CanteenReport(String[] days, int[][] sales) {
        this.days = days;
        this.sales = sales;
    }
    
    public int getRowTotal(int mealIndex) {
        int sum = 0;
        for (int j = 0; j < days.length; j++) {
            sum += sales[mealIndex][j];
        }
        return sum;
    }

    public int getColumnTotal(int dayIndex) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i][dayIndex];
        }
        return sum;
    }

    public int getOverallTotal() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += getRowTotal(i);
        }
        return total;
    }

    public double getMealAverage(int mealIndex) {
        return (double) getRowTotal(mealIndex) / days.length;
    }

    public int getHighestDayIndex() {
        int maxIdx = 0;
        for (int j = 1; j < days.length; j++) {
            if (getColumnTotal(j) > getColumnTotal(maxIdx)) {
                maxIdx = j;
            }
        }
        return maxIdx;
    }

    // === Report Builder (returns String with concatenation) ===
    public String buildReport() {
        String report = "=== Campus Canteen Sales Report ===\n";

        // Header
        report = report + "\t";
        for (String d : days) {
            report = report + d + "\t";
        }
        report = report + "| Row Total\n";

        // Rows
        for (int i = 0; i < sales.length; i++) {
            report = report + Meal.values()[i] + "\t";
            for (int j = 0; j < days.length; j++) {
                report = report + sales[i][j] + "\t";
            }
            report = report + "| " + getRowTotal(i) + "\n";
        }

        // Separator
        report = report + "---------------------------------------------\n";

        // Totals
        report = report + "Total\t";
        for (int j = 0; j < days.length; j++) {
            report = report + getColumnTotal(j) + "\t";
        }
        report = report + "| Overall: " + getOverallTotal() + "\n\n";

        // Averages
        report = report + "Per-Meal Averages:\n";
        for (int i = 0; i < sales.length; i++) {
            double avg = getMealAverage(i);
            String avgText = String.valueOf(avg);
            String mark = avg >= 25 ? " ***" : "";
            report = report + Meal.values()[i] + " : " + avgText + mark + "\n";
        }

        // Highest day
        int maxIdx = getHighestDayIndex();
        report = report + "\nHighest total day: " + days[maxIdx] + " (" + getColumnTotal(maxIdx) + ")\n";

        return report;
    }
}
