package com.bridgelabz.datastructureAndAlgorithms.DataStructureAndAlgorithms;
import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfStrings {
	static ArrayList<String> permutations1=new ArrayList<>();
	static ArrayList<String> permutations2 = new ArrayList<>();

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int len = str.length();
		PermutationsOfStrings permutation = new PermutationsOfStrings();
		permutation.Recursion(str, 0, len-1);
		System.out.println("using recursive approach:"+permutations1);
		permutation.Iteration(str);
		System.out.println("using iterative approach:"+permutations2);
		permutation.checkEqual();
		sc.close();
	}

	private void Recursion(String str, int x, int y)//String str with x and y start and end index to calculate permutation
	{
		if (x == y)
			permutations1.add(str);
		else
		{
			for (int i = x; i <= y; i++)
			{
				str = swap(str,x,i);
				Recursion(str, x+1, y);
				str = swap(str,x,i);
			}
		}
	}

	private String swap(String str1, int i, int j)//Method to obtain swapped string
	{
		char temp;
		char[] charArray = str1.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	private void Iteration(String str)//Method to give all permutations of string
	{
		if (str == null || str.length() == 0) {
			return;
		}
		permutations2.add(String.valueOf(str.charAt(0)));// initialize list with the first character of the string
		for (int i = 1; i < str.length(); i++)
		{
			for (int j = permutations2.size() - 1; j >= 0 ; j--)
			{
				String s = permutations2.remove(j);

				for (int k = 0; k <= s.length(); k++)
				{
					permutations2.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}
	}

	private void checkEqual()//To check if returned arrays of two string function is equal
	{
		int check=0;
		for(int i=0;i<permutations1.size();i++)
		{
			if(permutations2.contains(permutations1.get(i)))
				continue;
			else
				check=1;
		}
		if(check==0)
			System.out.println("Same permutations is obtained");
		else
			System.out.println("Different permutations is obtained");
	}
}



