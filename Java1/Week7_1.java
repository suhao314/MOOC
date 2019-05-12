import java.util.Scanner;

public class Main{
	static int minF = 0;
	static boolean isPrime(int n) {
		boolean isPrime_ = true;
		if(n == 2 || n == 3)return true;
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n% i==0) {
				minF=i;
				isPrime_=false;
				break;
			}
		}
		return isPrime_;
	}
	public static int getF(int n, int f) {
		return n/f;
	}
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if(isPrime(n)) {
			System.out.print(n + "=" + n);
		}
		else {
			System.out.print(n+"="+minF);
			
			while( (n = getF(n, minF)) != 0) {
				if(isPrime(n)) {
					System.out.println("x"+n);
					break;
				}
				System.out.print("x" + minF);
			}
		}
	}
}