package testng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Sample
{
    public static void main(String args[]) throws IOException
    {
   // Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n=br.readLine();
    while (n != null){
    	System.out.println(n);
    	br.close();
    }
        
    }
    
    public static String fizzBuzz(int number) { 
    	if (number % 15 == 0) {
    		return "FizzBuzz"; 
    		}
    	else if (number % 3 == 0) {
    		return "Fizz"; 
    		}
    	else if (number % 5 == 0) {
    		return "Buzz"; 
    		}
    	return Integer.toString(number);
    	} 

    
}