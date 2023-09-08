/**
Naive solution of : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
**/
class Solution {
    public int removeDuplicates(int[] nums) {
        Set numsSet = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer number1, Integer number2) {
                return number1 - number2;
            }
        });
        for(int i =0 ; i < nums.length ; i++){
            numsSet.add(nums[i]);
        }
        int index = 0;
        Iterator<Integer> numsIterator = numsSet.iterator();
        while(numsIterator.hasNext()) {
            nums[index] = numsIterator.next();
            index++;
        }
        return numsSet.size();
    }
}
