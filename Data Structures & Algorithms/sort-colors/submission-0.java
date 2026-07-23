class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] arr, int st, int end) {

        if (st >= end)
            return;

        int pivot = arr[end];

        int left = st;
        int i = st;
        int right = end;

        while (i <= right) {

            if (arr[i] < pivot) {
                swap(arr, i, left);
                i++;
                left++;
            }
            else if (arr[i] > pivot) {
                swap(arr, i, right);
                right--;
            }
            else {
                i++;
            }
        }

        quickSort(arr, st, left - 1);
        quickSort(arr, right + 1, end);
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}