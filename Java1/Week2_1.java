import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
       	int time = in.nextInt();
       	if(time%100==0) {
       		//0,100,200...2300
       		int hour = time / 100;
       		if(hour < 8)
       		System.out.println(16 + hour + "00");
       		else if(hour == 8) {
       			System.out.println("0");
       		}
       		else {
       			System.out.println(time - 800);
       		}
       	}
       	else {
       		if(time >= 800) {
       			System.out.println(time - 800);
       			}
       		else {
       			int hour = time / 100;
       			int minute = time - hour * 100;
       			if(hour < 8) {
       				System.out.print(16 + hour);
       				if(minute>=10)
       				System.out.println(minute);
       				else
       					System.out.print("0" + minute);
       			}
       		}
       	}
	}
}