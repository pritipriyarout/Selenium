package programs;

public class Calender {
private int MonthNumber;
public int get()
{
	return MonthNumber;
}
public void set(int MonthNumber)
{
	if(MonthNumber>=1 && MonthNumber<=12)
	{
		this.MonthNumber=MonthNumber;
	}
	else
	{
		System.out.println("invalid month number");
	}
}
}
