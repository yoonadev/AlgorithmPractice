package programmers;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int m : d) {
        	if(budget >= m) {
        		budget -= m;
        		answer++;
        	}
        }
        return answer;
    }
}
