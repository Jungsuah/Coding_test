package 다음에_올_숫자;

//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

//common	    result
//[1, 2, 3, 4]	5
//[2, 4, 8]	    16

public class Solution1 {//다음에 올 숫자
	public int solution(int[] common) {
		int answer = 0;
		
		if (common[1] - common[0] == common[2] - common[1]) {
			answer = common[common.length - 1] + (common[1] - common[0]);
		}else {
			answer = common[common.length - 1] * common[1] / common[0];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution(new int[] { 1, 2, 3 , 4}));
		System.out.println(s.solution(new int[] { 2, 4, 8 }));
	}
}
