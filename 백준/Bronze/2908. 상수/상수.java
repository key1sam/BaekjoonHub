import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        StringBuffer sb1 = new StringBuffer(arr[0]);
        String num1 = sb1.reverse().toString();
        
        StringBuffer sb2 = new StringBuffer(arr[1]);
        String num2 = sb2.reverse().toString();
        
        if (Integer.valueOf(num1) > Integer.valueOf(num2)) {
        	System.out.print(num1);
        }
        
        else {
        	System.out.print(num2);
        }
    }
}