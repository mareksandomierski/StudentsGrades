package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Student {

    String name;
    String lastName;
    double [] grade;

}

class Statistic {

    double srednia(double[] grade) {

        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        double sr = 0;
        sr = Math.round((sum / grade.length) * 100.0) / 100.0;

        return sr;
    }

    double lowestGrade(double[] grade) {

        double min = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (min > grade[i]) {
                min = grade[i];
            }
        }
        return min;
    }

    double highestGrade(double[] grade) {

        double max = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (max < grade[i]) {
                max = grade[i];
            }
        }
        return max;
    }
}

