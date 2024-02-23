class sample{
	 static  double num1,num2;
	 static void sample(double x,double y){
		num1=x;
		num2=y;
	}
	static	double sum(){
		double result;
		result=num1+num2;
		//System.out.print("sum is -->"+result+" \n ");
		return result;
	}
}
class methods{
	public static void main(String args[]){
		//sample s1=new sample(11.2,23.02);
		sample.sample(12.1,23.1);
		double res=sample.sum();
		System.out.print("sum is -->"+res+" \n ");
	}
}	
