package algo.week1;

import java.util.Scanner;

public class Chapter2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		q12();
	}
	
	
	static int q7(int n) {
		int sum =0 ;
		for(int i=1;i<n+1;i++) {		
			sum+=i;
			
		}
		return sum;
	}
	
	static int q8(int n) {
		if(n%2 == 0) {
			return (1+n)*(n/2);
		}
		else {
			return (1+n)*(n/2)+(n/2+1);
		}
	}
	
	static int sumof(int a, int b) {
		int sum=0;
		for(int i=a;i<b+1;i++) {
			sum += i;
		}
		return sum;
	}
	
	static void q10() {
		int a ,b ;
		System.out.println("a의 값 : ");
		a = sc.nextInt();
		do {
			System.out.println("b의 값 : ");
			b=sc.nextInt();
		}while(!(b>a));
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
	
	static void q11() {
		System.out.println("값 입력 :");
		int n = sc.nextInt();
		int k = 0;
		do {
			n = n/10;
			k++;
		}while((n/10)>0);
		
		System.out.println(n+"은 "+k+"자리입니다.");
	}
	
	
	//칸 다 맞추는 거 답지 보기.
	static void q12() {
		System.out.println(" | 1 2 3 4 5 6 7 8 9");
		System.out.println("-+--------------------");
		for(int i =1; i<10;i++) {
			System.out.print(i+"| ");
			for(int j=1;j<10;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
