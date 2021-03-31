package application;
import java.util.Scanner;
public class Ratio {

	public static void main(String[] args) {
		double fpop = 1;
		double mpop = 1;
		double divisionratio;
		double ratio;
		Scanner input = new Scanner(System.in);
		System.out.println("1st 4 ages group starts on those who are 0 to 4 years old");
		System.out.println("The 21th and last 4 ages group starts on those who are 100 years old");
		System.out.println("========================================================================");
		System.out.println(" ");
		System.out.println("Do you wish to divide total female population by total male population?(y/n)");
		char choose = input.next().charAt(0);
		
		if(choose == 'y') {
			System.out.println("Enter total female population: ");
			fpop = input.nextInt();
			System.out.println("Enter total male population: ");
			mpop = input.nextInt();
			divisionratio = fpop / mpop;
			ratio = divisionratio * 1000;
			System.out.println(" ");
			System.out.println("There is "+String.format("%.2f",ratio)+" women for each 1000 men");
		}
		else if(choose == 'n'){
			
		for(int i = 1;i<22;i++) {
			System.out.println("Enter population of women on the 4 ages group number # "+i);
			fpop = input.nextInt();
			fpop = fpop++;
		}
		for(int b = 1;b<22;b++) {
			System.out.println("Enter population of men on the 4 ages group number # "+b);
			mpop = input.nextInt();
			mpop = mpop++;
			
		}
		
		divisionratio = fpop / mpop;
		 ratio = divisionratio * 1000;
		
		System.out.println(" ");
		System.out.println("There is a population of "+ratio+" women for each 1000 men");

		}
		else {
			System.out.println("Invalid input!");
		}
		
		while(choose !='x') {
			
			System.out.println("1st 4 ages group starts on those who are 0 to 4 years old");
			System.out.println("The 21th and last 4 ages group starts on those who are 100 years old");
			System.out.println("========================================================================");
			System.out.println(" ");
			System.out.println("Do you wish to divide total female population by total male population?(y/n)");
			choose = input.next().charAt(0);
			
			if(choose == 'y') {
				System.out.println("Enter total female population: ");
				fpop = input.nextInt();
				System.out.println("Enter total male population: ");
				mpop = input.nextInt();
				divisionratio = fpop / mpop;
				ratio = divisionratio * 1000;
				System.out.println(" ");
				System.out.println("There is "+ratio+"women for each 1000 men");
			}
			else if(choose == 'n'){
				
			for(int i = 1;i<22;i++) {
				System.out.println("Enter population of women on the 4 ages group number # "+i);
				fpop = input.nextInt();
				fpop = fpop++;
			}
			for(int b = 1;b<22;b++) {
				System.out.println("Enter population of men on the 4 ages group number # "+b);
				mpop = input.nextInt();
				mpop = mpop++;
				
			}
			
			divisionratio = fpop / mpop;
			 ratio = divisionratio * 1000;
			
			System.out.println(" ");
			System.out.println("There is a population of "+ratio+" women for each 1000 men");

			}
			else {
				System.out.println("Invalid input!");
			}
			
		}
	}

}
