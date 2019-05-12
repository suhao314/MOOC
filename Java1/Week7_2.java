import java.util.Scanner;

public class Main{
	static boolean isComplete(int n) {
		if(n==1)return false;
		int sum = 1;
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n)return true;
		else return false;
	}
	public static void main(String[] args) {
		int m,n;
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		boolean exist = false;
		for(int i = m; i <= n; i++) {
			if(isComplete(i)) {
				if(!exist) {
					System.out.print(i);
					exist = true;
				}
				else {
					System.out.print(" " + i);
				}
			}
		}
		if(!exist)
			System.out.println();
	}
}