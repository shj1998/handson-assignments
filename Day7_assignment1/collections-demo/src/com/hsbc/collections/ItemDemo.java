package com.hsbc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Comparator;


public class ItemDemo {
	
	
	public static void main(String[] args) {
		List<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "Laptop", 30000, 4.2));
		list.add(new Item(2, "phone", 40000, 4.1));
		list.add(new Item(3, "PC", 20000, 4.3));
		list.add(new Item(4, "Ipod", 50000, 4.4));
		
		Item item = new Item();
		
		for(Item s : list) {System.out.println(s);}
		Collections.sort(list); // this uses compareTo method of Student class 
		System.out.println("---- after sorting ----");
		for(Item s : list) {System.out.println(s);}
		System.out.println("--- after sorting ---");
		// another overloaded sort method, takes comparator object as a second parameter
		Collections.sort(list, item.new SortItemByAscendingId());
		for(Item s : list) {System.out.println(s);}
		System.out.println("--- sort by name ---");
		// another overloaded sort method, takes comparator object as a second parameter
		Collections.sort(list, item.new SortItemByNameAscending());
		for(Item s : list) {System.out.println(s);}
		System.out.println("--- sort by Price ---");
		Collections.sort(list, item.new SortItemByPriceAscending());
		for(Item s : list) {System.out.println(s);}
		System.out.println("--- sort by Rating ---");
		Collections.sort(list, item.new SortItemByRatingsAscending());
		for(Item s : list) {System.out.println(s);}
	}
}

