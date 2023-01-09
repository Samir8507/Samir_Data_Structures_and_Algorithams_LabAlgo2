package com.samir.paymoney;
import java.util.Scanner;
public class PaymoneyArray {
	
	public static void main(String[] args) {
		    try (Scanner pay = new Scanner(System.in)) {
				System.out.println("Enter the size of transaction Array :");
				int Size = pay.nextInt();
				int a[] = new int[Size];
				System.out.println("Enter the value of Array :");
				for(int i = 0; i < Size; i++) {
					a[i] = pay.nextInt();
					
				}
				System.out.println("Enter the total no of tragets that needs to be achieved :");
				int targetNumber = pay.nextInt();
				while (targetNumber--!=0) {
					int flag =0;
					long targetValue;
					long sum = 0;
					System.out.println("Enter the value of target");
					targetValue = pay.nextLong();
					for(int i=0; i<Size; i++) {
						sum = sum+a[i];
						if(sum>=targetValue) {
							System.out.println("Target Value achieved after"+ (i+1)+" "+"transctions");
						flag =1;
						break;
						}
						
					}
					if(flag ==0) {
						System.out.println("The given target Amount is not achieved");
				}				

				}
			}
		}
}



