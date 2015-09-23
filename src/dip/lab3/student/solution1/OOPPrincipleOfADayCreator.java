/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author MCENDROWSKI
 */
public class OOPPrincipleOfADayCreator implements MessageCreator {
//    private String message;
    private String messages[] = new String[6];
    private String message;
    
    public OOPPrincipleOfADayCreator(){
        messages[0]="Open/Closed Principle:\nClasses should be open to extension but close to change\n"+
"(adding new concrete method is allowed,\n" +
"but changing method or overriding them not)";
        messages[1]="Single Responsibility Principle:\na class should be as small as possible, performing single tasks only";
        messages[2]="High Cohesion:\nall methods are related in some way to the same overall responsibility,\n" +
"expose as few public methods as possible,\n" +
"helper methods should be hidden";
        messages[3]="Encapsulation:\nhide access to all properties,\n" +
"provide public getters and setters,\n" +
"hide complex logic in private helper methods";
         messages[4]="Dependency Inversion Principle:\n1) High-level modules should not depend upon low level\n" +
" modules. Both should depend upon abstractions; and, \n" +
"2) Abstractions should not depend upon details. Details should depend upon abstractions. The\n" +
" term \"details\" refers to implementation logic.";
          messages[5]="Liskov Substitution Principle:\nderived classes (e.g., KeyboardReader and ScreenWriter) must be usable \n" +
" * through their base class interface (in this case the base class is the\n" +
" * Object class), without the client (in this case, Copier) being able to tell \n" +
" * the difference. That isn't true here! The object class does not have the\n" +
" * methods readln() and writeln() which are in KeyboardReader and KeyboardWriter\n" +
" * respectively.";      
        
        this.drawMessage();
    }

    public final String[] getMessages() {
        return this.messages;
    }

    public final void setMessages(String[] messages) {
        this.messages = messages;
    }
    
    
    private void drawMessage(){
        int messageNumber=0;
        Random randomMessage = new Random();
        messageNumber=randomMessage.nextInt(messages.length);
        this.message=messages[messageNumber];
    }
    
    @Override
    public final String getMessage(){
        return message;
    }
    
}
