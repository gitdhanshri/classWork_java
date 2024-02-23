class num1{

static int  number=123;
void getNum(int x){
		number=x;
		//System.out.print("\nvalue of x-->"+number);
}
void display(){
	System.out.println("\nIn dispaly method --> ");
	System.out.print("\nvalue of x-->"+number+"\n");
	
}
public static void main(String args[]){
	num1 obj1=new num1();
	obj1.display();
	obj1.getNum(1245);
	obj1.display();
}
}
