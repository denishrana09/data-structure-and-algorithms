import java.util.*;

public class MAXSPPROD{
        static int maxSpecialProduct(ArrayList<Integer> A) {
            int n = A.size();
            int[] left = new int[n];
            int[] right = new int[n];
            
            Deque<Integer> q = new ArrayDeque<>();
            q.addLast(0);
            
            for(int i = 1; i < n; i++){
                while(!q.isEmpty()){
                    if(A.get(q.getLast()) > A.get(i)) 
                        break;
                    q.removeLast();
                }
                left[i] = (q.isEmpty()) ? 0 : q.getLast();
                q.addLast(i);
            }
            for(int x=0;x<left.length;x++)
                System.out.print(left[x] + " ");
            System.out.println();
            q = new ArrayDeque<>();
            q.addLast(n - 1);
            for(int i = n - 2; i >= 0; i--){
                while(!q.isEmpty()){
                    if(A.get(q.getLast()) > A.get(i)) break;
                    q.removeLast();
                }
                right[i] = (q.isEmpty()) ? 0 : q.getLast();
                q.addLast(i);
            }
            for(int x=0;x<right.length;x++)
                System.out.print(right[x] + " ");
            System.out.println();
            long mx = -1;
            for(int i = 0; i < n; i++){
                mx = Long.max(mx, 1L * left[i] * right[i]);
                System.out.println(mx);
            }
            return (int)(mx % 1000000007);
        }  

    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(6);
        A.add(5);
        A.add(1);
        A.add(3);
        A.add(4);
        A.add(2);
        A.add(7);
        A.add(8);
        int x = maxSpecialProduct(A);
        System.out.println(x);
    }

    
}
