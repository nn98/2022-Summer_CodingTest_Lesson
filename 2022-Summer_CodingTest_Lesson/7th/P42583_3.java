package Programmers;
public class P42583_3 {
	static public int solution(int b, int w, int[] t) {
		int a=1,j,r=1,i=0,v=0,c[]=new int[100000001];
		for(;i<t.length|a>0;r++) {
			if(i!=t.length)
				if(c[r]+t[i]<=w) {
					for(j=r;j<r+b;c[j++]+=t[i]);
					i++;
				}
			if(c[r]<1)a=0;
		}
		return --r;
	}
	public static void main(String[] args) {
		System.out.println(solution(2,10,new int[] {7,4,5,6}));
		System.out.println(solution(100,100,new int[] {10}));
		System.out.println(solution(100,100,new int[] {10,10,10,10,10,10,10,10,10,10}));
	}
}