//Achiver@creatorvision

import java.util.*;
import java.lang.*;

class PickTwoCards {

	public double equalProbability(String cards){

	String s = cards;
	int []count= new int[26];
	int []num=new int[26];

	for (int i=0;i<s.length();i++ ) {
		if(s.charAt(i)=='A')
			count[0]++;
		else if(s.charAt(i)=='B')
			count[1]++;
		else if(s.charAt(i)=='C')
			count[2]++;
		else if(s.charAt(i)=='D')
			count[3]++;
		else if(s.charAt(i)=='E')
			count[4]++;
		else if(s.charAt(i)=='F')
			count[5]++;
		else if(s.charAt(i)=='G')
			count[6]++;
		else if(s.charAt(i)=='H')
			count[7]++;
		else if(s.charAt(i)=='I')
			count[8]++;
		else if(s.charAt(i)=='J')
			count[9]++;
		else if(s.charAt(i)=='K')
			count[10]++;
		else if(s.charAt(i)=='L')
			count[11]++;
		else if(s.charAt(i)=='M')
			count[12]++;
		else if(s.charAt(i)=='N')
			count[13]++;
		else if(s.charAt(i)=='O')
			count[14]++;
		else if(s.charAt(i)=='P')
			count[15]++;
		else if(s.charAt(i)=='Q')
			count[16]++;
		else if(s.charAt(i)=='R')
			count[17]++;
		else if(s.charAt(i)=='S')
			count[18]++;
		else if(s.charAt(i)=='T')
			count[19]++;
		else if(s.charAt(i)=='U')
			count[20]++;
		else if(s.charAt(i)=='V')
			count[21]++;
		else if(s.charAt(i)=='W')
			count[22]++;
		else if(s.charAt(i)=='X')
			count[23]++;
		else if(s.charAt(i)=='Y')
			count[24]++;
		else if(s.charAt(i)=='Z')
			count[25]++;
	}
		int tot =s.length();
		double den=tot*(tot-1);
		double sum=0.0;
		for (int j=0;j<count.length ;j++) {
			
			num[j]=(count[j]*(count[j]-1));
			sum=sum+num[j];

		}
		double fval=sum/den;
		return fval;
		/*for (int j=0;j<count.length;j++) {
			
			System.out.println(count[j]);
		}*/



	}
}

class main
{
	public static void main(String[] args) {

		PickTwoCards p=new PickTwoCards();
		double val=p.equalProbability("A");
		System.out.println(val);
		
	}
}