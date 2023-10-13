package lf.dev.basic.flowcontrolchallenge.domain;


import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Input number 1: ");
            int num1 = scanner.nextInt();

            System.out.println("Input number 2: ");
            int num2 = scanner.nextInt();

            try {
                count(num1, num2);

            } catch(InvalidParametersException e ){
                System.out.println("The first number can't be higher than the last one. " + e);
            };

    }

    public static void count(int num1, int num2) throws InvalidParametersException {
        if (num1 > num2){
            throw new InvalidParametersException();
        }
        int iterations = num2 - num1;

        for(int i=1; i <= iterations; i++){
            System.out.println("Printing number "+i);
        }
    }
}

