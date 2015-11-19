import java.util.Arrays;
public class Dice {
private int Value, average;
private int [] HistoryD;
public Dice(){
}

private static int OneThrow;
public static int OneThrow(){
OneThrow = 1 + (int) (Math.random() * 6);
return OneThrow;
}



public void Throw(int bounces, int dices){
int X = 0;
int Total = 0;
int [] History = new int [dices];
HistoryD = new int [dices];
int [] BounceH = new int [dices];
for (int A=1; A <= dices; A++) {
for (int Y=1; Y <= bounces; Y++){
X = 1 + (int) (Math.random() * 6);
Total = Total + X;
BounceH[Y] = X;
}
average = Total/bounces;
Value = Total;
History[A] = X;
HistoryD[A] = History[A];
}
System.out.println(Arrays.asList(HistoryD));
}

public int getDice(){
return Value;
}

/* public void Throw(int bounces){
int X = 0;
int Total = 0;
for (int Y=0; Y <= bounces; Y++){
X = 1 + (int) (Math.random() * 6);
Total = Total + X;
}
average = Total/bounces;
Value = Total;
} */

public Dice (int bounces, int dices){
int total = 0, sum = 0;
Dice Roll = new Dice();
for (int i = 0; i <= bounces; i++){
Roll.Throw(bounces, dices);
total = Roll.Value();
sum = sum + total;
}
average = sum/bounces;
Value = total;
}

public int Value(){
		return Value;
	}
}