package programmers;

public class Year2016 {
	public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekday = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        //당월 1일 ~ 당일까지의 날짜 합산
        int day = b;
        
        //2월 이후일 경우 1월 ~ 전월까지의 날짜 합산
        if(a > 1) {
        	for(int i = 0; i < a-1; i++) {
        		day += month[i];
        	}
        }
        
        return weekday[(day + 4) % 7];
    }
}
