import java.util.Scanner;
public class boolandchar{

	public static void main(String[] args){
		int[] a={65,90,97,122};
		Scanner sc=new Scanner(System.in);	
		boolean bool=sc.nextBoolean();
		for(int i:a){
			if(bool){
				System.out.println((char)i);
				continue;
			}
			System.out.println(i);
		}
	}
}
