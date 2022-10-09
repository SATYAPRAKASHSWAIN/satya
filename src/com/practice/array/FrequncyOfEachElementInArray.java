package com.practice.array;

public class FrequncyOfEachElementInArray {
	public static void main(String[] args) {
		int  []a=new int[] {1,2,3,4,5,3,4,42,3,2,3,2};
		int []fe=new int[a.length];
		
		int visit=-1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					fe[j]=visit;
				}
			}
			 if(fe[i] != visit)  
	                fe[i] = count;  
		}
		System.out.println("===================================");
		for(int k=0;k<fe.length;k++) {
			if(fe[k]!=visit) {
				System.out.println(a[k]+  " <==>   "+fe[k]);
			}
		}
	}

}
