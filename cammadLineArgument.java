class commandLine{
	public static void main(String ...args){
		int n=args.length;
		System.out.println("Value of n->"+n);
		int a=n/3;
		System.out.println("Value of a->"+a);
		String sum="";
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		System.out.println("Sum is ->"+sum);
	}
}
