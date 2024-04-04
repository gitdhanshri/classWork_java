class ExceptionHandleBytry{
	public static void main(String ...args){
		try{
			System.out.println("Opening the files");
			//do Some Procssing
			int n=args.length;
			System.out.println("Value of n ->"+n);
			int a =45/n;
			System.out.println("Value of a->"+a);
			int b[]={10,20,30};
			b[50]=100;
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Pass the non zero Value While Running this Program");
		}
		finally{
			// for Closing all Files
			System.out.println("Close the files");
		}
	
	}
}
