/*class test{
	static int x;
	test(int x){
		this.x=x;
	}
	static   void access(){
		System.out.println("x=="+x);
	}
	static   void hello(){
		System.out.println("hello Student !");
	}
}
class demo{
	public static void main(String args[]){
		test obj1=new test(101);
		//test.access();
		test.hello();
		obj1.hello();
	}
}*/
class test{
	 int x=55;
	test(int x){
		this.x=x;
		System.out.println("Inside constructor-->>  x=="+x);
	}
	static   void access(){
		//System.out.println("Inside access block  x=="+x);
	}
	static   void hello(int x){
			//this.x=x;
		System.out.println(" inside hello block  x=="+x);

	}
	static{
			System.out.println("Inside STATIC block  block--->");
	
		//System.out.println("Inside [Static]  block   static block--->"+x);
	}
	{
		System.out.println("Inside [init] block  block--->"+x);
	}
	 void display(int x){
			this.x=x;
		System.out.println(" inside display block  x=="+x);

	}
}
class demo{
	public static void main(String args[]){
		//System.out.println("In main-->value of x before this-->"+test.x);
		
		test obj1=new test(101);
		test.access();
		obj1.access();
		//test.hello();
		test.hello(1000);
		obj1.hello(124);
		//System.out.println("In main-->value of x after this-->"+test.x);
	}
}
