package com.company;

public class Main {

    public static void main(String[] args) {

        Student u1 = new Student();
        Student u2 = new Student();
        Student u3 = new Student();

        u1.name = "Stefan";
        u1.lastName = "Zamrzyk";
        u1.grade = new double[] {2.5,4,3,4.5,3,5};


        u2.name = "Agnieszka";
        u2.lastName = "Wczas";
        u2.grade = new double[] {5,4.5,5,4.5,5};


        u3.name = "Maciej";
        u3.lastName = "Nojman";
        u3.grade = new double[] {5,4,3.5,4.5,2,5,4.5};


        Display w = new Display();
        w.text(u1);
        w.text(u2);
        w.text(u3);

    }
}

class Display {

    void text(Student student) {
        Statistic stats = new Statistic();
        System.out.println("Student " + student.name + " " + student.lastName
                + " obtained a average grade: " + stats.average(student.grade)
                + " The lowest grade is: " + stats.lowestGrade(student.grade)
                + " The highest grade is: " + stats.highestGrade(student.grade));
    }
}

class Student {

    String name;
    String lastName;
    double [] grade;

}

class Statistic {

    double average(double[] grade) {

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

