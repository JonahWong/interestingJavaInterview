
public class OddAndEven {
//	 public static void main(String[] args) {
//	        int A[] = new int[] { 4, 6, 8, 2, 3, 9, 5 };
//	        printArr(A);
//	    }
//	 
//	    static void printArr(int[] arr) {
//	        int index = 0;
//	        for (int i = 0; i < arr.length; ++i) {
//	            if (arr[i] % 2 != 0)
//	                System.out.print(arr[i]);
//	            else
//	                arr[index++] = arr[i];
//	        }
//	        for (int i = 0; i < index; ++i)
//	            System.out.print(arr[i]);
//	    }
	//System.out.println(b&1);
	public static void main(String[] args) {
		int a = 25;
		int b = 16;
		
		bitOperationSwap(a, b);
		
	}
	
	public static void bitOperationSwap(int a, int b){		
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a=" + a + ", b=" + b);
	}
	

}
