package LeetCodePrograms;

import java.util.*;

public class TwoSumUsingCollection {

    public static void main(String[] args) {
        int arr[] = {1, 23, 4, 66, 45, 43, 2, 4, 6, 7, 8, 54};
        int target = 9;

        List<int[]> result = twoSumAllMatches(arr, target);

        if (!result.isEmpty()) {
            System.out.println("Matching index pairs:");
            for (int[] pair : result) {
                System.out.println(pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("No match found");
        }
    }

    public static List<int[]> twoSumAllMatches(int[] array, int target) {
        List<int[]> matches = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>(); // number → list of indices

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                for (int index : map.get(complement)) {
                    matches.add(new int[]{index, i});
                }
            }

            // Add current number index to map
            map.computeIfAbsent(array[i], k -> new ArrayList<>()).add(i);
        }

        return matches;
    }
}