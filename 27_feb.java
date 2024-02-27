class college{
	static int id=123;
	{
		System.out.println("Inside init block  Of college --->"+this);
	}
	static{
		System.out.println("Inside static  block of College---->");
	}
	/*college(){
		System.out.print("Inside default constructer of college class--->"+this);
	}*/
	
}
class SGGS extends college{
	int x=120;
	SGGS(){
		System.out.println("Inside default constructorn of SGGS--->"+this);
	}
	static{
		System.out.println("Inside static block  in SGGS   class-->");
	}
	
	{
		System.out.println("\nInside init block of SGGS class -->"+this);
	}
	
public static void main(String args[]){
	SGGS sggs=new SGGS();
	//college clg=new college();
}
}
	/*int sum(int a ,int b){
		System.out.println("Sum is -->"+a+b);
		return a+b;
	}
	int multiplication(int a,int b){
		System.out.println("Multiplication is -->"+a*b+this);
		return a*b;
	}*/
