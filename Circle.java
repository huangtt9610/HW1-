import java.util.*;
/**
 * 
 * @author huangtt
 *
 */
public class Circle extends TwoDPoint{
	
	public Circle(double r, TwoDPoint pt) {
		if(r<0.0)
			throw new ArithmeticException("radius cannot be negative");
		radius=r;
		center=pt;
	}
	
	public int circleRelation (Circle c) {
		int relation=-1;
		double distance=center.findDistance(c.center);
		if(distance>radius+c.radius)
			relation=0;
		if(distance==radius+c.radius) 
			relation=1;
		if(distance<radius+c.radius)
			relation=2;
		if(radius>=distance+c.radius || c.radius>=distance+radius)
			relation=3;
		return relation;
	}
	
	public static void print(int i) {
		switch(i) {
			case 0: System.out.println("The circles are separate from each other\n");
				break;
				
			case 1: System.out.println("The circles are touching each other\n");
				break;
				
			case 2: System.out.println("The circles are overlapping each other\n");
				break;
				
			case 3: System.out.println("The circles are completely within one another\n");
					break;
		}
	}
	
	protected double radius;
	protected TwoDPoint center;
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the center coordinate of a circle: ");
		
		while(s.hasNext()) {
			try {
				TwoDPoint[] pt=new TwoDPoint[2];
				Circle[] circle=new Circle[2];
			
				for(int i=0; i<2; i++) {
					if(i>0)
						System.out.println("Enter the center coordinate of a circle: ");
					pt[i]=new TwoDPoint(s.nextDouble(),s.nextDouble());
				
					for (int j=0; j<1; j++) {
						System.out.println("Enter the radius: ");
						circle[i]=new Circle(s.nextDouble(), pt[i]);
					}
				}
			
				print(circle[0].circleRelation(circle[1]));
				System.out.println("Enter the center coordinate of a circle: ");
				
			} catch(Exception e) {
				System.out.println(e);
				System.out.println("Enter the center coordinate of a circle: ");
			}
		}
		s.close();
		System.exit(0);
	}
}
