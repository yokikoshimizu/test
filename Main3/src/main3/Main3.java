package main3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("0~100までの数字を入力してください");
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader (System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		
		if (score > 100 || score < 0) {
			System.out.println("0~100の数字を入力してください");
		}
		else if (score >= 80) {
			System.out.println("たいへんよくできました。");
		}
		else if (score < 80 || score >= 60) {
			System.out.println("よくできました。");
		}
		else {
			System.out.println("ざんねんでした。");
		}
	}
}
