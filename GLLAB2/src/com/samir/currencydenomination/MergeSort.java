package com.samir.currencydenomination;

public class MergeSort {
	public void sort (int notes [] , int low, int high) {
		if(low<high) {
			int mid = ( low + high) / 2;
			sort(notes, low, mid);
			merge (notes, low, high, mid);
		}
	}

	private void merge(int[] notes, int low, int high, int mid) {
		// TODO Auto-generated method stub
		int i = low;
		int j = mid+1;
		int k =low;
		int tempArr [] = new int [high + 1];
		while (i<=mid && j <= high) {
			if(notes[i] > notes[j])
				tempArr[k++] = notes[i++];
			else
				tempArr[k++] = notes[j++];
		}
		for( ; i<= mid; i++)
			tempArr[k++] = notes[i];
		for( ; j<=high; j++)
			tempArr[k++] = notes[j];
		for(i= low; i <=high; i++)
			notes[i] = tempArr[i];
		
	}
	
}
