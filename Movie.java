import java.text.DecimalFormat;


public class Movie 
{
	private String title; 
	private String director;
	private int runningTime; //store this in minutes
	private int yearOfRelease;
	private boolean rentMovie = false;
	private String dueDay = "";
	
	

	public Movie (String t, String d, int rT, int yOR)
	{
		title = t;
		director = d;

		if (rT > 0)
		{
			runningTime = rT;
		}
		else
		{
			runningTime = 120;
		}

		if (yOR > 1900)
		{
			yearOfRelease = yOR;
		}
		else 
		{
			yearOfRelease = 2015;
		}
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	public String getTitle()
	{
		return title;
	}
	
	
	public String getDirector()
	{
		return director;
	}
	public void setDirector(String d)
	{
		director = d;
	}
	
	public int getRunningTime()
	{
		return runningTime;
	}
	public void setRunningTime(int rT )
	{
		runningTime = rT;
	}
	
	public int getYearOfRelease()
	{
		return yearOfRelease;
	}
	public void setYearOfRelease(int yOR)
	{
		yearOfRelease = yOR;
	}
	
	
	public void setRentMovie(boolean rM)
	{
		rentMovie = rM;
	}
	public boolean getRentMpvie()
	{
		return rentMovie;
	}
	
	public void setDueDay(String day)
	{
		dueDay = day;
	}
	
	public String toString() //Film Title: Avatar, Director: James Cameron, Running Time: 2:42, Year of Release: 2009
	{
		DecimalFormat minutes = new DecimalFormat("00");
		
		int hrs = runningTime / 60;
		int mins = runningTime - (hrs * 60);

		return "Film Title: " + title + ", " + "Director: " + director + ", " + "Running Time: " + hrs + ":" + minutes.format(mins) 
				+ ", " + "Year of Release: " + yearOfRelease + ", " + "Rent Status: " + rentMovie + ", " + "Due Day: " + dueDay;
	}
	
}
