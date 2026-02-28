
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Factory {
    
    public Factory(){
        
    }
    
    public Packable produceNew(){
        
      
        Random ticket = new Random(4);
        int number = ticket.nextInt();
     
        
    }
}
