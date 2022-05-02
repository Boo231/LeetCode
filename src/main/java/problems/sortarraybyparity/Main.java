package problems.sortarraybyparity;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 4};
    int first = 0;
    int last = nums.length - 1;

    while(first < last){
      if(nums[first] % 2 > nums[last] % 2){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
      }
      if(nums[first] % 2 == 0) first++;
      if(nums[last] % 2 != 0) last--;
    }
    System.out.println(Arrays.toString(nums));
  }
  }
