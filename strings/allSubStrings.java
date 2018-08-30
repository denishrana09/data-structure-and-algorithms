/**
* using Sliding Window method
* input : 
*   abc
* output:
*   a
*   ab
*   abc
*   b
*   bc
*   c
*/

import java.util.*;
public class allSubStrings{
    public static void main(String[] args){
        int l=0,r=0;
        String input = "abc";
        while(l<=input.length()){
            for(int i=l;r<input.length();r++){
                System.out.println(input.substring(i,r+1));
            }
            l++;
            r = l;
        }
    }
}