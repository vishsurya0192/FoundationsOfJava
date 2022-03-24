package com.greatlearning.corejava;

public class LinearSearch {
	
	public static int linearSearch(int[]arr, int key, int size){
		for(int i=0; i<size;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {101, 20, 31, 5, 701, 90};
		int size = arr.length;
		int key = 701;
		int position = linearSearch(arr, key, size);
		if(position== -1) {
			System.out.println("Element is not present in the given array");
			
		}else {
			System.out.println("Element found at array index "+position);
		}
		

	}

}
