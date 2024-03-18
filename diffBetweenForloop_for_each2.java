  class forEachAndFor{
	void byForEachLoop(long[] arr){
		long sum=0;
	 //  System.out.println("\nBy using for Each Loop"); 
  	       for (long element : arr) {
 			//System.out.print(element + " "); 
 			sum+=element;
      	        }
      	     //   System.out.println();
	}
	void byForLoop(long[] arr){
		long sum=0;
	   //  System.out.println("\nBy using for Loop"); 
  	       for(int i=0;i<arr.length;i++) {
 			sum+=arr[i];
      	        }
      	      //  System.out.println();
	}
	long sumOfArray(long[] arr){
		long sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String args[]){
		forEachAndFor f1=new forEachAndFor();
		long arr[] = { 10, 50, 60, 80, 90 }; 
		f1.byForEachLoop(arr);
		f1.byForLoop(arr);
		int size=0;
		long startTime ,endTime,timeDiff;
		long[] arr1_m1=new long[1000];
		long [] arr2_m2=new long[1000];
		while(size<1000){
		//Approach 1
			startTime=System.nanoTime();
			f1.byForEachLoop(arr);
			endTime=System.nanoTime();
			arr1_m1[size]=(endTime-startTime);
		//Approach 2
			startTime=System.nanoTime();
			f1.byForLoop(arr);
			endTime=System.nanoTime();
			arr2_m2[size]=(endTime-startTime);
			size++;
		}	
		long time1=f1.sumOfArray(arr1_m1)/1000;
		System.out.println(time1);
		long time2=f1.sumOfArray(arr2_m2)/1000;
		System.out.println(time2);
	}
}
