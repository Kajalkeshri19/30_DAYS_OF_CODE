import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void First_ten_multiple(int number)
    {
        for(int index=1;index<=10;index++)
        {
            System.out.println(+number+ " x " +index+ " = " +(number*index));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        First_ten_multiple(n);
        bufferedReader.close();
    }
}

