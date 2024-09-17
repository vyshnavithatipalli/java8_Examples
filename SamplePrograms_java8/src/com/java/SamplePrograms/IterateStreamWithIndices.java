package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateStreamWithIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array of Strings
       
		List<String> list = Arrays.asList("first", "Second", "Third");
		get(list);

	}

	public static void get(List<String> list) {
		IntStream.range(0, list.size()).mapToObj(val -> String.format("%d +  %s" , val, list.get(val)))
				.forEach(System.out::println);
		;
	}
	

}
