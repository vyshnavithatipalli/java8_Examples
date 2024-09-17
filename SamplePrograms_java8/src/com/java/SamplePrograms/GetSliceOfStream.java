package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetSliceOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,8,9);
		System.out.println(getSliceOfStream(list.stream(),2,5));

	}
	public static List<Integer> getSliceOfStream(Stream<Integer> value,long start,long end) {
		
		return value.skip(start).limit(end-start+1).collect(Collectors.toList()); 
				
	}

}
