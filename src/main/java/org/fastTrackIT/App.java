package org.fastTrackIT;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Classroom classroom = new Classroom () ;

        classroom.name = "ButterflysClass";
        classroom.age = 3;


        System.out.println(classroom.name);
        System.out.println(classroom.age);

        Scanner input = new Scanner(System.in);
        int boys = 10;
        int girls = 6;

        int sum;
        sum = boys + girls;

        System.out.println("Total children :" + sum);

//        Scanner intput =  new Scanner(System.in);
//        int firstNumber;
//        int secondNumber;
//
//        int sum;
//
//
//        System.out.println(firstNumber + secondNumber);
//

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
   }
}
