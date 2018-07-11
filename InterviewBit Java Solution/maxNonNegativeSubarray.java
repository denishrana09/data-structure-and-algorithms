public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> maxRange = new ArrayList<Integer>();
        ArrayList<Integer> currentRange = new ArrayList<Integer>();
        long maxSum = Integer.MIN_VALUE;
        long currentSum = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) >= 0) {
                currentSum += A.get(i);
                currentRange.add(A.get(i));
                if((maxSum == currentSum && maxRange.size() < currentRange.size()) || 
                   maxSum < currentSum)  {
                    maxSum = currentSum;
                    maxRange = new ArrayList<>(currentRange);
                }                            
            }            
            else {
                currentSum = 0;
                currentRange.clear();
            }
        }
        return maxRange;
    }
}
