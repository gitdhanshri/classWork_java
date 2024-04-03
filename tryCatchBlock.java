class ExceptionHandler{
	public static void main(String ...args){
		
		try{
			System.out.println("Try block  1");
			Thread.sleep(2000);
			System.out.println(args[0]);
			Thread.sleep(3000);
			System.out.println("Try block  2");
		}
		
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" Inside Catch : 1->Exception in line number 5 ");
		}
		
		catch(InterruptedException e){
			System.out.println("Exception in line number 5 ");
		}
	}
}
