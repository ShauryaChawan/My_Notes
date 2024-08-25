public class Solution
{
	public static boolean isPresent(List<List<Integer>> threeSumArr, List<Integer> temp) {
		for (List<Integer> x: threeSumArr) {
      if(x.contains(temp.get(0)) && x.contains(temp.get(1)) && x.contains(temp.get(2))){
				return true;
			}
		}
		return false;
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> threeSumArr = new ArrayList<>();

		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				for(int k = j+1; k<nums.length; k++) {
					if(nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);

						if(!isPresent(threeSumArr, temp)) {
							threeSumArr.add(temp);
						}
					}
				}
			}
		}

		return threeSumArr;
	}
}
