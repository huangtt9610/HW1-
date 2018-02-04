import java.util.*;
/**
 * 
 * @author huangtt
 *
 */
public class Triangle extends TwoDPoint{
	
	public boolean isRealTriangle(TwoDPoint a, TwoDPoint b, TwoDPoint c) {
		double length1=a.findDistance(b);
		double length2=a.findDistance(c);
		double length3=b.findDistance(c);
		
		boolean isReal = true;
		if((length1+length2)<=length3 || (length1+length3)<=length2 || (length3+length2)<=length1 ) {
			isReal=false;
		}
		
		return isReal;
	}
	
	public static void print(boolean isReal,TwoDPoint a, TwoDPoint b, TwoDPoint c) {
		System.out.print("Points "); 
		a.printPoints();
		b.printPoints();
		c.printPoints();
		
		if(isReal==false)
			System.out.println(" do not form a real triangle\n");
		
		else
			System.out.println(" form a real triangle\n");	
	}
	
	public static void main(String[] args) {
		Triangle t=new Triangle();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter coordinates-> ");
		
		while(s.hasNext()) {		
			TwoDPoint[] point=new TwoDPoint[3];
			
			try{
				for(int i=0; i<3; i++) {
					point[i]=new TwoDPoint(s.nextDouble(),s.nextDouble());
	
					if(i<2)
						System.out.println("Enter coordinates-> ");
					else
						print(t.isRealTriangle(point[0],point[1],point[2]), point[0],point[1],point[2]);	
				}
			
				System.out.println("Enter coordinates-> ");
			}
			catch(Exception e) {//I got info from https://beginnersbook.com/2013/04/try-catch-in-java/
				System.out.println('"'+s.next() +'"' + " is a invalid value, enter new value for coordinates->\n");
			}

		}
		s.close();
		System.exit(0);
	}
}

