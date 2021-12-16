package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
public class Q1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(hansu(num));
	}
	public static int hansu(int num) {
		int count = 0; //1~num 한수 갯수
		
		if(num < 100) return num; //1~99는 무조건 등차수열
		
		count = 99;	//num이 100이상일 때, 99까지의 한수 99개 세고 시작
		
		if(num == 1000) num = 999; //num <= 1000, 1000은 등차수열이 아니므로 예외처리
		
		for(int i = 100; i <= num; i++) {
			int n0 = i % 10; //1의 자리 숫자
			int n1 = (i / 10) % 10; //10의 자리 숫자
			int n2 = i / 100; //100의 자리 숫자
			
			if(n2 - n1 == n1 - n0) count++;
		}
		
		return count;
	}
}
