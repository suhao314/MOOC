import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
       	int num = in.nextInt();
       	String py[]= {" ling"," yi"," er"," san"," si"," wu"," liu"," qi"," ba"," jiu"};
       	String py2[]= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
       	String py3[]= {"ling ","yi ","er ","san ","si " ,"wu ","liu ","qi ","ba ","jiu "};
       	Stack<String> s = new Stack<String>();
       	if(num<0) {
       		System.out.print("fu");
       		num = num * (-1);
       		while(num > 0) {
       			int digit = num % 10;
       			num = num / 10;
       			s.push(py[digit]);
       		}
       	}
       	else if(num == 0)System.out.println("ling");
       	else {
       		int digit0 = num % 10;
       		num /= 10;
       		s.push(py2[digit0]);
       		while(num > 0) {
       			int digit = num % 10;
       			num = num / 10;
       			s.push(py3[digit]);
       		}
       	}
       	while(!s.empty()) {
       		System.out.print(s.pop());
       	}
	}
}