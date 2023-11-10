import java.util.Arrays;

class JavaArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		int[] copy = new int[5];
		int[][] map = {
			{11},
			{22, 33},
			{44, 55, 66}
		};

		for(int[] es : map) {
			for(int e : es)
				System.out.print(e + " ");
			System.out.println();
		}

		for(String s : args) System.out.println(s);

		Arrays.fill(copy, 1);
		for(int i=0; i<copy.length; i++) System.out.println(copy[i]);

		for(int i=0; i<copy.length; i++) copy[i] = arr[i];
		for(int i=0; i<copy.length; i++) System.out.println(copy[i]);

		Arrays.fill(copy, 1);
		System.arraycopy(arr, 0, copy, 0, 5);
		for(int i=0; i<copy.length; i++) System.out.println(copy[i]);
	}
}
