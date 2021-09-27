package com.bridgelabz.datastructureAndAlgorithms.DataStructureAndAlgorithms;
import java.util.Scanner;
/**
 * MergeSort is used to sort the list of strings
 * arr is string array,x is start index,m is middle index and y is end index
 * @author Niharika Rao
 *
 */

public class MergeSort {
	private static void sort(String[] arr, int x, int y)
	{
		int n = arr.length;
		if (x < y)
		{
			int m = (x+y)/2;

			sort(arr, x, y);
			sort(arr , m+1, y);
			mergeSort(arr, x, m, y);
		}
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
	}
	private static void mergeSort(String[] arr, int x, int m, int y)
	{
		int n1 = m - x + 1;
		int n2 = y - m;
		String X[] = new String [n1];
		String Y[] = new String [n2];
		for (int i=0; i<n1; ++i)
			X[i] = arr[x + i];
		for (int j=0; j<n2; ++j)
			Y[j] = arr[m + 1+ j];
		int i = 0, j = 0;
		int k = x;
		while (i < n1 && j < n2)
		{
			if (X[i].compareTo(Y[j])<=0)
			{
				arr[k] = X[i];
				i++;
			}
			else
			{
				arr[k] = Y[j];
				j++;
			}
			k++;
		}
		while (i < n1)
		{
			arr[k] = X[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = Y[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args)//Main method gives sorted array after mergeSort function  
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the element in  array: ");
		String[] array = new String[size] ; 
		for(int i=0;i<array.length;i++) 
		{
			array[i] = sc.next();
		}
		int x =0;
		int y = array.length-1;
		sort(array,x,y);
		sc.close();
	}


}
