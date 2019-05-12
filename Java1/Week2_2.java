import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
       	int rs = in.nextInt();
       	String R[] = {" ", ", unreadable.", ", barely readable, occasional words distinguishable.", ", readable with considerable difficulty.", ", readable with practically no difficulty.", ", perfectly readable."};
       	String S[] = {" ", "Faint signals, barely perceptible","Very weak signals","Weak signals","Fair signals","Fairly good signals","Good signals","Moderately strong signals","Strong signals","Extremely strong signals"};
       	System.out.println(S[rs%10] + R[rs/10]);
	}
}