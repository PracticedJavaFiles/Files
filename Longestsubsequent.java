import java.util.ArrayList;
import java.util.List;

public class LongestSubsequenceArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 2, 10, 14, 19, 11, 3, 7, 9, 13};
        List<Integer> li = new ArrayList<>();

        int currentLength = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                currentLength++;
            } else {
                li.add(currentLength);
                currentLength = 1;
            }
        }
        li.add(currentLength);
        System.out.println("Longest Increasing Subsequence Length: " + maxLength(li));
    }

    public static int maxLength(List<Integer> lengths) {
        int max = 0;
        for (int length : lengths) {
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}

