package main3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * メインクラス Main3。
 */

public class Main3 {
	public static void main (String[] args) throws IOException {
		System.out.println("0~100までの数字を入力してください");

		/**
	     * @param args コマンドライン引数の配列（未使用）
	     * @throws IOException 入出力エラーが発生した場合にスローされる
	     */
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader (System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		
		if (score > 100 || score < 0) {
			System.out.println("0~100の数字を入力してください");
		} else if (score >= 80) {
			System.out.println("たいへんよくできました。");
		} else if (score < 80 || score >= 60) {
			System.out.println("よくできました。");
		} else {
			System.out.println("ざんねんでした。");
		}
	}
}
