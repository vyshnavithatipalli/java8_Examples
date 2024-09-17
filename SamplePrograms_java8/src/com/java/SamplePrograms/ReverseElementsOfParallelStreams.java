package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReverseElementsOfParallelStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> lists = Arrays.asList(217, 317, 417, 517); 
	        Stream<Integer> stream = lists.parallelStream(); 
	       // stream.collect(reverseStream()) 
           // .forEach(System.out::println); 
	        reverseStream(stream);
	        
	}
	 public static   Stream<Integer>  reverseStream(Stream<Integer> stream) {
		 return null;
		 
	 }

}
