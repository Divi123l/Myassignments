package myassignmentw1;

public class Library {

	public String addbook (String booktitle) {
System.out.println(booktitle+" Book added successfully");
return booktitle;
	}
	public void issuebook() {
System.out.println("Book issued sucessfully");
	}
	public static void main(String[] args) {
Library lb = new Library();
lb.addbook("Maths book");
lb.issuebook();
	}
}
