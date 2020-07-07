package demoproject;

class MyCode {
	public static void main(String[] args) {
//		System.out.println("Hello Java");

		int[] arr = { 1, 6, 8, 5, 9, 4, 7, 2 };

		int[] result = new int[4];

		int i = 0;

		int j = 0;

		int ctr = 0;

		int nextInt = 1;

		int sum = 0;
		while (i < arr.length) {

			ctr++;
			sum = sum + arr[i];
			if (ctr == nextInt) {
				result[j] = sum;
				sum = 0;
				j++;
				ctr = 0;
				nextInt++;
			}
			i++;

		}

		if (ctr != 0)
			result[j] = sum;

		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}
