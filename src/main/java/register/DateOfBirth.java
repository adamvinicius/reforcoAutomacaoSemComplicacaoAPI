package register;

public class DateOfBirth {

	private int year;
	private Integer month;
	private int day;
		
	public DateOfBirth(int year, Integer month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "DateOfBirth [getYear()=" + getYear() + ", getMonth()=" + getMonth() + ", getDay()=" + getDay() + "]";
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
