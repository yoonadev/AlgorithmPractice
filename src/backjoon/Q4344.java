package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
public class Q4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int c = Integer.parseInt(br.readLine());	//테스트 케이스
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());	//학생수
			
			int[] score = new int[n];
			
			int sum = 0, avg = 0, count = 0;
			
			for(int j = 0; j < n; j ++) {
				int tmp = Integer.parseInt(st.nextToken());
				score[j] = tmp;
				sum += tmp;
			}
			
			avg = sum / n;
			
			for(int s : score) {
				if(s > avg) count++;
			}
			
			System.out.printf("%.3f%%\n", (double)count / n * 100);
		}
	}
}
