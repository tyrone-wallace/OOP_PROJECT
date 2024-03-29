/**
 * Written By :
 * Tyrone Wallace - 1706903
 * Shantia Lewis -
 */
package car4rent;

public class Date {
	
//States/ Attributes
	private int day;
	private int month;
	private int year;
	
//Constructors
	//Primary Constructor	
	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//Default Constructors
	public Date() {

		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}

//Getters and Setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}// end of Date class
