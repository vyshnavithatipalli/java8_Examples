package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;

public class FindCubeandFilterOnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2 = Arrays.asList(10,1,2,12);
list2.stream().map(x->x*x*x).filter(y->y>50).forEach(System.out::println);

	}

}
