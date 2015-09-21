/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author MCENDROWSKI
 */
public class MessageManager {
    private MessageCreator creator;
    private MessageReceiver receiver;

    public MessageManager(MessageCreator creator) {
        this.creator = creator;
//        this.receiver = receiver;
    }

    public final MessageCreator getCreator() {
        return creator;
    }

    public final void setCreator(MessageCreator creator) {
        this.creator = creator;
    }

    public final MessageReceiver getReceiver() {
        return receiver;
    }

    public final void setReceiver(MessageReceiver receiver) {
        this.receiver = receiver;
    }
    
    public final void showMessage(){
        this.receiver.showMessage();
    }
}
