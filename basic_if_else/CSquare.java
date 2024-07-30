//5: Write a program to print the square of even digits of the
import java.util.*;
class CSquare{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	int s=0;

    do{
      n/=10;
      if(n%2==0){
         s=n*n;
      }
      System.out.println(s);
    }while(n!=0);
	}
}