import java.util.Scanner;

public class calculator{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("1-ADD\n2-SUB\n3-MUL\n4-DIV");
		System.out.print("Enter the choice...");
		int choice=sc.nextInt();
		System.out.println("Enter A and B ...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(choice){

			case 1:add(a,b);
				break;
			case 2:sub(a,b);
				break;
			case 3:mul(a,b);
				break;
			case 4:div(a,b);
				break;

			default:System.out.println("Error! Invalid choice !!!");
				break;
		}
	}

	public static void add(int a,int b){
		System.out.println("A+B="+(a+b));
	}
	
	public static void sub(int a,int b){
		System.out.println("A-B="+(a-b));
	}
	
	public static void mul(int a,int b){
		System.out.println("A x B ="+(a*b));
	}
	
	public static void div(int a,int b){
		System.out.println("A/B="+(a/b));
	}
}