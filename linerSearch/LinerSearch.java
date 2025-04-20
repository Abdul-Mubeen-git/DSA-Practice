import java.util.*;
class LinerSearch
{
	public static void main(String str[]) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter the Array length : ");
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int length = s.nextInt();
		int arr[] = new int[length];
		System.out.println("Genrating the random array");
		for(int i=0;i<length;i++){
			arr[i] = r.nextInt(100);
		}
		System.out.println("Gerated array ::  "+ Arrays.toString(arr));
		System.out.println(" :: Enter the Element you want to search 0-99 :: ");
		int toBeFound = s.nextInt();
		boolean isFound = false;
		int index = -1 ;
		for(int i=0;i<length;i++){
			if(arr[i] == toBeFound) {
				isFound = true;
				index = i+1;
			}
		}
		if(isFound){
			System.out.println("Entered Element found at "+ index + "th position..");
		}
		else {
			System.out.println("Entered Element not found..");
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;

		System.out.println("Task took " + duration + " ms");
	}
}

