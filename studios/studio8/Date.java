package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private final int month, day, year;
	private boolean isHoliday;


	public Date(int month, int day, int year, boolean isHoliday) {

		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
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

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}



	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();
		
		Date date1 = new Date(12, 25, 2017, true);
		System.out.println(date1);
		Date date2 = new Date(12, 25, 1997, true);
		System.out.println(date1.equals(date2));// a boolean expression
		Date date3 = new Date(1, 2, 2017, true);
		Date date4 = new Date(1, 5, 2017, true);
		System.out.println(date3.equals(date4));
		Date date5 = new Date(11, 2, 2017, false);
		
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
