import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i = 0;
       while (i < 5) {
           System.out.println("i is " + i);
           i++;
        }
        int reverseI = 100;
       do {
     reverseI = reverseI - 5;
      System.out.println(reverseI);
       }  while(reverseI > -10);
        for (int num = 1; num <= 100; num++){
        if (num % 15 == 0) {
            System.out.println("FizzBuzz");
        }
        if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        if (num % 3 == 0) {
            System.out.println("Fizz");
        }
    }

//    for (int num = 1; num <= 100; num++);
//    if (num % 15 == 0) {
//        System.out.println("FizzBuzz");
//    }
//    if (num % 5 == 0) {
//        System.out.println("Buzz");
//    }
//    if (num % 3 == 0) {
//        System.out.println("Fizz");
//    }

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("enter a number");

}}
