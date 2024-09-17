package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartingWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 12, 3, 4, 5, 16, 7);
		list.stream().map(s -> s + "").//convert to string
		filter(x -> x.startsWith("1")).forEach(System.out::println);
	}

}
