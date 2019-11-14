package _03ejercicios;

public class _01Edades {

	public static void main(String[] args) {

		int m = 17, p = 78, j = 45, v = 1;
		//A
		boolean ap_a = m < 18;
		System.out.println("a: " + ap_a);
		//B
		boolean ap_b = m > j;
		System.out.println("b: " + ap_b);
		//C
		boolean ap_c = m > j && m > p && m > v;
		System.out.println("c: " + ap_c);
		//D
		boolean ap_d = m>j || m>p || m>v;
		System.out.println("d: " + ap_d);
		//E
		boolean ap_e = m < 18 && j < 18;
		System.out.println("e: " + ap_e);
		//F
		boolean ap_f = m > 18 || j >18 || p >18 || v >18;
		System.out.println("f: " + ap_f);
		//G
		boolean ap_g = m<p && m <v && j<p && j<v ;
		System.out.println("g: " + ap_g);
		//H
		boolean ap_h = (m + p + j + v)>100;
		System.out.println("h: " + ap_h);
		//I
		boolean ap_i = (m + j) > p;
		System.out.println("i: " + ap_i);
		//J
		boolean ap_j = (m + j) > (p + v);
		System.out.println("j: " + ap_j);
		//K
		boolean ap_k = (j<m && j<v && j>p) || (j<m && j>v && j<p) || (j>m && j<v && j>p) ;
		System.out.println("k: " + ap_k);
		//L		
		boolean ap_l = m < 18  || j<18 || p <18 || v<18;
		System.out.println("l: " + ap_l);
		//M		
		boolean ap_m = m < 18  && j<18 && p <18 && v<18;
		System.out.println("m: " + ap_m);
		//N
		/*boolean ap_a =(m < 18  && j<18 && p >18 && v>18) || (m < 18  && j>18 && p >18 && v<18) ;
		System.out.println("n: " + ap_n);
		boolean ap_a = m < 18;
		System.out.println("a: " + ap_a);
		boolean ap_a = m < 18;
		System.out.println("a: " + ap_a);
		boolean ap_a = m < 18;
		System.out.println("a: " + ap_a);*/
		
		
		

	}

}
