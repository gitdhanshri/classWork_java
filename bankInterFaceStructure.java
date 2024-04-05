/*
Let's see another example of java interface which provides the implementation of Bank interface.
*/
interface Bank{  
	    float rateOfInterest();  
}  
class SBI implements Bank{  
	public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
	public float rateOfInterest(){return 9.7f;}  
}  
class HFDC implements Bank{  
	public float rateOfInterest(){return 9.56f;}  
} 
class TestInterface2{  
	public static void main(String[] args){  
	Bank b1=new SBI();  
	Bank b2=new PNB();  
	Bank b3=new HFDC();  
	System.out.println("ROI: SBI Bank -"+b1.rateOfInterest());  
	System.out.println("ROI:PNB Bank  -"+b2.rateOfInterest());  
	System.out.println("ROI:HFDC Bank -"+b3.rateOfInterest());  
    }
}  
