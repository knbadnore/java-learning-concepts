package LeetCodePrograms;

import java.util.Arrays;

import LeetCodePrograms.TwoSums.Pair;

public class TwoSums {

	static class Pair implements Comparable<Pair> {

		int value;
		int index;

		Pair(int value, int index) {
			this.index = index;
			this.value = value;

		}

		@Override
		public int compareTo(Pair o) {
			return this.value - o.value;
		}
		 @Override
		    public String toString() {
		        return "(" + value + ", " + index + ")";
		    }
		
	}

	public static int[] twoSums(int[] array, int target) {

		Pair[] pair = new Pair[array.length];
		for (int i = 0; i < array.length; i++) {
			pair[i] = new Pair(array[i], i);
		}
		System.out.println(Arrays.toString(pair));
		Arrays.sort(pair);
		int result[] = new int[2];
		int leftIn = 0;
		int rightIn = pair.length - 1;

		while (leftIn < rightIn) {

			int left = pair[leftIn].value;
			int right = pair[rightIn].value;

			if (left + right < target) {
				leftIn++;
			} else if (left + right > target) {
				rightIn--;

			} else {
				result[0] = pair[leftIn].index;
				result[1] = pair[rightIn].index;
				  return result; // better to return immediately

			}
		}
		 return new int[] {-1, -1}; // if no solution found
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println(Arrays.toString(twoSums(array, 17)));

	}
}
