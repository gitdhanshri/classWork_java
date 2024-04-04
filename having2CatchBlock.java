class ExceptionHandleBytry{
	public static void main(String ...args){
		try{
			Thread.sleep(1000);
			System.out.println("Opening the files");
			//do Some Procssing
			int n=args.length;
			Thread.sleep(2000);
			System.out.println("Value of n ->"+n);
			int a =45/n;
			//Thread.sleep(3000);
			System.out.println("Value of a->"+a);
			int b[]={10,20,30};
			b[50]=100;
		}
		catch(InterruptedException a){
			System.out.println(a);
			a.printStackTrace();
			
		}
		catch(ArithmeticException e){
			//System.out.println(e);
			e.printStackTrace();
			System.out.println("Pass the non zero Value While Running this Program");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			//display Exception details
			ex.printStackTrace();
			System.out.println("Plz see that array index is within range");
		}
		finally{
			// for Closing all Files
			System.out.println("Close the files");
		}
	
	}
}
