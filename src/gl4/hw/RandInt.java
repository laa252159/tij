package src.gl4.hw;

import java.util.*;

public class RandInt{
    static int prev = 0;
    public static void main(String[] args){
        Random rand = new Random();
	for(int i = 0; i < 25; i++){
	   int val = rand.nextInt();
	   System.out.println("Num : " + (i+1) + " value: " + val);
	   if (i > 0) 
	      System.out.println(val > prev ? "> than prev" : val < prev ? "< than prev" : "equals");
	}
    }
}
