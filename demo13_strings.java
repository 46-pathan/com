package com.company;

import java.util.Scanner;

public class demo13_strings {
    public static void main(String[] args) {
//        String name=new String("Hello");
//        String name="hello";
//        System.out.print("The name is: ");
//        System.out.println(name);

        int a=6;
        float b=5.6556f;
        System.out.printf("the value of a is %d and value of b is %8.2f",a,b);

        Scanner sc=new Scanner(System.in);
//        String st=sc.next();
        String st=sc.nextLine();
        System.out.println(st);
    }
}
