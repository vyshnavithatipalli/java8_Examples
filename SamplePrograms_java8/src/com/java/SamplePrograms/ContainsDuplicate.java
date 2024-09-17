package com.java.SamplePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,15,8,49,25,98);
		HashSet<Integer> set=new HashSet<Integer>();
list.stream().forEach(i->set.add(i));
System.out.println(set);

if(list.size()==set.size()) {
	System.out.println(false);
}
else
	System.out.println(true);
	}

}
