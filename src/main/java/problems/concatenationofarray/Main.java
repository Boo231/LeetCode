package problems.concatenationofarray;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 4};
    int[] result = new int[nums.length + nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[nums.length + i] = result[i] = nums[i];
    }
    System.out.println(Arrays.toString(result));
  }
}
