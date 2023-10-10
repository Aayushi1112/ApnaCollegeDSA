package numbergame;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
		}
	}
	return isPrime;}
	
	public static void main(String args[]) {
		//if 2 to n-1 if it is divisible by any number then it is not prime
		while(true) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=isPrime( n);
		
		
		if(flag==false) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}}
}

