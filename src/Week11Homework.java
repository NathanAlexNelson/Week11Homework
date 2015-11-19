import java.util.Arrays;
import java.util.Scanner;
public class Week11Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int Roll2;
		int bounces;
		int dices;
		int NDice;


		System.out.println("How many dice would you like to throw?");
		dices = input.nextInt();
		
		System.out.println("How many bounces did your dice make?");
		bounces = input.nextInt();
		
		Dice Roll = new Dice(bounces,dices);
		NDice = Roll.getDice();		
/*		Roll2 = Dice.OneThrow();

		
		System.out.println(Roll2);*/
		System.out.println(NDice);


		
/*		for (int N=0; N<=dices; N++){
			ArrayH [N] = Dice.HistoryD;
			System.out.printf("You rolled %i for dice %i.", ArrayH[N], N); */
//		}
	}

}
