import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        TreeSet<Integer> tree = new TreeSet<>();
        
        for(int s:scoville) {
            tree.add(s);
        }
        
        while(tree.lower(K)!=null) {
            if(tree.size() == 1) {
                return -1;
            }
            
            int firstMinScoville = tree.first();
            tree.remove(firstMinScoville);
            int secondMinScoville = tree.first();
            tree.remove(secondMinScoville);

            tree.add(firstMinScoville + (secondMinScoville*2));
            answer++;
        }
        
        return answer;
    }
}