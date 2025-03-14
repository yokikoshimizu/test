package main3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * メインクラス Main3
 */

public class Main3 {
	public static void main (String[] args) throws IOException {
		System.out.println("0~100を入力してください");
		
		 /**
	     * @param args コマンドライン引数の配列（未使用）
	     * @throws IOException 入出力エラーが発生した場合にスローされる
	     */
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader(System.in));
		
		//ユーザーの入力を読み取る
		String str = br.readLine();
		
		//入力を整数の型に変換
		int score = Integer.parseInt(str);
		
		//入力値の判定（if文）
		if (score > 100 || score < 0) {
			System.out.println("0～100の範囲で入力してください");
		} else if (score < 60) {
			System.out.println("不合格");
		} else {
			System.out.println("合格");
		}
	}
}