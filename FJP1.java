Name:Rasal Ashwini
Roll No:TE22121 


//1. To find a factorial of number 
package first;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,no;
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number");
		no = sc.nextInt();
		for( i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(" factorial of number is :" +fact);

	}

}
o/p:
enter the number

5
 factorial of number is :120



//2.To find sum & average of n number
package second;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("how many number want to enter");
		n=sc.nextInt();
		//System.out.println(" Enter those number:");
		for(i=0;i<n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of those number is"+sum);
		System.out.println("Average of those number is:"+sum/n);

	}

}


o/p:
how many number want to enter
5
sum of those number is10
Average of those number is:2


//2. Display 50 prime no 
package primeno;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3, count=1, i=2;
		while (count<50)
		{
			for (i=2; i<n; i++)
			{
				if(n%i==0)
				{
					break;
				}
			}
			if(i==n)
			{
				System.out.println(n);
				count++;
			}
			n++;
		}

	}

}
o/p:
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
101
103
107
109
113
127
131
137
139
149
151
157
163
167
173
179
181
191
193
197
199
211
223
227
229


