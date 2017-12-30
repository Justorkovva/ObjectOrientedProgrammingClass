package Class02;

public class Ex2_DayOfWeek {
	private int day;
	
	public Ex2_DayOfWeek() {
		this.day=0;}
	
	public Ex2_DayOfWeek(int d) {
		this.day=d;}
	
	public void setDay(int d) {this.day = d % 7; }
	
	public int getDay() {return this.day;}
	
	public void nextDay() 
	{
		if(this.day<6) 
			this.day++;
		
		else
			this.day=0;
	}
	
	public void previousDay() 
	{
		if(this.day>0) 
			this.day--;
		
		else
			this.day=6;
	}
	@Override
	public String toString() {
		String _day=" ";
		switch(this.day) {
		case 0: 
			_day= "It's Monday";
			break;
		case 1: 
			_day= "It's Tuesday";
			break;
		case 2:
			_day= "It's Wednesday";
			break;
		case 3:
			_day= "It's Thursday";
			break;
		case 4:
			_day= "It's Friday Hurray";
			break;
		case 5:
			_day= "It's Saturday";
			break;
		case 6:
			_day= "It's Sunday";
			break;
		}
		return _day;
	}
}
