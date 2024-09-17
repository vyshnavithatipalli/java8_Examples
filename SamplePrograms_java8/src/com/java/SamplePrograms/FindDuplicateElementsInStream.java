package com.java.SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateElementsInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=Arrays.asList(1,2,1,3,1,2,5,6);

System.out.println(findDuplicates(list.stream()));

		
	}
	public static Set<Integer> findDuplicates(Stream<Integer> list) {
		HashSet<Integer> set=new HashSet<Integer>();
		return list.filter(val->!set.add(val)).collect(Collectors.toSet());
		
	}

}
