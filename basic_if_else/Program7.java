import java.util.*;
class Program7{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st no");
	int n1=sc.nextInt();
    System.out.println("enter 2nd no");
	int n2=sc.nextInt();
    System.out.println("enter 3rd no");
	int n3=sc.nextInt();
    if(n1*n1+n2*n2==n3*n3)
      System.out.println("python triplet");
    else
      System.out.println("not");  
	}
}