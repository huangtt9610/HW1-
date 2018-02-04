import java.util.*;
/**
 * 
 * @author huangtt
 *
 */
public class Month {
	public static String getMonth (int num) {
		String month;
		//recall how to use switch statement from https://www.tutorialspoint.com/java/switch_statement_in_java.htm	
		switch(num) {	
			case 1:month="January";
				break;
			case 2:month="Feburary";
				break;
			case 3:month="March";
				break;
			case 4:month="April";
				break;
			case 5:month="May";
				break;
			case 6:month="June";
				break;
			case 7:month="July";
				break;
			case 8:month="August";
				break;
			case 9:month="September";
				break;
			case 10:month="October";
				break;
			case 11:month="November";
				break;
			case 12:month="December";
				break;
			default: month="no corresponding month";
				break;	
		}
		return month;
	}
	public static void main(String[] args ) {
		Random randomNum=new Random(); //I got info from http://www.javapractices.com/topic/TopicAction.do?Id=62
		int n=randomNum.nextInt(12)+1;
		System.out.println("The corresponding month of number "+n+" is "+getMonth(n));
		
		System.exit(0);
	}
}
