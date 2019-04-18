/**
 * 
 */
package com.ajit.sorting;

/**
 * Bubble Sort Algorithm
 * Bubble Sort is the simplest sorting algorithm that works by
 * repeatedly swapping the adjacent elements if they are in wrong order.
 * @author AjitKonde
 * 
 */
public class BubbleSort {
	/**
	 * Sorts the array
	 * 
	 * @param arr
	 */
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/**
	 * Prints the array
	 * 
	 * @param arr
	 */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);

	}

}
