/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAMAN
 */
public class EtchASketch {
	public static int count = 0;
	public int id;
	public static final int initialx =0;
	public static final int initialy = 0;
	public static final int maxx = 7;
	public static final int maxy = 5;
	public static double x = 0;
	public static double y = 0;
	private double distance =0;
	
	public EtchASketch(){
	   id = count;
	   count++;
	   x=initialx;
	   y = initialy;
	}
  @Override
	public String  toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Serial Number: ").append(count).append(" Initial ").
		append("x,y: ").append("(").append(initialx).append(",").append(initialy).append(")").append("new x , new y: ")
		.append("(").append(getX()).append(",").append(getY()).append(") ").append(isClear());
		return sb.toString();		
	}
  void wrongMove(){
	  System.out.println("Error: The Screen is 7 Inches wide and 5 Inches tall");
	  System.out.println("Enter Valid Values by calling the specific function");
  }
  void leftKnobTwist(double degrees){
	  /*number of (signed) degrees to twist left knob linearly in next second*/
	  double tempx = (degrees/360)*0.5;
	  if(x<initialx && tempx>maxx){
		  wrongMove();
	  }
	  x = tempx +y;
	  if(x>maxx){
		  x = x - tempx;
		  wrongMove();
	  }
  }
  void rightKnobTwist(double degrees){
	  /*number of (signed) degrees to twist right knob linearly in next second*/
	double tempy;
	 tempy = (degrees/360)*0.5;
	  if(tempy<initialy && tempy>maxy){
		  wrongMove();
	  }
	  y = tempy+ y;
	  if(y>maxy){
		  y = y-tempy;
		  wrongMove();
	  }
  }
  void bothKnobsTwist(double leftDegrees, double rightDegrees){
	  /*number of (signed) degrees to twist both knobs linearly in next second */
	  double tempx = (leftDegrees/360)*0.5;
	  double tempy = (rightDegrees/360)*0.5;
	  if(x<initialx && tempx>maxx && tempy<initialy && tempy>maxy){
		  wrongMove();
	  }
	  y=tempy +y;
	  x = tempx +x;
	  if(x>maxx){
		  x = x - tempx;
		  wrongMove();
	  }
	  if(y>maxy){
		  y = y-tempy;
		  wrongMove();
	  }
	  distance = Math.sqrt((x*x)+(y*y));
	  
  }
  void erase(){
	  /* clear Etch-A-Sketch screen (any movement causes screen to be ‘non-clear’)*/  
	  x =0.0;
	  y = 0.0;
  }
/*Queries*/
 double getY() {
	 /*present Y position of stylus in*/
	 return y;
 }
 double getX(){
	 /* present X position of stylus*/
	 return x;
 }
 boolean isClear(){
	 /* return true if nothing on Etch-A-Sketch*/
	 if(x==0 && y ==0){
	 return true;
	 }
	 return false;
 }
double distance(){
	/*return distance traveled by stylus since last erase*/
	distance = Math.sqrt((x*x)+(y*y));
	return distance;
}


}