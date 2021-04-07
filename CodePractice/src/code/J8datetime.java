package code;

import java.time.LocalDate;

public class J8datetime {
	
	public static void main(String[] args) { 
		
		LocalDate dt = LocalDate.now();
		System.out.println(dt.toString());                //2013-05-15
		System.out.println(dt.getDayOfWeek().toString()); //WEDNESDAY
		System.out.println(dt.getDayOfMonth());           //15
		System.out.println(dt.getDayOfYear());            //135
		System.out.println(dt.isLeapYear());              //false
		System.out.println(dt.plusDays(12).toString());   //2013-05-27
		
	}

}
