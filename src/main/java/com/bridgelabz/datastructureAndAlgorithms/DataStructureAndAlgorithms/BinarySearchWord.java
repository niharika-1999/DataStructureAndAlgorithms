package com.bridgelabz.datastructureAndAlgorithms.DataStructureAndAlgorithms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
/**
 * BinarySearchWord is used to search the word and return its position
 * Checks if word is present in middle returns y value if greater ignores left
 * half and search right half,if smaller ignores right half 
 * @author Niharika Rao
 *
 */

public class BinarySearchWord {
	private static int binarySearch(String[] splitArray, String word, int length)
	{
		int x = 0;
		int search = length - 1;
		while (x <= search)
		{
			int y = x + (search - x) / 2;
			int pos = -1000;
			if(word == (splitArray[y]))
			{
				pos = 0;
			}
			if(pos == 0)
			{
				return y;
			}
			if(word > (splitArray[y]))
			{
				x = y + 1;
			}
			else
			{
				search = y - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception //Main method to search the word and gives its position in file
	{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Niharika Rao\\eclipse-workspace\\DataStructureAndAlgorithms\\src\\main\\java\\com\\bridgelabz\\datastructureAndAlgorithms\\DataStructureAndAlgorithms\\BinarySearch.txt"));
		Scanner sc = new Scanner(System.in);
		String line = null;
		while ((line = reader.readLine()) != null) 
		{
			String[] splitArray = line.split(",");
			Arrays.sort(splitArray);
			int length = splitArray.length;
			System.out.println("Enter the word to search: ");
			String word = sc.nextLine();
			int position = binarySearch(splitArray, word, length);
			if (position == -1)
				System.out.println("The word '" + word +"' is not present.");
			else
				System.out.println("The word '"+word+"' is found at position: " + (position+1));
		}
		sc.close();
		reader.close();
	}
}



