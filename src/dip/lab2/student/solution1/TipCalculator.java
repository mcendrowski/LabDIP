/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author MCENDROWSKI
 */
public class TipCalculator {
    private TippedService service;

    public TipCalculator(TippedService service) {
        this.service = service;
    }

    public TippedService getService() {
        return service;
    }

    public void setService(TippedService service) {
        this.service = service;
    }
    
    public double getTip(){
        return this.service.getTip();
    }
    
}