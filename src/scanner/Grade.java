package scanner;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student's Mark:");

        int studentMark = sc.nextInt();

        if (studentMark >= 90) {
            System.out.println("Result: Grade A+");
        } else if (studentMark >= 80) {
            System.out.println("Result: Grade A");
        } else if (studentMark >= 70) {
            System.out.println("Result: Grade B");
        } else if (studentMark >= 60) {
            System.out.println("Result: Grade C");
        } else if (studentMark >= 50) {
            System.out.println("Result: Grade D");
        } else {
            System.out.println("Result: Fail");
        }
    }
}