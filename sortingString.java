package cosc499;

import java.util.Arrays;
<<<<<<< Updated upstream

public class sortingString {

	public static void main(String[] args) {
		int[] arr = {5, 3, 6, 2, 1, 9, 8, 4, 7};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
=======
import java.util.Collections;
import java.util.List;

public class sortingString {

	public static List<String> sortString(List<String> list) {
		Collections.sort(list);
		return list;
>>>>>>> Stashed changes
	}

}
