import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Guess a number 1-1000");
		int x = sc.nextInt();
		int y = rand.nextInt(1001);
	
		if(x==y){
			System.out.println("Your guess is correct!!");
		}
		else if(x>y){
			System.out.println("Guess lower");
		}
		else if(x<y){
			System.out.println("Guess higher");
		}
		
	}
}
