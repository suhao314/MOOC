import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
       	int prime[] = new int[201];
       	prime[0]=-1;
       	prime[1] = 2;
       	prime[2] = 3;
       	for(int i=4,count =3;count<=200;i++) {
       		boolean isPrime = true;
       		for(int j = (int) Math.sqrt(i);j<i;j++) {
       			if(i%j == 0) {isPrime = false;
       				break;
       			}
       		}
       		if(isPrime) {prime[count] = i;
       		count++;}
       	}
       	//for(int e:prime)System.out.print(e+" ");
       	int start = in.nextInt();
       	int end = in.nextInt();
       	int sum = 0;
       	for(int i=start;i<=end;i++) {
       		sum += prime[i];
       	}
       	System.out.println(sum);
	}
}