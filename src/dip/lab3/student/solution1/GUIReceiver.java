/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author MCENDROWSKI
 */
public class GUIReceiver implements MessageReceiver {

    private String message;

    public GUIReceiver(String message) {
        this.message = message;
    }

    public final String getMessage() {
        return message;
    }

    public final void setMessage(String message) {
        this.message = message;
    }

    @Override
    public final void showMessage() {

        JOptionPane.showMessageDialog(null, this.getMessage());
    }
}
