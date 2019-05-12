import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		String str = new String();
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
//		System.out.println(str);
		String[] list = str.split(" ");
		//    if(list[0].length()==0)System.out.print(0);
		for(int i = 0; i<list.length; i++) {
			if(list[i].length()!=0) {
				if(i != list.length-1)
					System.out.print(list[i].length() + " ");
				else 
					System.out.print(list[i].length()-1);
			}
			
		}
	}
}