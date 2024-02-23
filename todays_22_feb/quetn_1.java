class sample{
	 double num1,num2;
	 sample(double x,double y){
		num1=x;
		num2=y;
	}
	double sum(){
		double result;
		result=num1+num2;
		//System.out.print("sum is -->"+result+" \n ");
		return result;
	}
}
class methods{
	public static void main(String args[]){
		quiz3 s1=new quiz3(11.2,23.02);
		double res=s1.sum();
		System.out.print("sum is -->"+res+" \n ");
	}
}
