import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a phrase:");
	String phrase = sc.nextLine();
	int [] x = new int[phrase.length()];
	int d = 0;
	int e = 1;
	int c;
	for(c = 0; c < x.length; c++){
		x[c] = phrase.indexOf(d, e);
		d++;
		e++;
	}
	for(c = phrase.length(); c > -1; c--){
		System.out.println(x[c]);

	}
	}
}
