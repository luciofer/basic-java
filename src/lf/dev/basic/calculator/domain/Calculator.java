package lf.dev.basic.calculator.domain;

public class Calculator {
    public void sum(double num1, double num2){
        System.out.println(num1 + num2);
    }

    public void sub(double num1, double num2){
        System.out.println(num1 - num2);
    }

    public void mul(double num1, double num2){
        System.out.println(num1 * num2);
    }

    public double div(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void div2(double num1, double num2){
        if(num2 == 0){
            System.out.println("Zero Division Error");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNum(int x, int y){
        x = 99;
        y = 33;
        System.out.println("Num1: "+x);
        System.out.println("Num1: "+y);
    }


    public void sumArray(int[] numbers){
        int sum = 0;
        for(int i = 0;i< numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for(int i = 0;i< numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);

    }

}
