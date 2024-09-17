package com.java.SamplePrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountofEachCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "string data to count each character";
		Map<Character, Long> map=s.chars().mapToObj(x->Character.toLowerCase(Character.valueOf((char)x)))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
