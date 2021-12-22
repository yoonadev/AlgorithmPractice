package programmers;

public class MinRectangle {
	public int solution(int[][] sizes) {
		int width = 0, height = 0;
		for(int[] size : sizes) {
			width = Math.max(width, Math.max(size[0], size[1]));	//긴 쪽
			height = Math.max(height, Math.min(size[0], size[1]));	//짧은 쪽
		}
		return width * height;
    }
}
