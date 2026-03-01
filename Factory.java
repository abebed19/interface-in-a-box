
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
        
        switch (number) {
            case 0:
                return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
            case 1:
                return new CD("Wigwam", "Nuclear Nightclub", 1975);
            case 2:
                return new Book("Robert Martin", "Clean Code", 1);
            default:
                return new Book("Kent Beck", "Test Driven Development", 0.7);
        }   
    }
}
