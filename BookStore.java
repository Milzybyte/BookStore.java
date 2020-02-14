import java.util.Scanner;
public class BookStore
{
	public static void main(String[] args)
	{
		//vars and constans
		float stuGpa;
		final int CREDIT = 10; 
		String name;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name >> ");
		name = keyboard.nextLine();
		
		System.out.print("What is your GPA? >> ");
		stuGpa = keyboard.nextFloat();
		
		System.out.println("Here " + name + " Credits givien! >> " + stuGpa * CREDIT);
	}
}