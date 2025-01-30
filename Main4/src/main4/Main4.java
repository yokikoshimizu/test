package main4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4 {
	public static void main (String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader (System.in));
		
		String[][] data = new String[3][3];
		
		int totalshortage = 0; //全体の不足額
		
		for (int i = 0; i < 3; i++) {
			System.out.println("商品を入力してください。");
			data[i][0] = br.readLine(); //商品
			
			System.out.println("単価を入力してください。");
			data[i][1] = br.readLine(); //単価
			int price = Integer.parseInt(data[i][1]);
			
			System.out.println("支払金額を入力してください。");
			data[i][2] = br.readLine(); //支払金額
			int charge = Integer.parseInt(data[i][2]);
			
			if (price > charge) {
				
				int shortage = price - charge;
				totalshortage += shortage;
				
				System.out.println(data[i][0] + "、" + price + "円、支払金額不足、" + shortage + "円" );
				
			}
			else {
				System.out.println(data[i][0] + "、" + price + "円、支払金額過不足無し");
			}
		}
		System.out.println("全体の不足金：" + totalshortage + "円");
	}
}
