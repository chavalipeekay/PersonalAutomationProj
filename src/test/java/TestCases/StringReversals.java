package TestCases;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.DMax;

public class StringReversals {

	public static void main(String... args) {
		
//		Scanner sc=new Scanner(System.in); // chenges here too
		
//		System.out.println("Enterr any string : ");
//		String input = sc.next();
		String input = "asd789qwerty";
		System.out.println("Original String = "+input);
//		System.out.println("Reverse String Except Numbers = "+reverseStringExceptNumbers(input));
		System.out.println("Reverse String = "+ reverse(input));
		System.out.println("Reverse String Retain Digit Positions = "+ reverseStringRetainDigitPosition(input));
	}
	
	public static String reverseStringRetainDigitPosition(String input) {
		Map<Integer, Character> dMap= new HashMap<Integer, Character>();
		ArrayList<Character> cArr=new ArrayList<>();
		for(int i=input.length()-1;i>=0;i--) {
			if(Character.isDigit(input.charAt(i))) 
				dMap.put(i, input.charAt(i));
			else {
				cArr.add(input.charAt(i));
			}
		}
		input="";
//		System.out.println(cArr+" "+dMap.keySet());
		for(Integer i: dMap.keySet()) {
//			System.out.println("pos = "+i);
			cArr.add(i, dMap.get(i));
		}
		for(Character c:cArr)
			input=input+c;
		return input;
//		System.out.println(cArr+ " and "+input );
	}
	
	public static String reverse(String input) {
		 StringBuilder sb=new StringBuilder(input);
		 return sb.reverse().toString();
	}

	public static String reverseStringExceptNumbers(String input) {
		char[] characters = input.toCharArray();
		int left = 0;
		int right = input.length() - 1;

		while (left < right) {
			if (Character.isDigit(characters[left])) {
				left++;
				continue;
			}
			if (Character.isDigit(characters[right])) {
				right--;
				continue;
			}
			char temp = characters[left];
			characters[left] = characters[right];
			characters[right] = temp;
			left++;
			right--;
		}
		return new String(characters);
	}
}
