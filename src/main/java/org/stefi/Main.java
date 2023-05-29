package org.stefi;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("In order to solve a quadratic equation of the type a*X*X + b*X + c = 0 , ");
        System.out.println("please input number a (different than 0):");
        a = getNumber();
        if (a == 0){
            System.out.println("Please enter a number that is different than 0 for a:");
            a = getNumber();
        }

        System.out.println("please input number b:");
        b = getNumber();

        System.out.println("please input number c:");
        c = getNumber();

        System.out.printf("The quadratic equation to be solved is: %s*X*X + %s*X + %s \n", a, b, c);
        calculateRoots(a, b, c);
    }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        try {
            result = scanner.nextInt();
        } catch (Exception e) {
            // handle exception
            System.out.println("Please enter a valid number:");
            scanner.nextLine();
            result = getNumber();
        }
        return result;
    };
    public static void calculateRoots(int a, int b, int c){
        int d = b * b - 4 * a * c;
        double sqrt = sqrt(abs(d));
        if (d > 0)
        {
            System.out.println("The roots of the equation are real and different:");
            System.out.println((double)(-b + sqrt) / (2 * a) + "  and  "+ (double)(-b - sqrt) / (2 * a));
        }
        else if (d == 0){
            System.out.println("The roots of the equation are real and same:");
            double result = (double)(-b) / (2 * a);
            System.out.printf("%s  and %s", result, result);
        }
        else{
            System.out.println("The roots of the equation are NOT real numbers.");
        }
    }
}