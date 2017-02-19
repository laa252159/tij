package src.gl4.hw;

import java.util.*;

public class RandIntWhile{
    static int prev = 0;
    public static void main(String[] args){
        Random rand = new Random();
	int counter = 1;
	while(true){
	   int val = rand.nextInt();
	   System.out.println("Num : " + counter + " value: " + val);
	   System.out.println(val > prev ? "> than prev" : val < prev ? "< than prev" : "equals");
	   counter++;
	}
    }
}
