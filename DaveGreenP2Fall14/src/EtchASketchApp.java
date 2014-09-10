/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAMAN
 */
public class EtchASketchApp {

    /**
     * @param args the command line arguments
     */
	 public static void main(String[] args) {
        // TODO code application logic here
         EtchASketch es1 = new EtchASketch();
         System.out.println(es1.toString());
         es1.rightKnobTwist(360);
         System.out.println(es1.getY());
         es1.rightKnobTwist(360);
         System.out.println(es1.getY());
         System.out.println(es1.toString());
    }
    
}
