package algo.week1;

public class Chapter1 {

	public static void main(String[] args) {
	
		System.out.println(max4(10,12,18,20));
		System.out.println(min4(10,12,31,9));

}
		
		// TODO Auto-generated method stub
		
	public static int max4(int a, int b,int c, int d) {
			
			int max = a;
			
			if(b>max) {
				max = b;
			}
			if(c>max) {
				max = c;
			}
			if(d>max) {
				max = d;
			}
			
			return max;
	}
	
	public static int min4(int a, int b , int c, int d) {
		int min = a;
		
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
		if(d<min) {
			min = d;
		}
		
		return min;
		
	}
	
	public static int mid3(int a, int b, int c) {
		//int mid = a;
		
		if( a>= b) {
			if(b>=c) {
				return b;
			}
			else if(a>=c) {
				return c;
			}
			else return a;
		}
		else {
			if(a>=c) {
				return a;
			}else if(b>=c) {
				return c;
			}
			return b;
		}
		
		
		
	}

}
