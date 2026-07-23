class Solution {
    public int[] sortArray(int[] nums) {
        
        return quickSort(nums, 0 , nums.length -1);
    }
    public int[] quickSort(int[] arr , int st , int end){
        if(st < end){
            int pivot = partition(arr,st,end);
            quickSort(arr,st,pivot-1);
            quickSort(arr,pivot+1,end);
        }
        return arr;
    }
    public int partition(int arr[],int st,int end){

        int pivot = arr[end];
        int idx = st - 1;
        for(int j = st ; j < end ;j++){
            if(arr[j] <= pivot){
                idx++;
                swap(arr,j , idx);
            }
        }
        idx++;
        swap(arr,idx,end);
        return idx;
    }
    public void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}