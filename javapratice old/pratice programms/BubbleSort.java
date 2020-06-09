public class BubbleSort{
	public static void main(String[] args){
		int a[]={234,74,2346,89,31,2,987};

		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

	for(int i:a){
		System.out.println(i);
		}
	}
}