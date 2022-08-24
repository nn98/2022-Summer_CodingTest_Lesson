package Programmers;

import java.util.*;
import java.util.stream.Collectors;

public class P42626_3 {
	static int solution(int[] s, int K) {
		int a=0;
		PriorityQueue<Integer>t=new PriorityQueue();
		t.addAll(Arrays.stream(s).boxed().collect(Collectors.toList()));
		for(;t.peek()<=K;) {
			if(t.size()<2)return -1;
			t.offer(t.poll()+t.poll()*2);
			a++;
		}
        return a;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,9,10,12},7));
		System.out.println(solution(new int[] {1,2,3,9,10,12},5000));
	}

}
