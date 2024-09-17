package com.java.SamplePrograms;

import java.util.Collection;

public class CountOfGivenCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "wwelcome";
		char ch = 'w';

		Long count = getCount(str, ch);

		System.out.println(count);
	}

	public static Long getCount(String value, char ch) {
		return value.chars().filter(x -> x == ch).count();
	}

}
