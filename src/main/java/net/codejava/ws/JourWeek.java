package net.codejava.ws;
//this class represents the different days of the week as well as the time at which each cinematographic screening
public class JourWeek {

	public int hour; //start time
	public int min;
	public String d;//days of week
	
	public JourWeek() 
	{
		
	}
	public JourWeek(int hour, int min,String d) {
		this.hour = hour;
		this.min = min;
		this.d = d;
	}
	public JourWeek(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public String getDaysOfweek() {
		return d;
	}
	public void setDaysOfweek(String d) {
		this.d = d;
	}
}