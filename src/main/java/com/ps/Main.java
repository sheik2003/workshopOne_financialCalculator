package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-----\uD83D\uDCB0Financial Calculator\uD83D\uDCB0-----");
        System.out.println("\uD83D\uDCC9 Calculator 1 - Loan Payment");
        System.out.println("\uD83D\uDCC8 Calculator 2 - Future Value");
        System.out.println("\uD83E\uDDFE Calculator 3 - Annuity Value");
        System.out.println("\uD83D\uDCB9 Calculator 4 - S&P 500 Growth");
        System.out.print("Please select a Calculator (enter either 1,2,3,4 to choose the calculator): ");
        int givenCommand = scanner.nextInt();



        switch (givenCommand) {
            case 1:
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("You have selected Financial Calculator 1\uD83D\uDCC9 : This will help you calculate the monthly payment for what your load would be--");

                System.out.println("Please enter the loan amount: ");
                double principal = scanner.nextDouble();

                System.out.println("Please enter the interest rate amount(format e.g., 7.625% = 0.07625): ");
                double annualInterestRate = scanner.nextDouble();

                System.out.println("Please enter the length of the Loan(years): ");
                double years = scanner.nextDouble();

                double monthlyPayment ;
                double totalInterest ;
                double numberOfMonthlyPayments = 12 * years;
                double monthlyInterestRate = annualInterestRate / 12;

                //calculations
                monthlyPayment = principal * (monthlyInterestRate*Math.pow((((1 + monthlyInterestRate))),numberOfMonthlyPayments)) / (Math.pow((1+monthlyInterestRate),numberOfMonthlyPayments)-1);
                totalInterest = (monthlyPayment * numberOfMonthlyPayments) - principal;

                System.out.println("Your monthly Payment is: " + monthlyPayment);
                System.out.println("Your total interest paid would be: " + totalInterest);
                break;
        case 2:
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("You have selected Financial Calculator 2\uD83D\uDCC9 : This will help you calculate the future value of a one-time deposit assuming compound interest");
            System.out.println("Please enter the deposit amount: ");
            double principalC2 = scanner.nextDouble();

            System.out.println("Please enter the interest rate amount(format e.g., 7.625% = 0.07625): ");
            double annualInterestRateC2 = scanner.nextDouble();

            System.out.println("Please enter how long the deposit will be for(years): ");
            double yearsC2 = scanner.nextDouble();

            double futureValue;
            double totalInterestC2;
            futureValue = principalC2 * Math.pow(1+(annualInterestRateC2/365),365 * yearsC2);

            totalInterestC2 = futureValue - principalC2;

            System.out.println("The future value is: " + futureValue);
            System.out.println("Total interest earned is: " + totalInterestC2);
            break;
        case 3:
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("You have selected Financial Calculator 3\uD83E\uDDFE: This will help you determines the present value of an ordinary annuity");
            System.out.println("Please enter the monthly payout amount: ");
            double monthlyPayoutAmount = scanner.nextDouble();

            System.out.println("Please enter the expected interest rate amount(format e.g., 7.625% = 0.07625): ");
            double expectedInterestRate = scanner.nextDouble();

            System.out.println("Please enter the years to payout (years): ");
            double yearsC3 = scanner.nextDouble();

            double presentValue;

            presentValue = monthlyPayoutAmount * ((1-(Math.pow(1+(expectedInterestRate/12),-yearsC3*12)))/((expectedInterestRate/12)));

            System.out.println("Then the present value of that annuity would be: " + presentValue);

            break;

            case 4:
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("You have selected Financial Calculator 4\uD83D\uDCB9: This will help you determines how much your investment in the S&P500 would be if you invested in it a certain year (not adjusted for inflation and assumes average return of 10%)");
                System.out.println("Please enter the your investment amount: ");
                double investedAmount = scanner.nextDouble();

                System.out.println("Please enter the year in which you made the investment: ");
                double yearInvested = scanner.nextDouble();

                System.out.println("Please enter the year you want to check the investments value for: ");
                double yearInvestmentCheck = scanner.nextDouble();

                double timeInvested = yearInvestmentCheck - yearInvested;
                double futureValueOfInvestment;

                futureValueOfInvestment = investedAmount * Math.pow(1+0.1,timeInvested);
                double profit = futureValueOfInvestment - investedAmount;

                System.out.println("If you've invested " + investedAmount + " in the year " + (int)yearInvested + " You would have " + futureValueOfInvestment + " by the year " + (int) yearInvestmentCheck + " and the total Amount you would've profitted would be: " + profit);

                break;
        }

    }
}

