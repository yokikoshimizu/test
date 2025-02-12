package main5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		List<Integer> ages = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("年齢を入力してください");
			int age = scanner.nextInt();
			ages.add(age);
		}
		
		scanner.close();
		
		List<Integer> over20ages = new ArrayList<>();
		
		for (int age : ages) {
			if (age >= 20) {
				over20ages.add(age);
			}
		}
		
		if (!over20ages.isEmpty()) {
			for (int age : ages) {
				System.out.println(age + "才");
			}
		}
		else {
			System.out.println("20歳以上は存在しません");
		}
		
	}
}