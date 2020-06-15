package org.fastTrackIT;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {


        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        Scanner scanner1 = new Scanner(System.in);
        int secondNumber = scanner1.nextInt();

        Classroom classroom = new Classroom () ;

        classroom.sum(firstNumber, secondNumber);

//        classroom.name = "ButterflysClass";
//        classroom.age = 3;
//
//
//        System.out.println(classroom.name);
//        System.out.println(classroom.age);

//ti-am facut un model
        // ma inclin inaintea ta .
        //nu trebuie, flaviu e bossul:)
        //tu esti ajutorul meu
        //spor:)
   }
}
