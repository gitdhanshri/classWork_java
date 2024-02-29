class college{
	static int collegeId=456;
	{
	System.out.println("Inside init block of College-->"+this );
	}
	static {
		System.out.println("Inside Static block of Collge-->"+collegeId);
	}
}
class SGGS extends college{
	static int id=786;
	int y=2024;
	{
		System.out.println("Inside init block of SGGS-->"+this );
	}
	SGGS(){
		System.out.println("Inside SGGS Constructer-->"+this);
	}
	public static void main(String args[]){
		System.out.println("Inside main method");
		SGGS sggs1=new SGGS();
		System.out.println(sggs1);
	}
	static {
		System.out.println("Inside Static block of SGGS");
	}
}
