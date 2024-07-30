import java.util.*;
class Program5{
	public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	
	 System.out.println("enter the month");
	  String m=sc.next();
	 if(m=="jan"| m=="march" | m=="may"| m=="july"|m=="augu"|m=="octo"|m=="dec")
	   System.out.println("31");
	 else
	      System.out.println("30");
	
	}
}