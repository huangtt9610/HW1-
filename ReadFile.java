import java.util.*;
/**
 * 
 * @author huangtt
 *
 */
public class ReadFile {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Output Begins");
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		System.out.println("Output Ends");
		s.close();
		System.exit(0);
	}		
}
