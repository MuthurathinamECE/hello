package day17;
import java.util.Scanner;
public class repeats {
public static void main(String[] args) {
	int a,i,j;
	String b="";
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	int arr[]=new int[a];
	for(i=0;i<a;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<a;i++){
	b=b+arr[i];
	}
	   for( i=0;i<b.length();){
		   for( j=i+1;j<b.length();j++){
		if(b.charAt(i)==b.charAt(j)){
			System.out.println(b.charAt(i));
		b=b.replaceAll(String.valueOf(b.charAt(i)),"");
		}
		}
	   }
	   }}
			