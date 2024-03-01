import java.util.Scanner;  // Import the Scanner class
class Book{
	static int rollNum=100; 
	String bookName;
	int booknum;
	void getBookNum(int booknum){
	System.out.println("Book Number is "+booknum);
	}
	void getBookName(String bookName){
	System.out.println("Book name  is "+bookName);
	}
}
class library {
	student s1;
	Book b1;
	library(student s1,Book b1){
		this.s1=s1;
		this.b1=b1;
	}
}
class student extends Book{
	String nameOfStudent;
	double resNumber;
	int  mobNumber;

	void getName(String nameOfStudent){
	 		System.out.println("name is -->"+nameOfStudent);
	}
	void getresNumber(double resNum){
		System.out.println("Resistration Number  is -->"+resNum);
	}
	void getmobNumber(int num){
	System.out.println("mobile Number is -->"+num);
	}
	/*void getmobNumber(long num){
		System.out.println("mobile Number is -->"+num);
	}*/
	void inputDataOfStudentForIssue()
	{
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter name of an Student ->\n");
    	String nameOfStudent = myObj.nextLine();
    	
    	System.out.println("Enter  Resistration Number of an Student ->\n");
    	resNumber = myObj.nextDouble();
    	
    	System.out.println("Enter book Number->\n");
    	int booknum = myObj.nextInt();
    	
    	System.out.println("Enter mobile Number->\n");
        mobNumber  = myObj.nextInt();
    	
    	System.out.println("Enter book Name->\n");
    	String bookName = myObj.nextLine();
	}
	void dispalyIssudedBook(){
		getName(nameOfStudent);
		getresNumber(resNumber);
		getBookNum(booknum);
		getBookName(bookName);
		getmobNumber(mobNumber);
		System.out.println("your Book has been issued->\n");
	
	}
}
class methodCall{
	public static void main(String args[]){
		//methodCall method=new methodCall();
		student s1=new student();
		Book b1=new Book();
		library lab=new library(s1,b1);
		//lab.bookissue(s1,s1);
		s1.inputDataOfStudentForIssue();
		s1.dispalyIssudedBook();
		
	}

}
