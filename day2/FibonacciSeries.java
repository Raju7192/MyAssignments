package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstno = 0, secondno = 1;
		for (int i = 1; i<8; i++) {
			System.out.println(firstno);
			int thirdno =firstno+secondno;
			 firstno=secondno;
			 secondno=thirdno;
		}
	}

}
