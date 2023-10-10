package BasicArrays;

import java.util.Scanner;

public class PrintIndexOfNum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int numArr[]=new int[size];
		System.out.println("Now enter the arrayElements");
		for(int i=0;i<size;i++) {
			System.out.println("Enter value of index"+i);
			numArr[i]=sc.nextInt();
			}
		
		System.out.println("Your array has been filled with values.If you want to see you array elements enter 1");
		int one=sc.nextInt();
		if(one==1) {
			for(int i=0;i<size;i++) {
				System.out.println(i+" "+numArr[i]);
			}
		}
		
		System.out.println("Enter the element you want to search for:");
		boolean flag=false;
		int ele=sc.nextInt();
		int index=0;
		for(int i=0;i<size;i++) {
			if(numArr[i]==ele) {
				flag=true;
				index=i;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Element found at"+index);
		}
		else
		{System.out.println("not found");
	}

}}
