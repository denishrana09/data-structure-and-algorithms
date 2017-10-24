import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Arrays;
class Main 
{
    static class MyScanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public MyScanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    
    void removeDuplicates(String s1,PrintWriter out){
        int n = s1.length();
        char S[] = s1.toCharArray();
        if(n<2){
            System.out.println(s1);
        }
        else{
            int j=0;
            for (int i=1; i<n; i++)
            {
                if (S[j] != S[i])
                {
                    j++; 
                    S[j] = S[i];
                }     
            }   
            j++;
            char ansStr[] = new char[j];
            ansStr = Arrays.copyOfRange(S, 0, j);

            String ans = new String(ansStr);

            out.println(ans);
        }
    }
    
    public static void main(String args[]) throws IOException
    {
        //Remove all consecutive duplicates from the string iterative solution
        MyScanner in=new MyScanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        Main main = new Main();
        int test = in.nextInt();
        while(test-->0){
            String str = in.next();
            main.removeDuplicates(str,out);
        }
        out.close();
    }
 
}