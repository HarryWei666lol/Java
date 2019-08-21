package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {
	private Set<Appointment> calendar;

	public Calendar(Set<Appointment> calendar) {// constructor
		this.calendar = calendar;
	}

	public boolean doesExist(Appointment apt) {// one functionality of the Calendar class 
		// whether a calendar has a particular appointment
		return this.calendar.contains(apt);
	}
	
	public boolean addApt(Appointment apt) {// another functinality of the Calender class
		this.calendar.add(apt);
		return true;
	}

	public static void main(String[] args) {
		Date date1 = new Date(7, 4, 1776, true);
		Date date2 = new Date(7, 4, 2017, true);
		Date date3 = new Date (1, 20, 2015, false);
		Time time1 = new Time(5, 30, true);
		Time time2 = new Time(13, 30, true);
		Appointment apt1 = new Appointment(date1, time1);
		Appointment apt2 = new Appointment(date2, time2);
		Appointment apt3 = new Appointment(date3, time2);
		Set<Appointment> set1 = new HashSet<Appointment>();
		set1.add(apt1);
		set1.add(apt2);
		Calendar cal1 = new Calendar(set1);
		System.out.println(cal1.doesExist(apt1));
		System.out.println(cal1.doesExist(apt3));
		cal1.addApt(apt3);
		System.out.println(cal1.doesExist(apt3));
	}

}