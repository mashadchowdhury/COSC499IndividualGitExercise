package cosc499;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortingInt {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Kelowna", "Vancouver",
				"Kamloops", "Victoria", "Hope", "Salmon Arm", "Revelstoke",
				"Merritt", "Osoyoos", "Prince George");
		Collections.sort(cities);
		System.out.println(cities);
	}

}
