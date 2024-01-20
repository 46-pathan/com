package com.company;
import java.util.Scanner;

//Write a program to calculate the percentage of a given student
//        in the CBSE board exam. His marks from 5 subjects must be
//        taken as input from the keyboard. (Marks are out of 100)

public class demo06_excercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject1 marks:");
        float s1=sc.nextFloat();
        System.out.println("enter subject2 marks:");
        float s2=sc.nextFloat();
        System.out.println("enter subject3 marks:");
        float s3=sc.nextFloat();
        System.out.println("enter subject4 marks:");
        float s4=sc.nextFloat();
        System.out.println("enter subject5 marks:");
        float s5=sc.nextFloat();
        float sum=s1+s2+s3+s4+s5;
        float result=(sum*100)/500;
        System.out.println("result : "+result);
    }
}
