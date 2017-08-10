package jherry;
/*
Introduction to OOP with Java (5th Ed), McGraw-Hill

Wu/Otani

Chapter 4 Sample Development: Loan Calculation (Step 5)

File: Step5/LoanCalculator.java

This class controls the input, computation, and output of loan
*/

import java.text.DecimalFormat;
import java.util.*;

class LoanCalculator {

//----------------------------------
//  Data Members
//----------------------------------

   // This object does the actual loan computation
  private Loan loan;
  
  private Scanner scanner;

//----------------------------------
//
//Main Method
//
//----------------------------------

  public static void main(String[] arg) {
      
      LoanCalculator calculator = new LoanCalculator();
      calculator.start();
  }

//----------------------------------
//  Constructors
//----------------------------------

  public LoanCalculator() {
      
      scanner = new Scanner(System.in);
      
  }

//-------------------------------------------------
//    Public Methods:
//
//        void start (        )
//
//------------------------------------------------

  //Top-level method that calls other private methods
  public void start() {

      describeProgram();   //tell what the program does
      getInput();          //get three input values
      displayOutput();     //display the results
  }


//-------------------------------------------------
//    Private Methods:
//
//    void    describeProgram   (        )
//    void    displayOutput     (        )
//    void    getInputs         (        )
//
//------------------------------------------------


  // Provides a brief explanation of the program to the user.
  private void describeProgram() {
      System.out.println("This program computes the monthly and total");
      System.out.println("payments for a given loan amount, annual ");
      System.out.println("interest rate, and loan period (# of years).");
      System.out.println("\n");
  }


  //Displays the input values and monthly and total payments.
  private void displayOutput() {
      
      DecimalFormat df = new DecimalFormat("0.00");
      
      System.out.println("Loan Amount: $" + loan.getAmount());
      System.out.println("Annual Interest Rate:"
                          + loan.getRate() + "%");
      System.out.println("Loan Period (years): " + loan.getPeriod());

      System.out.println("Monthly payment is $ " + 
                                     df.format(loan.getMonthlyPayment()));
      System.out.println("  TOTAL payment is $ " + 
                                     df.format(loan.getTotalPayment()));
  }


  // Gets three input values--loan amount, interest rate, and
  // loan period
  private void getInput() {
      double  loanAmount, annualInterestRate;

      int     loanPeriod;

      System.out.print("Loan Amount (Dollars+Cents):");
      loanAmount  = scanner.nextDouble();

      System.out.print("Annual Interest Rate (e.g., 9.5):");
      annualInterestRate = scanner.nextDouble();

      System.out.print("Loan Period - # of years:");
      loanPeriod  = scanner.nextInt();

      //create a new loan with the input values
      loan = new Loan(loanAmount, annualInterestRate,loanPeriod);

  }

}


