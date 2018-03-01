//Adam Lopata

public class FindLast {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 2};
		
		System.out.println(findLastThingy(array, 2, 0))
	}

	
	public static int findLast(int[] x, int y) {
		for (int i = x.length - 1; i >= 0; i--) {
			if (x[i] == y)
				return i;
		}
		return -1;
	}
}
}
