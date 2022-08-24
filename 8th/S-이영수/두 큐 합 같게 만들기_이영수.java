import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0;
        long sum2 = 0;
        
        Deque<Integer> que1 = new LinkedList<>();
        Deque<Integer> que2 = new LinkedList<>();
        
        for(int q1: queue1) {
            que1.offer(q1);
            sum1 += q1;
        }
        
        for(int q2: queue2) {
            que2.offer(q2);
            sum2 += q2;
        }
        
        if((sum1+sum2)%2!=0) return -1;
        
        for(int i=0; i<=300000; ++i) {
            
            if(que1.size()==0 || que2.size()==0) {
                answer = -1;
                break;
            }
            
            if(sum1<sum2) {
                int num = que2.poll();
                que1.offer(num);
                sum2-=num;
                sum1+=num;
                answer++;
            }else if(sum1>sum2){
                int num = que1.poll();
                que2.offer(num);
                sum1-=num;
                sum2+=num;
                answer++;
            }else
                break;
        
        }
        
        return answer>300000? -1:answer;
    }
}