package cosc499;

import java.util.Arrays;

public class sortingString {

	public static void main(String[] args) {
		int[] arr = {5, 3, 6, 2, 1, 9, 8, 4, 7};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
