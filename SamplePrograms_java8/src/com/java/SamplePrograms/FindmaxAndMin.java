package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;

public class FindmaxAndMin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 12, 3, 4, 5, 16, 7);
		int max=list.stream().max(Integer::compare).get();
		int min=list.stream().min(Integer::compare).get();
		System.out.println(max +"  "+ min);
		
	}
}
