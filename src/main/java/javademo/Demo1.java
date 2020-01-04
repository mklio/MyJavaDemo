package javademo;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
//		System.out.println("out");
//		System.err.println("err");
//		
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		System.out.println(s.length());
		
//		PrintStream ps_old = System.out;
//		PrintStream ps_new = null;
//		try {
//			ps_new = new PrintStream("D:\\test\\Demo1.log");
//		} catch(Exception e) {
//			System.out.println(e);
//		}
//		System.setOut(ps_new);
//		System.out.println("log");
//		System.setOut(ps_old);
//		System.out.println("log print finish!");
		
//		System.out.println("abc" + (123 + 567));
		
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		char[] c = s.toCharArray();
//		System.out.println(new String(c));
//		for(int i = 0; i < c.length;i++) {
//			c[i] = (char)(c[i] ^ 2000);
//		}
//		System.out.println(new String(c));

		double d1 = 1.1,d2 = 2,d3 = d2 - d1;
		System.out.println(d3);
		
		BigDecimal b1 = new BigDecimal(1.1),b2 = new BigDecimal(2),b3 = b2.subtract(b1);
		System.out.println(b3);
		System.out.println(b3.doubleValue());
		System.out.println(b3.floatValue());
		
	}

}