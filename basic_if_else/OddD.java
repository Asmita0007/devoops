//4: Write a program to count the Odd digits of the given number.
import java.util.*;
class OddD{
	public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the no to count odd digit");
	 int n=sc.nextInt();
	 int count=0;
	 while(n!=0){
	 	n/=10;
	   if(n%2!=0){

	     count++;
	   }
	 }
	 System.out.println(count);
	}
}