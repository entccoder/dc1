Name: Rasal Ashwini
Roll No: TE22121


//1. Write a java program in java to implement a calculator with simple arithmetic
Operation such as add, sub, mul, div, fact etc. using switch case & other simple java statement 

package randomNumber;
import java.util.Scanner;
package randomNumber;

public class Method {
	int result;
	int  Add(int a, int b) {
		result=a+b;
		return result;
	}
	int Sub(int a, int b) {
		result=a-b;
		return result;
	}
	int Multi(int a, int b) {
		result=a*b;
		return result;
	}
	int Div(int a, int b) {
		result=a/b;
		return result;
	}
	

}


public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,choise;
		Scanner sc=new Scanner(System.in);
		Method methodobj = new Method();
		
		System.out.println("Menu...");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Multi");
		System.out.println("4.Div");
		System.out.println("5.return");
		System.out.println("Enter your choise");
		choise=sc.nextInt();
		System.out.println("Enter the two number");
		a=sc.nextInt();
		b=sc.nextInt();
		switch(choise) {
		case 1:{
			System.out.println(methodobj.Add(a,b));
			break;
			
		}
		case 2:{
			System.out.println(methodobj.Sub(a,b));
			break;
		}
		case 3:{
			System.out.println(methodobj.Multi(a,b));
			break;
		}
		case 4:{
			System.out.println(methodobj.Div(a,b));
			break;
		}
		case 5:{
			return;
			
		}
		default:{
			System.out.println(" Enter valid number");
			break;
		}
		}

	}

}



o/p:


Menu...
1.Add
2.Sub
3.Multi
4.Div
5.return
Enter your choise
1
Enter the two number
12 23
35

Menu...
1.Add
2.Sub
3.Multi
4.Div
5.return
Enter your choise
1
Enter the two number
12 23
35


Menu...
1.Add
2.Sub
3.Multi
4.Div
5.return
Enter your choise
3
Enter the two number
32 34
1088
