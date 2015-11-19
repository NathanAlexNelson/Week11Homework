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
for (int A=1; A <= dices; A++) {
for (int Y=1; Y <= bounces; Y++){
X = 1 + (int) (Math.random() * 6);
Total = Total + X;
}
average = Total/bounces;
Value = Total;
}
}

public int getDice(){
return Value;
//return []HistoryD;
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
HistoryD = new int[bounces];
for (int i = 0; i <= bounces; i++){
Roll.Throw(bounces, dices);
total = Roll.Value();
sum = sum + total;
HistoryD[i] = total;
}
average = sum/bounces;
Value = total;
}

public int[] HistD(){
return HistoryD;
}

public int Value(){
		return Value;
	}
}