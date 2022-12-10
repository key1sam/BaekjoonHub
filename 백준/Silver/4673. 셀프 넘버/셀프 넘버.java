// 어떤 수의 생성자는 어떤 수보다 항상 작다. 즉, 함수를 통과하고 나온 어떤 수가 10000보다 작거나 같아야한다.

public class Main {
 
	public static void main(String[] args) {
 
		boolean[] check = new boolean[10001];	// 1부터 10000이므로
 
		for (int i = 1; i < 10001; i++){
			int n = d(i);
			if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
 
	public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
    
		return sum;
	}
} 