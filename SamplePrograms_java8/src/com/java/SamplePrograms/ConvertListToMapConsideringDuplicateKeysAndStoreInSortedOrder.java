package com.java.SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapConsideringDuplicateKeysAndStoreInSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Notes> noteLst = new ArrayList<>();
	    noteLst.add(new Notes(1, "note1", 11));
	    noteLst.add(new Notes(2, "note2", 22));
	    noteLst.add(new Notes(3, "note3", 33));
	    noteLst.add(new Notes(4, "note4", 54));
	    noteLst.add(new Notes(5, "note5", 5));
	    
	    
	    Map<Integer, Integer> notesRecords = noteLst.stream()
                .sorted(Comparator
                .comparingLong(Notes::getValue)
               .reversed()) // sorting is based on TagId 55,44,33,22,11
                .collect(Collectors.toMap
                (Notes::getValue, Notes::getValue,
                (oldValue, newValue) -> oldValue,LinkedHashMap::new));
	    System.out.println("Notes : " + notesRecords);
	}
	
	
}
