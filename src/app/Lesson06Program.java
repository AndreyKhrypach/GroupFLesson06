package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson06Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("please enter calculation symbols: (= - * /) or type exit to quit");
            String calcSymbol = scanner.next();
            if (calcSymbol.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("Please enter first number");
            double firstNumber = scanner.nextDouble();
            System.out.println("Please enter second number");
            double secondNumber = scanner.nextDouble();
            switch (calcSymbol) {
                case "+":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "-":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "*":
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "/":
                    if (secondNumber != 0){
                    System.out.println(firstNumber / secondNumber);
                    }else {
                        System.out.println("can't divide by zero");
                    }
                    break;
                default:
                    System.out.println("invalid input calc symbol");
            }
        }


//        Random random = new Random();
//
//        int[] array = new int[5];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(5);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int element :
//        array){
//            System.out.print(element + " ");
//        }

//        System.out.println(Arrays.toString(array));


//        int a = 10;
//
//        while (true){
//            System.out.println(a);
//            a--;
//            if (a == 0){
//                break;
//            }
//        }

//        for (; ;){
//            System.out.println(a);
//            a--;
//            if (a == 0){
//                break;
//            }
//        }

//        int a = 10;
//
//        do {
//            System.out.println(a);
//            a--;
//        }while (a >= 11);


//        boolean b = false;
//        int a = 0;
//        while (b == false){
//            a++;
//            if (a == 10){
//                break;
//            }
//            System.out.println(a);
//        }


//        for (int i = 127; i > -10; i-=2) {
//            if (i == 0){
//                continue;
//            }
//            System.out.println(i);
//
//        }

//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        int a = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(a);
//            a++;
//        }
//        System.out.println(a);

//        int a = 0;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(a);
//            a++;
//        }


    }

}
