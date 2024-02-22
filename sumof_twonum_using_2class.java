class sample{
	private double num1,num2;
	sample(double n1,double n2){
		num1=n1;
		num2=n2;
	}
	void sum(){
		double result;
		result=num1+num2;
		System.out.print("sum is -->"+result+" \n ");
	}
}
class methods{
	public static void main(String args[]){
		sample s1=new sample(11.2,23.02);
		s1.sum();
	
	}
}
