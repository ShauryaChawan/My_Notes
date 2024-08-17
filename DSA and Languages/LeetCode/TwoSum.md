[🏠 Home](../../README.md)

<hr>

# Two Sum

Problem Link: [Link](https://leetcode.com/problems/two-sum/description/)

## My Code:
```
class Solution {
	// public int[] twoSum(int[] nums, int target) {
	// int result[] = new int[2];
	// for(int i = 0; i < nums.length; i++){
	// for(int j = i+1; j < nums.length; j++){
	// if(nums[i] + nums[j] == target){
	// result[0] = i;
	// result[1] = j;
	// return result;
	// }
	// }
	// }
	// return result;
	// }

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[0];
	}
}
```

## Most Optimised Code:
```
class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int dif = 1; dif < nums.length; dif++) {
			for (int right = dif; right < nums.length; right++) {
				int left = right - dif;
				if (nums[left] + nums[right] == target) {
					return new int[] { left, right };
				}
			}
		}

		return new int[0]; // empty if no solution found
	}
}

```
<hr>

[🏠 Home](../../README.md)
