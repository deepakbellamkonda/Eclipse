import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter the num");
	int n=x.nextInt();
	int count=0;
	int temp=n;
	int res=0;
    while(n>0){
        count++;
        res=res*10+n%10;
        n/=10;
    }
    if(temp==res) System.out.println("its a palindrome"+" "+temp);
    else System.out.println("its not a palindrome"+" "+temp);
    System.out.println("count = "+count);
    System.out.println("Reverese Number = "+res);
	}
}

