public class LinearSearch{
	public static void main(String[] args){

		int a[]={5,345,45,7656,76,4234,8};
		int key=9;
		for(int i=0;i<a.length;i++){
			if(key==a[i]){
				System.out.println(i);
				return;
			}
		}
		System.out.println("no elements");
	}
}