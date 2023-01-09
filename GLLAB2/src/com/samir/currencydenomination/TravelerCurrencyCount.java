package com.samir.currencydenomination;
import java.util.Scanner;
public class TravelerCurrencyCount {
	public static void main (String[] args) {
		System.out.println("Enter the size of currency denomination");
		try (Scanner currency = new Scanner(System.in)) {
			int size = currency.nextInt();
			int notes [] = new int [size];
			System.out.println("Enter the currency denomination value");
			for (int i =0; i<size; i++) {
				notes[i] = currency.nextInt();
			}
			MergeSort a = new MergeSort();
			a.sort(notes , 0, notes.length - 1);
			System.out.println("Enter the amount you want to pay");
			int amount = currency.nextInt();
			NotesCount c = new NotesCount();
			c.notesCount(notes, amount);
		}
		
	}
}
