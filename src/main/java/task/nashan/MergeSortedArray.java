package task.nashan;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                i++;
            }else{
                shift(nums1, i);
                nums1[i] = nums2[j];
                j++;
                m++;
            }
        }

        while (i < m){
            i++;
        }

        while (j < n){
            nums1[i] = nums2[j];
            j++;
            i++;
        }

    }
    private void shift(int[] nums1, int i){
        int k = nums1.length - 2;
        while (k != i){
            nums1[k+1] = nums1[k];
            k--;
        }
        nums1[k+1] = nums1[k];
    }

}
