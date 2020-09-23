package com.hsbc.collections;

import java.util.Comparator;

public class Item implements Comparable<Item>{

	private int itemId;
	private String name;
	private double price;
	private double ratings;
	
	public class SortItemByRatingsAscending implements Comparator<Item>{
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (int)o2.getRatings() - (int)o1.getRatings(); // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	
	
	public class SortItemByRatingsDescending implements Comparator<Item>{
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (int)o1.getRatings() - (int)o2.getRatings(); // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	
	public class SortItemByPriceAscending implements Comparator<Item>{
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (int)o2.getPrice() - (int)o1.getPrice(); // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	
	public class SortItemByPriceDescending implements Comparator<Item>{
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return (int)o1.getPrice() - (int)o2.getPrice(); // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	
	public class SortItemByNameAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
			
		}

	}
	
	public class SortItemByNameDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o2.getName().compareTo(o1.getName());
			
		}

	}
	
	public class SortItemByAscendingId implements Comparator<Item> {

		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o1.getItemId() - o2.getItemId(); // 5 - 4 = +ve, 4 - 5 = -ve
		}

	}
	
	
	public class SortItemByDescendingId implements Comparator<Item> {

		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o2.getItemId() - o1.getItemId(); // 5 - 4 = +ve, 4 - 5 = -ve
		}

	}
	
	
	public Item(int itemId, String name, int price, double ratings) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		return true;
	}

	@Override
	public int compareTo(Item o) {
		return (this.itemId - o.getItemId());
	}
	
	
}
