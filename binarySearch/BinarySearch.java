import java.util.*;
public class BinarySearch
{
	public static void main(String str[]) {
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

		// Sorting
		for(int i=0;i<length; i++) {
			for(int j = i+1; j<length;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Gerated array ::  "+ Arrays.toString(arr));

		// Searching
		long startTime = System.currentTimeMillis();
		System.out.println(" :: Enter the Element you want to search 0-99 :: ");
		int toBeFound = s.nextInt();
		boolean isFound = false;
		int low = 0 ;
		int high = length-1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (arr[middle] == toBeFound) {
				isFound = true;
				System.out.println("Element found at position " + (middle + 1));
				break;
			}
			else if (arr[middle] < toBeFound) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
		}
		if(!isFound)
			System.out.println("Entered Element not found..");
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		// duration
		System.out.println("Task took " + duration + " ms");
	}
}
