package net.codejava.ws;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//this class represents the weekly schedule of each film screening
public class Programes {
   
	public String str1;
	public String str2 ;
	public Date datDeb;
	public Date datFin;
	public ArrayList<JourWeek> dayListS  = new ArrayList<JourWeek>();
	
	
	public Programes(Date datDeb, Date datFin, ArrayList<JourWeek> dayListS, String s1, String s2) {
		super();
		this.datDeb = datDeb;
		this.datFin = datFin;
		this.dayListS = dayListS;
		this.str1 = s1;
		this.str2 = s2;
	}

	public Programes(Date datDeb,Date datFin, ArrayList<JourWeek> dayListS) {
		
		this.datDeb = datDeb;
		this.datFin = datFin;
		this.dayListS = dayListS;
	}

	public String getDateString1() {
		return str1;
	}

	public void setDateString1(String s1) {
		str1 = s1;
	}

	public String getDateString2() {
		return str2;
	}

	public void setDateString2(String s2) {
		str2 = s2;
	}

	public Date getDatDeb() {
		return datDeb;
	}

	public void setDatDeb(Date datDeb) {
		this.datDeb = datDeb;
	}

	public Date getDatFin() {
		return datFin;
	}

	public void setDatFin(Date datFin) {
		this.datFin = datFin;
	}

	public Programes() 
	{
		
	}

	public ArrayList<JourWeek> getDayListS() {
		return dayListS;
	}

	public void setDayListS(ArrayList<JourWeek> dayListS) {
		this.dayListS = dayListS;
	}
}
