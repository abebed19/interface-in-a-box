
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Box implements Packable {
    
   private ArrayList<Packable> items;
   private double capacity;
   
   public Box(double capacity){
       this.items = new ArrayList<>();
       this.capacity= capacity;
   }
   
   public void add(Packable packable){
       
       if(this.weight() + packable.weight() <= this.capacity){
           items.add(packable);
       }
               
   }
   @Override
   public String toString(){    
       return "Box: "+ items.size()+" items, total weight "+ this.weight()+" kg";
   }

    @Override
    public double weight() {
       double weightAdded = 0.0;
       
       for(Packable packed: items){
           weightAdded = weightAdded + packed.weight();
       }  
       return  weightAdded;
    }
   
    
}
