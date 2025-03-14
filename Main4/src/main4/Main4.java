package main4;

public class Main4 {
	
	 /**
     * プログラムのエントリーポイント。
     * 保険契約者リストを処理し、保険料および遅延利息金を表示する。
     *
     * @param args コマンドライン引数（使用しない）
     */
	
	public static void main (String[] args) 
	{
		String[] contractor = {
			"中村,5000,2000",
	        "田島,3000,",
	        "小澤,4500,",
	        "大西,6000,3500"
		};
		
		// 遅延利息金のある契約者数をカウント(初期値は0)
		int delay = 0;
		
		// 各契約者のデータを処理
		for (String contract: contractor) {
			
			// カンマ（,）でデータを分割
			String[] data = contract.split(",");
			
			// 契約者名と保険料を出力
			System.out.println("契約者名：" + data[0] + "、保険料: " + data[1] + "円");
			
			 // 遅延利息金がある場合の処理
			if (data.length > 2 && !data[2].isEmpty()) {
				System.out.println("、遅延利息金: " + data[2] + "円");
				   delay++; // 遅延利息金がある場合、カウントを増やす
				System.out.println("遅延利息金のある契約者の数：" + delay);
			} else {
				System.out.println();
			}
		}
	}
}
