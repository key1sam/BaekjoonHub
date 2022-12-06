import java.io.*;

public class Main {

	public static void main(String[] args) throws  IOException {

		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
				
		int tot = Integer.parseInt(bc.readLine()); 
		int cnt = Integer.parseInt(bc.readLine());
		
		for (int i = 0; i < cnt; i++) {
	
			String[]b = bc.readLine().split(" ");
			
			int price = Integer.parseInt(b[0]);
	        int count = Integer.parseInt(b[1]);
	        
	        int total  = price * count;
			tot = tot - total;
            
	        }
			if (tot == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	
	}
}
