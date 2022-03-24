package com.greatlearning.corejava;

import java.util.Scanner;

public class LinearSearchPractice {
	public int num_elements, key_element;
	public int array[];
	public boolean status = false;
	Scanner scanner = new Scanner(System.in);
	
	public void insertValues() {
	System.out.println("Enter the number of elements you want in array: ");	
	
	num_elements = scanner.nextInt();
	array = new int[num_elements];
	System.out.println("Eneter the elements now: ");
	
	for(int i=0;i<num_elements;i++) {
		System.out.println("enter element at position"+i+":");
		array[i]=scanner.nextInt();
	}
	}
	public void printValues() {
		for(int i =0; i<num_elements;i++) {
			System.out.println("element at position "+i+" is: "+array[i]);
		}
	}
	public void searchValues() {
		System.out.println("Enter an element to search");
		key_element = scanner.nextInt();
		for(int i=0; i<array.length; i++) {
			if(array[i]==key_element) {
				System.out.println("Search Value  "+key_element+" found at array index "+i);
				status = true;
				
			}
		}if(status == false) {
				System.out.println("Element not found");
			}
		
	}

	public static void main(String[] args) {
		
		LinearSearchPractice lsp = new LinearSearchPractice();
		lsp.insertValues();
		lsp.printValues();
		lsp.searchValues();
		
		

	}

}
