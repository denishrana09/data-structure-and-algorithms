import java.util.*;

public class MinStepsInInfiniteGrid{
    
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int maxDistance = 0;
            if (X.size() == 1 || X.size() == 0 || X.size() != Y.size()) {
                return maxDistance;
            }

            for (int i = 0; i <= X.size() - 2; i++) {
                int xDiff = Math.abs(X.get(i)- X.get(i+1));
                int yDiff = Math.abs(Y.get(i) - Y.get(i+1));
                maxDistance += Math.max(xDiff, yDiff);
            }
            return maxDistance;
    }

    public static void main(String args[]){
        ArrayList<Integer> X = new ArrayList<>();
        X.add(-7);
        X.add(-13);
        //X.add(1);

        ArrayList<Integer> Y = new ArrayList<>();
        Y.add(1);
        Y.add(5);
        //Y.add(2);

        System.out.println(coverPoints(X, Y));
    }    
}