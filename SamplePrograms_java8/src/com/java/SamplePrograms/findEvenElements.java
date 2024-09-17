package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		
List<Integer> result=list.stream().filter(val->val%2==0).collect(Collectors.toList());
System.out.println(result);
	}

}
