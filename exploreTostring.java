class SGGS{
	static public void main(String args[]){
		System.out.println("Inside main");
		SGGS sggs1=new SGGS();
		System.out.println("Default toString() return  for obj1:-->"+sggs1);
		//System.out.println("class  toString() return :"+sggs1.myTostring());
		SGGS sggs2=new SGGS();
		System.out.println("Default toString() return : for obj2->"+sggs2);
		//System.out.println(sggs1==sggs2);
		//System.out.println(sggs1.getClass());
		//System.out.println(sggs1.getName());
		System.out.println("Address of sggs1-->"+sggs1.myTostring());
		System.out.println("Address of sggs2-->"+sggs2.myTostring());
	}
	public String myTostring(){
		//return "myToString"+getClass().getName()+"@"+Integer.toHexString(hashCode());
		//return getClass().getName();
		//return Integer.toHexString(hashCode());
		return "myToString"+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	/*public String toString(){
		return "Addressofsgg1";
	}*/
}
