import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
       	//偶数，奇数
       	int result[] = {0, 0};
       	int a;
       	a = in.nextInt();
       	while(a != -1) {
       		result[a%2]++;
       		a = in.nextInt();
       	}
       	System.out.print(result[1] +" "+ result[0]);
	}
}