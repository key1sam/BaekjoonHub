import java.util.*;
import java.io.*;

public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
	
			String[] str = br.readLine().split(" ");	// 공백 분리
			
			int repeat = Integer.valueOf(str[0]);	// String -> int
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < repeat; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
 
 
}
 