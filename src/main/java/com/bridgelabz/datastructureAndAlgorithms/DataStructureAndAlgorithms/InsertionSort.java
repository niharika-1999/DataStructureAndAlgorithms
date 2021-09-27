package com.bridgelabz.datastructureAndAlgorithms.DataStructureAndAlgorithms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
/**
 * Class Insertion Sort is used to sort the List of Strings
 * @author Niharika Rao
 *
 */

public class InsertionSort {
	private static void insertionSort(String[] stringArray) 
	{
		int x = stringArray.length;
        for (int i=1; i<x; i++)
        {
            String key = stringArray[i];
            int j = i-1;
            while (j>=0 && stringArray[j].compareTo(key)>0)
            {
            	stringArray[j+1] = stringArray[j];
                j = j-1;
            }
            stringArray[j+1] = key;
        }
        for(int i=0;i<stringArray.length;i++)
        {
            System.out.print(stringArray[i]+" ");
        }		
	}
	public static void main(String[] args) throws Exception //Main method which display the sorted array after insertionSort function is performed
	{
		BufferedReader buffereader = new BufferedReader(new FileReader("C:\\Users\\Niharika Rao\\eclipse-workspace\\DataStructureAndAlgorithms\\src\\main\\java\\com\\bridgelabz\\datastructureAndAlgorithms\\DataStructureAndAlgorithms\\BinarySearch.txt"));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = buffereader.readLine()) != null) 
        {
          String[] splitArray = line.split(",");
          insertionSort(splitArray);
        }
        sc.close();
        buffereader.close();
	}

}
