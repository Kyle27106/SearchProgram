
public class Main {
	public static void main(String[] args) {
		//two numbers that are targeted in array
		int num1 = 17, num2 = 45;
		//Adding array
		int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
		//Code that searches for targeted numbers in the array
		boolean searchNum1 = binarySearch (array, num1);
		boolean searchNum2 = binarySearch (array, num2);
		//Output
		if (searchNum1){

		}else {
			System.out.println("17 was not found");
			}
		if (searchNum2){
			System.out.println("45 was found");
		}else {
			System.out.println("45 was not found");
		}

	}
	
	public static boolean binarySearch(int[] arr, int element){
		//determining the beginning and end of the array
		int start = 0, end=arr. length-1; 
		while (start<=end){
		//defining the middle of the array
			int middle= start+end-1/2;
		//determine if midde element equals given element
			if (arr[middle]==element) {
				return true;
		//determine if element is greater than
			}else if (arr[middle]>element){
		//if it is greater than then change middle to -1
				end = middle-1;
			}else {
		//if less than then +1 to the middle.
			   start = middle+1; 
			}	
		}
		return false;
		
		}
		
}


