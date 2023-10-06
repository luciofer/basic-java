package lf.dev.basic.calculator.test;

import lf.dev.basic.calculator.domain.Calculator;

import java.util.Arrays;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1.4,3);
        calculator.sub(5,3);
        calculator.mul(4,2);
        System.out.println(calculator.div(6,3));

        System.out.println("------");
        double result = calculator.div(6,0);
        System.out.println(result);

        System.out.println("------");
        calculator.div2(5,0);
        calculator.div2(5,0);

        System.out.println("------");
        int num1 = 1;
        int num2 = 2;

        calculator.changeTwoNum(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("------");

        int[] numbers = {3,5,7};


        calculator.sumArray(numbers);
        System.out.println(Arrays.toString(numbers));


        System.out.println("------");
        calculator.sumVarArgs(1,2,3,4,5,6,7);
    }
}