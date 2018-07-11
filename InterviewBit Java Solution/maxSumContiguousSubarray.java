import java.util.*;
public class maxSumContiguousSubarray{
    static int maxSubArray(final List<Integer> a) {
        int newSum = a.get(0);
        int sum = a.get(0);
        System.out.println("newSum : "+ newSum + " , sum = "+ sum);
        for (int i = 1; i < a.size(); i++) {
            newSum = Math.max(newSum + a.get(i), a.get(i));
            sum = Math.max(sum, newSum);
            System.out.println("newSum : "+ newSum + " , sum = "+ sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(-2);
        a.add(1);
        a.add(-3);
        a.add(4);
        a.add(-1);
        a.add(2);
        a.add(1);
        a.add(-5);
        a.add(4);
        int result = maxSubArray(a);
        System.out.println(result);
    }
}
