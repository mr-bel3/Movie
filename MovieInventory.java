import java.util.Scanner;
public class MovieInventory
{

	public static void main(String[] args) 
	{	
		Scanner myScan = new Scanner(System.in);
		Movie movies[] = new Movie[5];

		for(int i=0; i < 5; i++)
		{
			movies[i] = new Movie("","",0,0);
		}

		for( int i = 0; i < 5; i++)
		{
			System.out.println("Name of the movie:");
			String titleTemp = myScan.nextLine();
			//System.out.println(titleTemp);
			//System.out.println(movies[i].getTitle());
			movies[i].setTitle(titleTemp);

			System.out.println("Director of the movie:");
			String directorTemp = myScan.nextLine();
			movies[i].setDirector(directorTemp);

			System.out.println("length of the movie:");
			int runningTime = Integer.parseInt(myScan.nextLine());
			movies[i].setRunningTime(runningTime);

			System.out.println("Year of release of the movie:");
			int yearOfRelease = Integer.parseInt(myScan.nextLine());
			movies[i].setYearOfRelease(yearOfRelease);

		}

		/*for (int i = 0 ;i < 5 ;i++ )
		{
			System.out.println(movies[i].toString());
		}*/
		int x = 1;
		while( x != 0)
		{
			System.out.println("1) Display all the movies in inventory (whether rented or not) \n2) Rent a movie \n3) Display all the movies currently rented and their due days \n4) Display all the movies currently in the store (not out on rental) \n5) Quit");

			int option = Integer.parseInt(myScan.nextLine());

			switch(option)
			{
			case 1:
				for (int i = 0 ;i < 5 ;i++ )
				{
					System.out.println(movies[i].toString());
				}
				break;

			case 2:
				System.out.println("Enter the name of the movie");
				String nameOfTheMovie = myScan.nextLine();

				System.out.println("Enter the due day");
				String dueDay = myScan.nextLine();
				for (int i = 0; i < 5 ; i++)
				{
					if (movies[i].getTitle().equals(nameOfTheMovie))
					{
						
						movies[i].setRentMovie(true);
						movies[i].setDueDay(dueDay);
					}

				}
				break;

			case 3:
				for (int i = 0; i < 5 ; i++)
				{
					if (movies[i].getRentMpvie() == true)
					{
						System.out.println(movies[i].toString());
					}

				}
				break;

			case 4:
				for (int i = 0; i < 5 ; i++)
				{
					if (movies[i].getRentMpvie() == false)
					{
						System.out.println(movies[i].toString());
					}
				}
				break;

			case 5:
				x = 0;
				break;

			default:
				System.out.println("Not an option try again");
			}
		}



	}

}
