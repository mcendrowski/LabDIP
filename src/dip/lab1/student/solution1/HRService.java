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
public class HRService {
    private Employee compensation;

    public HRService(Employee compensation) {
        this.compensation = compensation;
    }

//    public Employee getCompensation() {
//        return compensation;
//    }
//
//    public void setCompensation(Employee compensation) {
//        this.compensation = compensation;
//    }
    
    public final double getAnnualCompensationForEmployee(){
        return this.compensation.getAnnualCompensationForEmployee();
    }
    
    
}
