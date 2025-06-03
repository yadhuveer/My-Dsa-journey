package Coding_NinjasProblem;

public class solution {

    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int input[]) {
        return generateSubsets(input, 0);
    }

    // Helper method to recursively generate subsets
    private static int[][] generateSubsets(int[] input, int index) {
        // Base case: if index reaches the end of the array
        if (index == input.length) {
            return new int[1][0]; // Return a 2D array containing an empty subset
        }

        // Recursive call to get subsets of the remaining elements
        int[][] smallerSubsets = generateSubsets(input, index + 1);

        // Total subsets will be twice the size of smallerSubsets
        int[][] allSubsets = new int[2 * smallerSubsets.length][];

        // Copy subsets from smallerSubsets as-is
        for (int i = 0; i < smallerSubsets.length; i++) {
            allSubsets[i] = smallerSubsets[i];
        }

        // Add current element to each subset in smallerSubsets and copy
        for (int i = 0; i < smallerSubsets.length; i++) {
            int[] newSubset = new int[smallerSubsets[i].length + 1];
            newSubset[0] = input[index]; // Add the current element at the start
            for (int j = 0; j < smallerSubsets[i].length; j++) {
                newSubset[j + 1] = smallerSubsets[i][j]; // Copy remaining elements
            }
            allSubsets[i + smallerSubsets.length] = newSubset;
        }

        return allSubsets;
    }
}
