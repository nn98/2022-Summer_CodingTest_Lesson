package Programmers;

import java.util.Arrays;
//날먹 실패
public class P118667 {
//	static void o(int x,int y,int c,int X,int Y) {
//		
//	}
	static public int solution(int[] q, int[] p) {
        int l=q.length,a[]=new int[l*2],i=0,x=0,y=l,r=0,c=0;
        long A=0,B=0;
        for(;i<l*2;a[i]=i<l?q[i]:p[i%l],A+=i<l?a[i]:0,B+=i<l?0:a[i],i++);
        if((A+B)%2==1)return -1;
        for(;c<300000;r++,c++) {
//            System.out.println(Arrays.toString(a)+" "+x+" "+y+" "+A+" "+B);
        	if(A<B) {
            	A+=a[y%(l*2)];
            	B-=a[y++%(l*2)];
            }else if(A>B) {
            	A-=a[x%(l*2)];
            	B+=a[x++%(l*2)];
            }else {
                return r;        	
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,7,2},new int[] {4,6,5,1}));
		System.out.println(solution(new int[] {1,2,1,2},new int[] {1,10,1,2}));
		System.out.println(solution(new int[] {1,1},new int[] {1,5}));
	}

}
