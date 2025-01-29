package main3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main3{
	public static void main (String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("整数 x を入力してください:");
		String strx = br.readLine();
		int x = Integer.parseInt(strx);
		
		System.out.println("整数 y を入力してください:");
		String stry = br.readLine();
		int y = Integer.parseInt(stry);
		
		if (x < y && x % 2 == 0 && y % 2 == 0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		}
		if (x == y && x < 0) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		}
		if (x < y || x % 2 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}
		
	}
}