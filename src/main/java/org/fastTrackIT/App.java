package org.fastTrackIT;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Classroom classroom = new Classroom () ;

        classroom.name = "ButterflysClass";
                classroom.age = 3;
        classroom.boys = 10;
        classroom.girls = 6;

        System.out.println(classroom.name);
        System.out.println(classroom.age);
        System.out.println(classroom.boys);
        System.out.println(classroom.girls);
    }

       //  Scanner input = new Scanner(System.in);
//         int firstNumber = 5;
//         int secondNumber = 7;
//
//                 int sum;
//
//        System.out.println(firstNumber + secondNumber);
//
//
//
//       // System.out.println("Enter first number");
//       // firstNumber = input.nextInt() ;
//      //  System.out.println("Enter second number");
//      //  secondNumber = input.nextInt();
//
//        sum = firstNumber + secondNumber;
//
//        System.out.println("Sum of the two number is:" + sum);
//
//    }
}
