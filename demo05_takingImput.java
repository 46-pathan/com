package com.company;
import java.util.Scanner;

public class demo05_takingImput {
    public static void main(String[] args) {
        System.out.println("taking user input:");
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number1:");
//        int a=sc.nextInt();
//        System.out.println("enter number2:");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println(sum);
//
//        boolean b1=sc.hasNextInt();
//        System.out.println(b1);

//        String str=sc.next();
        String str=sc.nextLine();
        System.out.println(str);

    }
}
