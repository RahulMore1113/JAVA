import java.util.Arrays;

public class AC {

	public static void main(String[] args) {

		int[] a = new int[4];

		for (int ele : a) {
			System.out.print(ele);
		}
		System.out.println();
		Arrays.fill(a, 5);
		for (int ele : a) {
			System.out.print(ele);
		}
		System.out.println();

		int[] ar = { 1, 2, 0, 0, 0, 4, 5 };
		Arrays.fill(ar, 2, 5, 10);
		for (int ele : ar) {
			System.out.print(ele + " ");
		}
		System.out.println();

		int[] arr = { 20, 30, 50, 10, 25, 60 };
		Arrays.sort(arr);
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		int res = Arrays.binarySearch(arr, 50);
		System.out.println(res);

	}

}
