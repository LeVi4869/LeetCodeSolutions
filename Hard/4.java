class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int count = 0;
        int pointer1 = 0;
        int pointer2 = 0;
        double ans = 0;
        if((len1 + len2) % 2 == 1)  {
            int target = (len1 + len2) / 2 + 1;
            int res1 = 0;
            while(count < target)   {
                if(pointer1 == len1)    {
                    res1 = nums2[pointer2];
                    pointer2++;
                    count++;
                }
                else if(pointer2 == len2)   {
                    res1 = nums1[pointer1];
                    pointer1++;
                    count++;
                }
                else if(nums1[pointer1] > nums2[pointer2])   {
                    res1 = nums2[pointer2];
                    pointer2++;
                    count++;
                }
                else    {
                    res1 = nums1[pointer1];
                    pointer1++;
                    count++;
                }
            }
            ans = res1;
        }
        else  {
            int target = (len1 + len2) / 2 + 1;
            int res1 = 0;
            int res2 = 0;
            while(count < target)   {
                if(pointer1 == len1)    {
                    res1 = res2;
                    res2 = nums2[pointer2];
                    pointer2++;
                    count++;
                }
                else if(pointer2 == len2)   {
                    res1 = res2;
                    res2 = nums1[pointer1];
                    pointer1++;
                    count++;
                }
                else if(nums1[pointer1] > nums2[pointer2])   {
                    res1 = res2;
                    res2 = nums2[pointer2];
                    pointer2++;
                    count++;
                }
                else    {
                    res1 = res2;
                    res2 = nums1[pointer1];
                    pointer1++;
                    count++;
                }
            }
            ans = (double)(res1 + res2) / 2;
        }
        return ans;
    }
}