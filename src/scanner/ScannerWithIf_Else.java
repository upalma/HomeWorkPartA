package scanner;

import java.util.Scanner;

public class ScannerWithIf_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two value for comparing: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x<y){
            System.out.println("x is greater then y");

        }
        else {
            System.out.println("y is greater then x");
        }
    }
}
