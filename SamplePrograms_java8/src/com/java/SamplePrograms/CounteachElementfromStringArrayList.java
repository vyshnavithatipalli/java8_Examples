package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CounteachElementfromStringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		 Map<String, Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
	System.out.println(map);
	}

}
