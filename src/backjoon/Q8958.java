package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //테스트 케이스
		String str;
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			int count = 0, sum = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') count++;
				else count = 0;
				sum += count;
			}
			System.out.println(sum);
		}
		//String.getBytes() 사용가능
	}
}
