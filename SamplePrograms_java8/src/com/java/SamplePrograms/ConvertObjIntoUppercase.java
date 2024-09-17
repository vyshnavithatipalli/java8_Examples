package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertObjIntoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("hi","hrllo","how are you");
		 List<String> nameLst = names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());
System.out.println(nameLst);

	}

}
