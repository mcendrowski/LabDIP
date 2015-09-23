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
public class StartUp {
    public static void main(String[] args) {
        
        OOPPrincipleOfADayCreator creator = new OOPPrincipleOfADayCreator();
//      WelcomeMessage creator = new WelcomeMessage();      

      
//      System.out.println(creator.getMessage());
        
        MessageManager mngr = new MessageManager(creator);
        
        GUIReceiver receiver = new GUIReceiver(creator.getMessage());
//        ConsoleReceiver receiver = new ConsoleReceiver(creator.getMessage());
        
        mngr.setReceiver(receiver);
        

        mngr.showMessage(); // shows a message
        
        
        
        
        
        
        
        
        
        
    }  
}
