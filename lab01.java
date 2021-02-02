import java.sql.SQLOutput;

public class lab01 {

	public static int highestAltitude (int [] gain) {

		int [] corresponding_altitudes = new int[gain.length+1];
		corresponding_altitudes[0] = 0;
		//corresponding_altitudes[1] = gain[0];

		for(int i =1; i < gain.length+1; i++) {
			//int temp = corresponding_altitudes[i-1];
			corresponding_altitudes[i] = corresponding_altitudes[i-1] + gain[i-1];

		}

		int max = corresponding_altitudes[0];
		//for(int u = 0; u < corresponding_altitudes.length; u++) {
		//	System.out.println(corresponding_altitudes[u]);
		//}
		for (int j = 1; j < corresponding_altitudes.length; j++) {
			if (corresponding_altitudes[j] > max) {
				max = corresponding_altitudes[j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		//integer array
		int[] example1 = {-5,1,5,0,-7};
		int[] example2 = {-4,-3,-2,-1,4,3,2};

		//call printArray method by passing intArray as an argument
		System.out.println(highestAltitude(example1));
		System.out.println(highestAltitude(example2));
	}

}

