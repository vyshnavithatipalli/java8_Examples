package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		//by default asc
		List<Integer> res=list.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
		//to change to desc
		List<Integer> descResult=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descResult);
	}

}
