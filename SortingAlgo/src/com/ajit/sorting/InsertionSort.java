/**
 * 
 */
package com.ajit.sorting;

/**
 * Insertion Sort Algorithm
 * Insertion sort is a simple sorting algorithm that 
 * works the way we sort playing cards in our hands.
 * @author AjitKonde
 * 
 */
public class InsertionSort {
	/**
	 * Sorts the array
	 * 
	 * @param arr
	 */
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one
			 * position ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/**
	 * Prints the array
	 * 
	 * @param arr
	 */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		printArray(arr);
	}

}
