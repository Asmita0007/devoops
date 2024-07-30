import java.util.*;
class CountD{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no to count the digit");
	int n=sc.nextInt();
	int count=0;
	while(n!=0){
	  n/=10;
	  count++;
	}
	System.out.println(count);
	}
}