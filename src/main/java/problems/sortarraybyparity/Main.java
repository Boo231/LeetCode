package problems.sortarraybyparity;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 4};
    Solution solution = new Solution();
    int[] result = solution.sortArrayByParity(nums);
    System.out.println(Arrays.toString(result));
  }
  }
