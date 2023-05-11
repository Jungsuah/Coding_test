package practice_230512_p01;

//num1	num2	result
//3	2	1
//10	5	0

//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
    
    public static void main(String[] args) {
    	int num1 = 3;
    	int num2 = 2;
		int result = new Solution().solution(num1, num2);
		System.out.println(result);
	}
}
