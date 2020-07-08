package com.in28minutes.generics;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.in28minutes.generics.MyCustomList;

public class GenericsRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	
	static Number sumOfNumberList(List <? extends Number> numbers) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());
		
		LinkedList<Integer numbers = new LinkedList<>(
				List.of(1,2,3));
		duplicate(numbers);
		System.out.println()
		
		MyCustomList<Long> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		Long value = list.get(0);
		
		
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);
		System.out.println(list2);

	}

}
