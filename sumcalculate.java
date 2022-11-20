package com.company;
import java.util.Scanner;

public class Thirdjava {
    public static void main(String[] arg) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these number is");
        System.out.println(sum);
    }
}
