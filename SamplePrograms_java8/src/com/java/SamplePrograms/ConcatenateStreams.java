package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,15,8,49,25,98);

		List<Integer> list2 = Arrays.asList(10,1,2);
		Stream.concat(list.stream(), list2.stream()).forEach(x->System.out.println(x));


	}

}
