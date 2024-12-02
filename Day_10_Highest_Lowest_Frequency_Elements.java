import java.util.HashMap;

public class Day_10_Highest_Lowest_Frequency_Elements {
     public static int[] getFrequencies(int[] v) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Initialize variables to store the highest and lowest frequency elements
        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        int highestFreqElement = -1;
        int lowestFreqElement = -1;
        
        // Traverse the frequency map to find the elements with highest and lowest frequencies
        for (int key : frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);
            
            // Update highest frequency element
            if (freq > highestFreq) {
                highestFreq = freq;
                highestFreqElement = key;
            } else if (freq == highestFreq) {
                highestFreqElement = Math.min(highestFreqElement, key);
            }
            
            // Update lowest frequency element
            if (freq < lowestFreq) {
                lowestFreq = freq;
                lowestFreqElement = key;
            } else if (freq == lowestFreq) {
                lowestFreqElement = Math.min(lowestFreqElement, key);
            }
        }
        
        // Return an array containing the highest and lowest frequency elements
        return new int[] {highestFreqElement, lowestFreqElement};
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] v1 = {1, 2, 3, 1, 1, 4};
        int[] ans1 = getFrequencies(v1);
        System.out.println(ans1[0] + " " + ans1[1]);  // Expected Output: 1 2

        // Example 2
        int[] v2 = {10, 10, 10, 3, 3, 3};
        int[] ans2 = getFrequencies(v2);
        System.out.println(ans2[0] + " " + ans2[1]);  // Expected Output: 3 3
    }
}
