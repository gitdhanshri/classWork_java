class year{
	final int totalStudents;
	 int students[];
	final int regularStudents;
	final int tfwsStudents;
	final int dsyStudents;
	year( int totalStudents,int  regularStudents ,int tfwsStudents ,int dsyStudents){
		this.totalStudents=totalStudents;
		this.regularStudents=regularStudents;
		this.tfwsStudents=tfwsStudents;
		this.dsyStudents=dsyStudents;
		//generateStudentRollNumber();
	}
	void   store_RollNumber_Array(){
		students=new int[totalStudents];
		int i=0,j=150,k=500;
		for(int n=0;n<totalStudents;n++){
			if(i<regularStudents){
				students[n]=i+1;
				i++;
			}
			else if(j<(150+tfwsStudents)){
				students[n]=j+1;
				j++;	
			}
			else if(k<(500+dsyStudents)){
				students[n]=k+1;
				k++;
			}
			
		}
	}
	void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("  "+arr[i]);
		}
	}
	long generateRandomNum(){
		//long res=System.nanoTime()%78;
	        int res=(int)(System.nanoTime()%78);
	        
		//System.out.println("Random  array Index-->"+res);
		System.out.print("Its Index-->"+ res+" &RadomResNum-->");
		return students[res];
	}
	public static void main(String args[]){
		year r1=new year(78,64,3,11);
		r1.store_RollNumber_Array();
		System.out.println(r1.generateRandomNum());
	}
}
