package com.bridgelabz.datastructureAndAlgorithms.DataStructureAndAlgorithms;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Anagrams used to detect anagrams of two strings
 * @author Niharika Rao
 *
 */
public class AnagramDetection {
	private static void checkAnagram(String x, String y) 
	{
		String str1 = x.replaceAll("\\s", "");
		String str2 = y.replaceAll("\\s", "");
		boolean status = true;
		if (str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			char[] arrayStr1 = str1.toLowerCase().toCharArray();
			char[] arrayStr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(arrayStr1);
			Arrays.sort(arrayStr2);
			status = Arrays.equals(arrayStr1, arrayStr2);
		}
		if (status) 
		{
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else 
		{
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	public static void main(String[] args) { //Main method to check if two strings are anagram or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings:");
		String x = sc.nextLine();
		String y = sc.nextLine();
		checkAnagram(x,y);
		sc.close();
	}
}
