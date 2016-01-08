/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
*/

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            }
            else {
                for (k = m; k > i; k--) 
                    nums1[k] = nums1[k - 1];
                
                nums1[i] = nums2[j];
                     
                j++;
                i++;
                m = m + 1;
            }
        }
        while (i == m && j < n) {
            nums1[i] = nums2[j];
            j++;
            i++;
            m++;
        }
        
    }
}
