class Father{
int balance=1000;
String surname="Baswade";
public Father(){
	this(400);
	System.out.println("Inside default constraucter"); 
}
public Father(int a){
	System.out.println("Inside Parameterised  constraucter"); 
	System.out.println("value of a-->"+a);
}
public static void main(String args[]){
Father daughter=new Father();
daughter=new Father(100);
System.out.println(daughter.balance);
daughter.balance=500;
System.out.println(daughter.balance);
daughter=new Father(daughter.balance);
}
}

