package com.java.SamplePrograms;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java articles are Awesome";
		Character res=input.chars()
		.mapToObj(x->Character.toLowerCase(Character.valueOf((char)x)))
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
.entrySet().stream().filter(x->x.getValue()>1L).map(x->x.getKey()).findFirst().get();
		System.out.println(res);
	}

}
