class sample{
	 static double x;
	sample(double n1){
	this.x=n1;	
	}
	static	void access(){
		System.out.print("X is -->"+x+" \n ");
	}
}
class methods{
	public static void main(String args[]){
		sample s1=new sample();
		s1.sample(12.1);
		sample.access();

	}
}	
