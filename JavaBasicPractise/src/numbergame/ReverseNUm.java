package numbergame;

import java.util.Scanner;

public class ReverseNUm {
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("the number is"+number);
		
		int sum=0;
		int digit=0;
		while(number>0) {
			digit=number%10;
			sum=sum*10+digit;
			number=number/10;
			
			
		}
		
		System.out.println("Reverse of number is" +sum);
		
	}

}
