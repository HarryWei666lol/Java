package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private final int month, day, year;
	private final boolean isHoliday;
	 
	
	
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}


	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		return true;
	}


	public static void main(String[] args) {
		Date date1 = new Date(7, 4, 1776, true);
		System.out.println(date1.toString());
		Date date2 = new Date(7, 4, 2017, true);
		System.out.println(date1.equals(date2));
		Date date3 = new Date(1, 2, 2015, false);
		Date date4 = new Date(1, 5, 2015, false);
		System.out.println(date3.equals(date4));
		Date date5 = new Date(11, 2, 2017, false);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(date1);
		set.add(date2);
		set.add(date3);
		set.add(date4);
		set.add(date5);
		System.out.println(set);

	}

}
