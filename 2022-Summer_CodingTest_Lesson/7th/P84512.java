package Programmers;

public class P84512 {
	static char[]a= {' ', 'A', 'E', 'I', 'O', 'U'},b=new char[5];
	static int i,h[]=new int[6];
	static String[]l=new String[3906];
	static void o(int x) {
//		if(x==5)System.out.println(++i+"\t"+new String(b));
		if(x==5)l[++i]=new String(b).trim();
		else for(int i=x<1?1:0;i<(x>1?(b[x-1]==' '?1:6):6);i++) {
			b[x]=a[i];
			o(x+1);
		}
	}
	static int solution(String w) {
		o(0);
		int i=0;
		for(;++i<3906;)if(l[i].equals(w))return i;
		return i;
	}
	public static void main(String[] args) {
		System.out.println(solution("AAAAE"));
		System.out.println(solution("AAAE"));
		System.out.println(solution("I"));
		System.out.println(solution("EIO"));
	}

}
