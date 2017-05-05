package guvipractise;
import java.util.Scanner;
public class Greatest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Greatest among 3 numbers");
System.out.println("Enter 3 numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b && a>c)
{
	System.out.println("Greatest number is "+a);
}
else if(b>a && b>c)
{
	System.out.println("Greatest number is "+b);
}
else
{
	System.out.println("Greatest number is "+c);
}
	}

}
