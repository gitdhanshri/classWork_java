class Array{
public static void  fun1(byte  arr[]){
	for(int i=0;i<arr.length;i++){
		System.out.print("  ");
		System.out.print(arr[i]);
	}
}
public static void main(String[] args){
	byte[] arr1={0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09};
	fun1(arr1);
}
}
