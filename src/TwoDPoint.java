/**
 * 
 * @author huangtt
 *
 */
public class TwoDPoint {
	public TwoDPoint(){
		x=y=0;
	}
	
	public TwoDPoint(double n1, double n2){
		x=n1;
		y=n2;
	}
	public void setXCoordinate(double n) {
		x=n;
	}
	
	public void setYCoordinate(double n) {
		y=n;
	}
	public double findDistance(TwoDPoint a) {
		double length=Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y, 2));
		return length;
	}
	
	public void printPoints() {
		System.out.print("("+this.x + ","+this.y +")");
	}
	
	protected double x;
	protected double y;
		
}
