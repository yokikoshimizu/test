package main4;

public class Main4 {
	public static void main (String[] args) 
	{
		String[] contractor = {
			"中村,5000,2000",
	        "田島,3000,",
	        "小澤,4500,",
	        "大西,6000,3500"
		};
		
		int delay = 0;
		
		for (String contract: contractor) {
			String[] data = contract.split(",");
			System.out.println("契約者名：" + data[0] + "、保険料: " + data[1] + "円");
			
			if (data.length > 2 && !data[2].isEmpty()) {
				System.out.println("、遅延利息金: " + data[2] + "円");
				   delay++;
			} else {
				System.out.println();
			}
		}
	}
}
