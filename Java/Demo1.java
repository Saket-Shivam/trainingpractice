package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Demo1 {
	
	
	
public static int getLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-1];  
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1.
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		if(a>0) {
//			System.out.println("Number is positive");
//			
//		}
//		else if(a<0) {
//			System.out.println("Number is negative");
//		}
//		else
//			System.out.println("number is not positive nor negative");
		
		//2.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter value of a:");
//		double a=sc.nextDouble();
//		System.out.println("Enter value of b:");
//		double b=sc.nextDouble();
//		System.out.println("Enter value of c");
//		double c=sc.nextDouble();
//		double d=b*b-4.0*a*c;
//		if(d>0)
//		{
//			double r1=(-b+Math.pow(d, 0.5))/(2.0*a);
//			double r2=(-b-Math.pow(d, 0.5))/(2.0*a);
//			System.out.println("Roots are"+r1 + "and"+ r2);
//		}
//		else if(d==0.0)
//		{
//			double r1=-b/2.0*a;
//			System.out.println("Root is"+r1);
//			
//		}
//		else {
//			System.out.println("Roots are not real");
//		}
		
//	3.	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter year");;
//		int year=sc.nextInt();
//		boolean f=false;
//		if(year%400==0) {
//			f=true;
//		}
//		else if(year %100==0)
//		{
//			f=false;
//		}
//		else if(year %4==0)
//		{
//			f=true;
//		}
//		else {
//			f=false;
//		}
//		if(f==true)
//		{
//			System.out.println("year is leap year");
//		}
//		else {
//			System.out.println("year is not a leap year");
//		}
//		
		
		//4.
//		Scanner sc=new Scanner(System.in);
//		double a=sc.nextDouble();
//		double b=sc.nextDouble();
//		double c=sc.nextDouble();
//		double d=sc.nextDouble();
//		double e=sc.nextDouble();
//		double result=a+b+c+d+e;
//		double result1=(a+b+c+d+e)/5;
//		System.out.println(result);
//		System.out.println(result1);
		
		//5.
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			
//		System.out.println();
//		}
		//see constructor reference;
		
		//iterate in stream
		
		
		
		
		
//		Arrays.asList(10,2,23,-2,0,2,18).stream().sorted().forEach(System.out::println);
		
//	List<String> names=Arrays.asList("bhavana","sucheta","teju","saket","arun");
//		List <String> sortedUpper=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(sortedUpper);
//		
//		
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
//		
//		LocalTime time=LocalTime.now();
//		System.out.println(time);
//		
//		LocalDateTime curDT=LocalDateTime.now();
//		System.out.println(curDT);
//		
//		DateTimeFormatter managed=DateTimeFormatter.ofPattern("dd-MM-YY HH:mm:ss");
//		String formattedManaged=curDT.format(managed);
//		System.out.println(formattedManaged);
//		
//	1.
		//int r,sum=0,temp;    
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		  
//		  temp=n;    
//		  while(n>0){    
//		   r=n%10;  
//		   sum=(sum*10)+r;    
//		   n=n/10;    
//		  }    
//		  if(temp==sum)    
//		   System.out.println("palindrome number ");    
//		  else    
//		   System.out.println("not palindrome");    
//		
		
		//2.
//		Scanner sc=new Scanner(System.in);
//		String s1=sc.next();
//		 
//      
//        char[] try1 = s1.toCharArray();
// 
//        for (int i = try1.length - 1; i >= 0; i--)
//            System.out.print(try1[i]);
//		
		
		//5.
		
//		 int n1=0,n2=1,n3,i,count=20;    
//		 System.out.print(n1+" "+n2);   
//		    
//		 for(i=2;i<count;++i)  
//		 {    
//		  n3=n1+n2;    
//		  System.out.print(" "+n3);    
//		  n1=n2;    
//		  n2=n3;    
//		 }    
		  //6.
//		 int a[]={1,2,5,6,3,2};  
//		 int b[]={44,66,99,77,33,22,55};  
//		 System.out.println("Largest: "+getLargest(a,6));  
//		 System.out.println("Largest: "+getLargest(b,7));  
//		
		
		
		
		
		//1.yes we can use clone instead of new
		
		
		
		
		
		
		
		
		
		
		
	}

}
