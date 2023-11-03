import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("input the total no. of subjects:");
        int Tsubjects = scn.nextInt();
        double Tmarks = 0;

        for (int i = 1; i <= Tsubjects; i++) {
            System.out.println("Marks obtained in subject " + i + "/100:");
            double Smarks = scn.nextDouble();
            Tmarks += Smarks;
        }

        double avgpercent = Tmarks / Tsubjects;

        System.out.println("Total Marks: " + Tmarks);
        System.out.println("Average Percentage: " + avgpercent);

        if (avgpercent >= 90) {
            System.out.println("Grade obtained: A+");
        } else if (avgpercent >= 85) {
            System.out.println("Grade obtained: A");
        } else if (avgpercent >= 80) {
            System.out.println("Grade obtained: A-");
        } else if (avgpercent >= 75) {
            System.out.println("Grade obtained: B+");
        } else if (avgpercent >= 70) {
            System.out.println("Grade obtained: B");
        } else if (avgpercent >= 65) {
            System.out.println("Grade obtained: B-");
        } else if (avgpercent >= 60) {
            System.out.println("Grade obtained: C+");
        } else if (avgpercent >= 55) {
            System.out.println("Grade obtained: C");
        } else if (avgpercent >= 50) {
            System.out.println("Grade obtained: D");
        } else {
            System.out.println("Grade obtained: F");
        }

        scn.close();
    }}
