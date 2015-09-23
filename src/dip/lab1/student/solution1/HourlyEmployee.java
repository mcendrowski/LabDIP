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
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }
    
    

    /**
     * @return the hourlyRate
     */
    public final double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public final void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the totalHrsForYear
     */
    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * @param totalHrsForYear the totalHrsForYear to set
     */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
    
    @Override
    public final double getAnnualCompensationForEmployee(){
        return hourlyRate*totalHrsForYear;
    }
}
