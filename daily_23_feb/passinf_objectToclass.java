class One{
	Two obj2;
	One(Two obj2){
		this.obj2=obj2;
	}
	
	double find_cube(double x){
		double result=x*obj2.find_square(x);
		return result;
	}

}
class Two{
	Three obj3;
	Two(Three obj3){
		this.obj3=obj3;
	}
	double find_square(double x){
		double result=x*obj3.get_num(x);
		return result;
	}
}
class Three{
	double get_num(double x){
		return x;
	}
}
class Relate{
	public static void main(String args[]){
	Three object3=new Three();
	Two object2=new Two(object3);	
	System.out.println("Square of number is -->"+object2.find_square(11));
	One object1=new One(object2);
	System.out.println("Cube of number is --->"+object1.find_cube(5));
	
	}
	
}
