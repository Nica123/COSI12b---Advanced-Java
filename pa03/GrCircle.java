package pa03;
/**
 * GrCircles are green circles which move under affect of gravity which affect
 * the speed with a constant acceleration of g1=9.8m/s2
*/
public class GrCircle extends CircleShape{

  // gravity acceleration is -9.8 m per square second
  private double g1=9.8;

  /**
	 * create a gravity bouncing circle and set the color to green
	 */
  public GrCircle(){
    super();
    this.vy = 0;
		this.color = new java.awt.Color(0,255,0,200); // dense green
  }

  /**
   * changes the speed with constant acceleration g1
   */
  public void update(double dt){
    this.vy+=9.8*dt;
    super.update(dt);
  }

  /**
   * toString method that add "GrCircle" in front of the default toString output
  */
  public String toString(){
    return "GrCircle:"+ super.toString();
  }
}
