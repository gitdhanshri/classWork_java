class SGGS{
	static int x=786;
	int y=2024;
	static public void main(String args[]){
		System.out.println("Inside main");
		SGGS sggs1=new SGGS();
		System.out.println("Default toString() return :"+sggs1);
		System.out.println("class  toString() return :"+sggs1.myTostring());
	}
	public String myTostring(){
		return "myToString"+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
