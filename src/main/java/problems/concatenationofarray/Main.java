package problems.concatenationofarray;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 4};
    Solution solution = new Solution();
    int[] result = solution.getConcatenation(nums);
    System.out.println(Arrays.toString(result));
  }
}
