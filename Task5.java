package task1;

import java.util.Scanner;

public class Task5 {
	public static String findDay(String day,int k) {
	   String[] week= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	   int index=0;
	   for(int i=0;i<week.length;i++) {
		   if(week[i].equals(day)) {
			   index=i;
			   break;
		   }
	   }
	   int nextDay=(index+k)%7;
	   return week[nextDay];
    }
    public static void main(String[] args) {
    	String day;
    	int k;
    	 Scanner scn=new Scanner(System.in);
    	 System.out.println("day=");
    	 day=scn.next();
    	 System.out.println("k=");
    	 k=scn.nextInt();
    	 
    	 System.out.println(findDay(day,k));
         scn.close();
	

}
}
