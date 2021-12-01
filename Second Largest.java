import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0){
		    int []arr=new int[3];
		    for (int i=0;i<3 ;i++){
		        arr[i]=sc.nextInt();
		    } 
		    Arrays.sort(arr);
		    System.out.println(arr[arr.length-2]);
		}
	}
}
