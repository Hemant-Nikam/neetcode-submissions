class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for(int i = 0; i < numbers.length -1; i++ ){
            int com = target - numbers[i];
            int j = i+1;
            while(j < numbers.length ){
                if(numbers[j] == com)
                    return new int[]{i,j};
                j++;
            }

        }
        return null;
        
    }
}
