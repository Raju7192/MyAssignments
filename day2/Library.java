package week1.day2;

public class Library {

		
		public String addBook(String booktitle) {
			System.out.println("Book Added Successfully");
			return booktitle;
			}
		
	
		public void issueBook() {
			System.out.println("Book issued Successfully.");
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Library lo=new Library();
		   
			System.out.println(lo.addBook("Money"));
		    lo.issueBook();

	}

}
