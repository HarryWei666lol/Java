package studio8;

public class Time {
	
	private final int hour, minute;
	private final boolean is12;
	
	
	
	public Time(int hour, int minute, boolean is12) {
		this.hour = hour;
		this.minute = minute;
		this.is12 = is12;
	}

	@Override
	public String toString() {
		if (is12) {
			if (this.hour == 24) {
				return "00:" + this.minute + " AM";
			}
			else if (this.hour == 12) {
				return "12:" + this.minute + " PM";
			}
			else if (this.hour > 12) {
				int newHour = this.hour - 12;
				return newHour + ":" + this.minute + " PM";
			}
			else {
				return this.hour + ":" + this.minute + " AM";
			}
		}
		else {
			return this.hour + ":" + this.minute;
		}
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
	
	

	public static void main(String[] args) {
		Time time1 = new Time(5, 30, true);
		System.out.println(time1.toString());
		Time time2 = new Time(13, 30, true);
		System.out.println(time1.equals(time2));
		Time time3 = new Time(13, 30, false);
		System.out.println(time2.equals(time3));
	}

}
