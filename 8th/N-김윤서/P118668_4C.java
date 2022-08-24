package Programmers;

import java.util.Arrays;

public class P118668_4C {
	static int 최대알고,최대코딩,문제리스트[][],기록[][];
	static int 완전탐색(int 알고력, int 코딩력) {
		if(알고력>=최대알고&코딩력>=최대코딩)return 0;
		알고력=Math.min(알고력, 최대알고);
		코딩력=Math.min(코딩력, 최대코딩);
		if(기록[알고력][코딩력]>=0)return 기록[알고력][코딩력];
		int 시간=Integer.MAX_VALUE;
		if(알고력<최대알고)시간=Math.min(1+완전탐색(알고력+1,코딩력), 시간);
		if(코딩력<최대코딩)시간=Math.min(1+완전탐색(알고력,코딩력+1), 시간);
		for(int[]문제:문제리스트)if(문제[0]<=알고력&문제[1]<=코딩력)if((알고력>=최대알고&&문제[3]==0)|(코딩력>=최대코딩&&문제[2]==0))continue;
		else 시간=Math.min(문제[4]+완전탐색(알고력+문제[2],코딩력+문제[3]),시간);
		return 기록[알고력][코딩력]=시간;
	}
	static int solution(int 알고력, int 코딩력, int[][]문제들) {
		최대알고=0;
		최대코딩=0;
		문제리스트=문제들;
		for(int[]문제:문제리스트) {
			최대알고=최대알고>문제[0]?최대알고:문제[0];
			최대코딩=최대코딩>문제[1]?최대코딩:문제[1];
		}
		기록=new int[최대알고+1][최대코딩+1];
		for(int[]더미:기록)Arrays.fill(더미,-1);
		return 완전탐색(알고력,코딩력);
	}
	public static void main(String[] args) {
		System.out.println(solution(10,10,new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
		System.out.println(solution(0,0,new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
	}

}
