public class greatest{

	public static void main(String[] args){
	
		int a=2,b=6,c=4;
		if(a>b && a>c){
			System.out.println("A is greater");
		}else {
			if(b>c){
				System.out.println("B is greater");
			}else{
				System.out.println("C is greater");
			}
		}
	}
}