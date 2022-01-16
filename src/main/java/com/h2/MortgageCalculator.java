package com.h2;

public class MortgageCalculator {
    private long loanAmount;
    private int termInYears;
    private float annualRate;
    private double monthlyPayment;

    public MortgageCalculator(long loanAmount, int termInYears, float annualRate){
        loanAmount = this.loanAmount;
        termInYears = this.termInYears;
        annualRate = this.annualRate;

    }
    private int getNumberOfPayments(){
        return 0;
    }
}
