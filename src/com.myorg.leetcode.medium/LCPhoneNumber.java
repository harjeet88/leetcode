package com.myorg.leetcode.medium;

import java.util.List;

public class LCPhoneNumber {
public static List<String> letterCombinations(String digits) {
	String[] ph= {"abc" , "def" , "ghe", "ijk" , "lmn" , "opq", "rst", "uvw" , "xyz"};
	
	String[] dig=digits.split("");
	
	for(String n:dig) {
		String l =ph[(Integer.parseInt(n)-1)];
		
	}
	
     return null;   
    }

public static void main(String[] args) {
	LCPhoneNumber.letterCombinations("23");
}

}
