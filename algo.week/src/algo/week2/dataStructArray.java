package algo.week2;

import java.util.Scanner;

public class dataStructArray {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no,cd,dno,retry = 0;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 :");
				no = sc.nextInt();
			}while(no < 0);
		}while( retry == 1);
	}


}
