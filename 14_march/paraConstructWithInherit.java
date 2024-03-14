class college{
	String clgName;
	/*college(){
		System.out.println("1:Inside Default constructor of college");
	}*/
	college(String clgName){
		System.out.println("2:Inside parameterised constructor ");
		this.clgName=clgName;
	}
}
class TechUni extends college{
	String sggsName;
	
	TechUni(String sggsName){
		//super();
		this.sggsName=sggsName;
	}
	public static void main(String args[]){
		TechUni s1=new TechUni("sggs");
		SYIT S1=new SYIT();
		System.out.println(s1.sggsName);
	}
}
