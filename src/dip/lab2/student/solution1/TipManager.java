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
public class TipManager {
    private TippedService service;

    public TipManager(TippedService service) {
        this.service = service;
    }

    public final TippedService getService() {
        return service;
    }

    public final void setService(TippedService service) {
        this.service = service;
    }
    
    public final double getTip(){
        return this.service.getTip();
    }
    
}
