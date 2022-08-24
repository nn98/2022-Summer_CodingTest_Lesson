import java.util.*;

public class P42626 {
	// 문제 : 더 맵게
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville= { 1, 2, 3, 9, 10, 12 };
		System.out.println(solution(scoville, 7));
	}


	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> sco = new PriorityQueue<>();
		
		//int배열을 큐에 넣어준다
		for(int i : scoville) {
			sco.add(i);
		}
		
		int answer = 0;
		while(sco.peek() < K) {
			if (sco.size() == 1) {
                			return -1;
			}
			
			int first = sco.poll();
		            int second = sco.poll(); 
	
		            int result = first + (second * 2);
           			pq.add(result);
	           		answer++;
		}
		return answer;
	}
}