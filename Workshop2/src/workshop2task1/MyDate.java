package workshop2task1;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@SuppressWarnings("unused")

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	protected long elapsedTime;
	
	public MyDate() {
		
		GregorianCalendar currentDate=new GregorianCalendar();
		
		day=currentDate.get(GregorianCalendar.DAY_OF_MONTH);
		
		month=currentDate.get(GregorianCalendar.MONTH)+1;
		
		year=currentDate.get(GregorianCalendar.YEAR);
	
	};
	
	public MyDate(long elapsed) {
		
		this.elapsedTime=elapsed;
		
		GregorianCalendar ComparisonDate=new GregorianCalendar(1970,0,1);
	
		long DateInMillis=ComparisonDate.getTimeInMillis()+elapsed;
	
		setDate(DateInMillis);
	
	};
	
	public MyDate(int year, int month, int day) {
		
		this.year=year;
		
		this.month=month;
		
		this.day=day;
	};
	
	public int getYear() {
		
		return this.year;
		
	};
	
	public int getMonth() {
		
		return this.month;
		
	};
	
	public int getDay(){
		
		return this.day;
		
	}	
	
public long getelapsedtime(){
		
		return this.elapsedTime;
		
	}	

	
	public void setDate(long elapsedTime) {
		
		GregorianCalendar newDate=new GregorianCalendar();
	
		newDate.setTimeInMillis(elapsedTime);
	
		this.year=newDate.get(GregorianCalendar.YEAR);
		
		this.month=newDate.get(GregorianCalendar.MONTH);
		
		this.day=newDate.get(GregorianCalendar.DAY_OF_MONTH);
	
	}
	
	public String toString() {
	
		return  getYear()+"-"+getMonth()+"-"+getDay();

	}
	
	}

