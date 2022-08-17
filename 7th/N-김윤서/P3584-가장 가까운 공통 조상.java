package _Algorithm.DFS;
import java.io.*;
import java.util.Arrays;
public class P3584 {
	static int n,m,K,i,j,a[][],h[],R;
	static void o(int x) {
//		System.out.println(x+" "+h[x]);
		if(h[x]>0)R=x;
		else {
			h[x]++;
//			System.out.println(x+" "+h[x]);
			for(int y=0;++y<m;)if(a[x][y]>0)o(y);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(K=Integer.parseInt(r.readLine());K-->0;) {
			m=n=Integer.parseInt(r.readLine())+1;
			String[]b;
			a=new int[n][n];
			h=new int[n];
			for(;--n>1;) {
				b=r.readLine().split(" ");
				a[Integer.parseInt(b[1])][Integer.parseInt(b[0])]++;
			}
//			for(int[]c:a)System.out.println(Arrays.toString(c));
			b=r.readLine().split(" ");
			o(Integer.parseInt(b[0]));
			o(Integer.parseInt(b[1]));
//			System.out.println(R);
			w.write(R+"\n");
		}
		w.flush();
	}

}
