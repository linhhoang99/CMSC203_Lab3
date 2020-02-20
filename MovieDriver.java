import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		//declare a variable for user choice
		char choice;
		//Create a Scanner object
		Scanner input = new Scanner (System.in);
		//Create a Movie object
		Movie movie1 = new Movie();
		//a loop repeats while the user choose to continue
		do
		{
			// Prompt user to enter movie name
			System.out.println("Please enter a movie name: ");
			//Read the line that user types and set tittle
			movie1.setTitle(input.nextLine());
			//Promt the user to enter the movie's rating
			System.out.println("Please enter the movie rating: ");
			//Read the line that user type and set rating
			movie1.setRating(input.nextLine());
			//Promt the user to enter the sold ticket
			System.out.println("Please enter the ticket sold for this movie: ");
			//Reade the line that user type and set the number of ticket sold
			movie1.setSoldTickets(input.nextInt());
			//Print out the information
			System.out.println(movie1.toString());
		
			//Ask the user if they want to continue
			System.out.println("Do you want to enter another movie? (y/n) ");
			System.out.println("Answer: ");
			//Read the answer
			choice = input.next().charAt(0);
			input.nextLine();
		}
		while (choice == 'y' || choice == 'Y') ;
		//end program
		System.out.println("Goodbye");
		input.close();
		System.exit(0);
	}

}
