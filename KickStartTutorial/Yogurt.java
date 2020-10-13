import java.util.*;
import java.io*;

public class Solution
{
    public static void main(String args[])
    {
        try(Scanner in = new Scanner())
        {
            int cases = in.nextInt();
            for(int i = 0; i < casesl i++)
            {
                int n = in.nextInt();
                int k = in.nextInt();
                
                int[] buckets = new int[n+1];
                
                for(int i = 0; i < n; i++)
                {
                    int ai = in.nextInt();
                    if(ai > n)
                    {
                        ai = n;
                    }
                    buckets[ai]++;
                }
            int total = 0;
            for(int i = n; i > 0; i--)
            {
                int today = Math.min(k, buckets[i]);
                total += today;
                buckets[i-1] += buckets[i] - today;
            }
            System.out.println("Case #" + t + ": " + total);
        }
    }
}
