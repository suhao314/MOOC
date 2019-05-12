import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
       	int num = in.nextInt();
       	int digit;
       	int sum=0;
       	int count=1;
       	while(num>0) {
       		digit = num%10;
       		num/=10;
       		if(count % 2 == digit % 2) {
       			sum += Math.pow(2, count-1);
       		}
       		count++;
       	}
       	System.out.println(sum);
	}
}