package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		 Map<String,Long> namesCount = names
                 .stream()
     .filter(x->Collections.frequency(names, x)>1)
     .collect(Collectors.groupingBy
     (Function.identity(), Collectors.counting()));
System.out.println(namesCount);

	}

}
