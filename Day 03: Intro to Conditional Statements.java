/*

Task :-
Given an integer, n, perform the following conditional actions:

1. If n is odd, print Weird
2. If n is even and in the inclusive range of 1 to 5, print Not Weird
3. If n is even and in the inclusive range of 6 to 20, print Weird
4. If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

*/

// Answer :-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();            
       String ans="";
       if(n%2==1){
           ans = "Weird";
       }
           else{
               if(n>2 && n<=5){
                   ans = "Not Weird";
               }
               if(n>5 && n<=20){
                   ans = "Weird";
               }
               else{
                   ans = "Not Weird";
               }
            }
        System.out.println(ans);
    }
}
