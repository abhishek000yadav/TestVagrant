package testVagrant;

import java.io.*;
import java.util.*;

class iplTeams{
	
	    static final int matchesPlayed = 5;
	    int n=matchesPlayed;
	    static int arr[] = new int[matchesPlayed];
	    int points;
	    int a;int b;int c;int d;int e;
	    static int m=2;
	    
	    
	    
	    iplTeams(int arr[],int a,int b,int c,int d,int e,int f)
	    
	    //The input to the constructor to be given only in the form of 0(loss) and 1(win)
	    //Here arr is the array object 
	    //Integer a to Integer e are values 0(loss) or 1(win)
	    //integer f is to store the points of the teams.
	    
	    {
	        
	         arr[0]=a;
	         arr[1]=b;
	         arr[2]=c;
	         arr[3]=d;
	         arr[4]=e;
	         points = f;
	    }
	    
	    
	   //LOGIC FOR ONLY 2 LOSSES
	   /* {
	        for(int i=0;i<n-1;i++)
	        {
	            
	            if(arr[i]==0 && arr[i]==arr[i+1])
	            return true;
	        }
	        return false;
	    }*/
	    
	    
	    //LOGIC FOR M CONSECUTIVE LOSES
	    //for m we can take any value,here i have initialized a value ,
	    //we can use it dynamically just by taking value of m from user using scanner class .
	    
	    
	    
	    //the below function will return a boolean value true/false.
	    // m is defined in the class.
	    // in this funtion we will check for 'm' consecutive losses.
	    
	    
	    boolean isTwoConsLoses(int arr[])
	    {
	    int c1 = 0;
	 
	    for (int i = 0; i < n; i++) 
	    {
	        if (arr[i] == 0)
	        {
	            c1++;
	        }
	        else {
	            c1 = 0;
	        }
	        if (c1 == m )
	            return true;
	    }
	    return false;
	  }	
 
}
