package testVagrant;

import java.util.ArrayList;

public class mains {
	public static void main(String args[]) 
	{ 	
        ArrayList<Integer> al = new ArrayList<Integer>();
	    System.out.print("Teams with "+ iplTeams.m +" consecutive losses are : ");

// here we pass the array array object ,all the array elements and the points of the Teams 
// to the constructor of iplteams class;
// The constructor is overloaded here

		iplTeams GT = new iplTeams(iplTeams.arr,1,1,0,0,1,20);
		if(GT.isTwoConsLoses(iplTeams.arr)){
		 System.out.print("GT ");
		al.add(GT.points);}
		
		
		iplTeams LSG = new iplTeams(iplTeams.arr,1,0,0,1,1,18);
		if(LSG.isTwoConsLoses(iplTeams.arr))
		{System.out.print("LSG ");
		al.add(LSG.points);}
		
		
		iplTeams RR = new iplTeams(iplTeams.arr,1,0,1,0,0,16);
		if(RR.isTwoConsLoses(iplTeams.arr))
		{System.out.print("RR ");
		al.add(RR.points);}
		
		iplTeams DC = new iplTeams(iplTeams.arr,1,1,0,1,0,14);
		if(DC.isTwoConsLoses(iplTeams.arr)){
		 System.out.print("DC ");
		al.add(DC.points);}
		
		
		iplTeams RCB = new iplTeams(iplTeams.arr,0,1,1,0,0,14);
		if(RCB.isTwoConsLoses(iplTeams.arr))
		{System.out.print("RCB ");
		al.add(RCB.points);}
		
		iplTeams KKR = new iplTeams(iplTeams.arr,0,1,1,0,1,12);
		if(KKR.isTwoConsLoses(iplTeams.arr))
		{System.out.print("KKR ");
		al.add(KKR.points);}
		
		iplTeams PBKS = new iplTeams(iplTeams.arr,0,1,0,1,0,12);
		if(PBKS.isTwoConsLoses(iplTeams.arr))
		{System.out.print("PBKS ");
		al.add(PBKS.points);}
		
		iplTeams SRH = new iplTeams(iplTeams.arr,1,0,0,0,0,12);
		if(SRH.isTwoConsLoses(iplTeams.arr))
		{System.out.print("SRH ");
		al.add(SRH.points);}
		
		iplTeams CSK = new iplTeams(iplTeams.arr,0,0,1,0,1,8);
		if(CSK.isTwoConsLoses(iplTeams.arr)){
		System.out.print("CSK ");
		al.add(CSK.points);}
		
		iplTeams MI = new iplTeams(iplTeams.arr,0,1,0,1,1,6);
		if(MI.isTwoConsLoses(iplTeams.arr)){
		System.out.println("MI ");
		al.add(MI.points);}
		
		float avgPoints=0;
		int k=al.size();
		for(int i=0;i<k;i++)
		{
		 avgPoints+=al.get(i);
		}
		avgPoints = avgPoints/k;
		
		System.out.println( "\n\n points of teams who are having " + iplTeams.m +" consecutive loses" + al);
				System.out.println("\n Average points is : " + avgPoints);


	} 

}
