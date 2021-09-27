package com.bridgelabz.datastructureAndAlgorithms.DataStructureAndAlgorithms;
import java.util.Scanner;
/**
 * BubbleSort used to sort the integer array 
 * @author Niharika Rao
 *
 */
public class BubbleSort {
	private static void bubbleSort(int[] array)
	{
		int n = array.length;
		int temp = 0;
		for(int i=0; i < n; i++)
		{
			for(int j=1; j < (n-i); j++)
			{
				if(array[j-1] > array[j])
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}       
		}
		System.out.println("Elements after Bubble Sort: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args)//Main method to produce sorted array of integers after bubbleSort function
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] array = new int[size] ;       
		for(int i=0;i<array.length;i++) 
		{
			array[i] = sc.nextInt();
		}
		bubbleSort(array);
		sc.close();
	}

}
