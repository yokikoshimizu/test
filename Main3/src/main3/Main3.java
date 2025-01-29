package main3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("0~100を入力してください");
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		
		if (score > 100 || score < 0)
		{
			System.out.println("0～100の範囲で入力してください");
		}
		else if (score >= 80)
		{
			System.out.println("優");
		}
		else if (score >= 70 || score < 80)
		{
			System.out.println("良");
		}
		else if (score >= 60 || score < 70)
		{
			System.out.println("可");
		}
		else
		{
			System.out.println("不可");
		}
	}
}