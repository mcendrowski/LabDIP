package dip.lab1.student.solution1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public class SalariedEmployee implements AnnualCompensation {
    private double annualSalary;
    private double annualBonus;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    

    /**
     * @return the annualSalary
     */
    public final double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the annualBonus
     */
    public final double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * @param annualBonus the annualBonus to set
     */
    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    @Override
    public double getAnnualCompensationForEmployee(){
        return this.annualSalary+this.annualBonus;
    }
}
