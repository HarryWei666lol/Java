package studio8;

public class Appointment {
	private Date date;
	private Time time;

	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}


	public static void main(String[] args) {
		Date date1 = new Date(7, 4, 1776, true);
		Date date2 = new Date(7, 4, 2017, true);
		Time time1 = new Time(5, 30, true);
		Time time2 = new Time(13, 30, true);
		Appointment apt1 = new Appointment(date1, time1);
		Appointment apt2 = new Appointment(date2, time2);

	}

}
