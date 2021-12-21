package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class Take2andAdd {
	public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for(Integer s : set) {
        	answer[idx] = s;
        	idx++;
        }
        Arrays.sort(answer);
        return answer;
//        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
//        HashSet 대신 TreeSet 이용시 add와 동시에 정렬
    }
}
