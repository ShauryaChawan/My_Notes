# Median of Two Sorted Arrays

```
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numArrSize = nums1.length + nums2.length;
		int[] numArr = new int[numArrSize];
		double median;

		// Copy elements from nums1 to numArr
		System.arraycopy(nums1, 0, numArr, 0, nums1.length);

		// Copy elements from nums2 to numArr
		System.arraycopy(nums2, 0, numArr, nums1.length, nums2.length);

		Arrays.sort(numArr);

		for (int i : numArr) {
			System.out.print(i + ", ");
		}

		if (numArrSize % 2 == 0) {
			double result = (((double) (numArr[numArrSize / 2] + numArr[(numArrSize / 2) + 1])) / 2);
			median = (result == 0.0) ? 0 : result - 1;
		} else {
			double result = ((double) (numArr[(numArrSize + 1) / 2]));
			median = (result == 0.0) ? 0 : result - 1;
		}
		return median;
    }
```