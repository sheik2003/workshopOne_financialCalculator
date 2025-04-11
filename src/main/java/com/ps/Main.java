package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-----Financial Calculator-----");
        System.out.println("1) Calculator1");
        System.out.println("2) Calculator2");
        System.out.println("3) Calculator3");
        System.out.print("Please select an operation: ");
        int givenCommand = scanner.nextInt();


      
        switch (givenCommand) {
            case 1:
                System.out.println("--You have selected Financial Calculator 1: This will help you calculate the monthly payment for what your load would be--");

                System.out.println("Please enter the load amount: ");
                double principal = scanner.nextDouble();

                System.out.println("Please enter the interest rate amount(format e.g., 7.625% = 0.07625): ");
                double annualInterestRate = scanner.nextDouble();

                System.out.println("Please enter the length of the Loan(years): ");
                double years = scanner.nextDouble();

                double monthlyPayment ;
                double totalInterest ;
                int numberOfMonths = 12;
                double numberOfMonthlyPayments = 12 * years;
                double monthlyInterestRate = annualInterestRate / 12;

                //calculations
                monthlyPayment = principal * (monthlyInterestRate*Math.pow((((1 + monthlyInterestRate))),numberOfMonthlyPayments)) / (Math.pow((1+monthlyInterestRate),numberOfMonthlyPayments)-1);
                totalInterest = (monthlyPayment * numberOfMonthlyPayments) - principal;

                System.out.println("Your monthly Payment is: " + monthlyPayment);
                System.out.println("Your total interest paid would be: " + totalInterest);
                break;
//        case 2:
//            result = firstNum - secondNum;
//            break;
//        case 3:
//            result = firstNum * secondNum;
//            break;
//        case 4:
//            if(secondNum == 0){
//                System.out.println("You cannot divide by zero");
//                result = 0;
//            }else{
//                result = firstNum / secondNum;}
//            break;
//        default:
//            System.out.println("INVALID COMMAND try again");


        }

    }
}