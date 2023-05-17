package 연속된_수의_합;

import java.util.Arrays;

//num	total	result
//3	    12	   [3, 4, 5]
//5	    15	   [1, 2, 3, 4, 5]
//4	    14	   [2, 3, 4, 5]
//5	    5	   [-1, 0, 1, 2, 3]

//연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 
//두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return

public class Solution2 {//연속된 수의 합
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        
        while(true) {
        	int sum = 0;
        	for (int i = start; i < start + num; i++) {//시작점부터 num의 횟수만큼 더하기
				sum += i;
			}if (sum == total) {//누적된 합계와 total 값이 같으면
				for (int i = 0; i < num; i++) {//배열에 담아주기
					answer[i] = start;
					start++;//start값을 하나씩 증가해주면서 넣어주기
				}
				break;//배열에 다넣으면 break로 while문 빠져나가기
			}else if(sum < total){//만약 누적합계와 total값보다 작으면
				start++;//시작점을 증가시켜서 다시 누적합계를 생성하기
			}else {//위에 경우가 모두 아니면
				start--; //시작점을 빼주기
			}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(3, 12)));
		System.out.println(Arrays.toString(s.solution(5, 15)));
		System.out.println(Arrays.toString(s.solution(5, 5)));
	}
}
