import java.util.Scanner;
public class Main{
	static Scanner in = new Scanner(System.in);
	public static boolean isTargetStr(String s) {
		String[] start = s.split(",");
		if(start[0].contentEquals("$GPRMC"))
			return true;
		else return false;
	}
	
	public static boolean test(String s) {
		int loc = s.indexOf('*');
		String jiaoyan = s.substring(loc + 1);
		//将GPS信号中的校验码按16进制解释为1nt类型
		int jiaoyan_10 = Integer.parseInt(jiaoyan, 16);
		//System.out.println(jiaoyan_10);
		int jiaoyan_ = (int)s.charAt(1);
		//计算校验码
		for(int i = 2; i < loc; i++) {
			jiaoyan_ = jiaoyan_ ^ (int)s.charAt(i);
			jiaoyan_ = jiaoyan_% 65536;
		}
		//System.out.print(jiaoyan_);
		if(jiaoyan_ == jiaoyan_10)
			return true;
		else return false;
	}
	
	public static boolean located(String s) {
		String[] strList = s.split(",");
		if(strList[2].contentEquals("A"))
			return true;
		else return false;
	}
	
	public static void toBJTime(String s, String[] time) {
		String[] strList = s.split(",");
		String utcTime = strList[1];
		//String BJTime = new String();
		double utctime = Double.parseDouble(utcTime);
		int utctimei = (int)utctime;
		int bjtime = utctimei + 80000;
		String bjtimes = bjtime + "";
		time[0] = bjtimes.substring(0, 2);
		time[1] = bjtimes.substring(2, 4);
		time[2] = bjtimes.substring(4, 6);
	}
	
	public static void outputTime(String[] time) {
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		int second = Integer.parseInt(time[2]);
		if(hour >= 24) {
			hour = hour % 24;
		}
		if(hour < 10) {
			System.out.print("0" + hour);
		}
		else System.out.print(hour);
		
		if(minute < 10) {
			System.out.print(":0" + minute);
		}
		else System.out.print(":" + minute);
		
		if(second < 10) {
			System.out.print(":0" + second);
		}
		else System.out.print(":" + second);
	}
	public static void main(String[] args) {
		
		String[] time = new String[3];
		String s = in.nextLine();
		while(!s.contentEquals("END")) {
			if(isTargetStr(s)) {
				if(located(s) && test(s)) {
					toBJTime(s, time);
					
				}
			}
			s = in.nextLine();
		}
		outputTime(time);
	}
	
}