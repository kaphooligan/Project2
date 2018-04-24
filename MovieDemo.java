import java.util.Scanner;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Movie [] MovieArray = new Movie[10];
		int numberOfMovies = 0;
		int option;
		
		do {
			System.out.println("Press 1 to add a Movie");
			System.out.println("Press 2 to look at all the existing Movies");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); 
			
			if(option == 1) {
				System.out.println("What is the name of the movie?");
				String movieName = keyboard.nextLine();
				System.out.println("Who is the director?");
				String directorName = keyboard.nextLine();
				System.out.println("What year was this movie released?");
				int yearReleased = keyboard.nextInt();
				
				Movie currentMovie = new Movie();
				currentMovie.setName(movieName);
				currentMovie.setYearRealeased(yearReleased);
				currentMovie.setDirector(directorName);
				if(numberOfMovies < MovieArray.length) {
					
					boolean duplicate = false;
					int index = 0;
					while(!duplicate && index < numberOfMovies) {
						if(MovieArray[index].equals(currentMovie)) {
							duplicate = true;
						}
						
						index++;
					}
					
					if(!duplicate) {
						MovieArray[numberOfMovies] = currentMovie;
						numberOfMovies++;
					}
					else {
						System.out.println("This movie already exists");
					}
				}
				else {
					System.out.println("There is no more room for additional movies");
				}
			}
			else if(option == 2) {
				for(int index = 0; index < numberOfMovies; index++) {
					System.out.println("Name: " +  MovieArray[index].getName());
					System.out.println("Director: " + MovieArray[index].getDirector());
					System.out.println("Year Released: " + MovieArray[index].getYearReleased());
				}
			}
			else if(option == 3) {
				System.out.println("Goodbye");
			}
			else {
				System.out.println("ERROR");
			}
			
		}while(option != 3);
		
	}

}
