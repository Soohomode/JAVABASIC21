
public class Practice5 {
    public static int solution(int[] height) {

        int left = 0; // 가장 왼쪽 벽 인덱스 저장
        int right = height.length - 1; // 가장 오른(끝)쪽 벽 인덱스 저장.
        // -1을 한 이유는 length는 1부터 세고, 인덱스는 0부터 세기때문
        int maxArea = 0; // 가장 큰면적을 저장 (갱신됨)

        while (left < right) { // 왼쪽부터 시작 0 - 8
            int x = (right - left); // x축(가로)에대한 계산
            int y = height[left] < height[right] ? height[left] : height[right];
            // y축(세로) 더 작은걸로 변수에 저장하여야한다 이유는 크면 넘치기 때문
            int curArea = x * y; // 현재 면적
            maxArea = maxArea > curArea ? maxArea : curArea;
            // maxArea가 방금 계산한 현재면적 curArea보다 크면 maxArea값 유지. 작으면 curArea값으로 갱신

            curArea = x * Math.min(height[left], height[right]); // 더 작은값을 뽑아서 쓴다
            maxArea = Math.max(maxArea, curArea); // 둘중에 더 큰걸 넘겨준다

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}
