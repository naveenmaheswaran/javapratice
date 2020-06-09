public class BinarySearch{

	public static int[] sort(int[] a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){

				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i:a){
			System.out.print(i+" ");
		}
		return a;
	}

	public int search(int[] a,int key)
	{
		a=BinarySearch.sort(a);
		int n=a.length;
		int start=0,end=n-1;
		
		for(int mid=(start+end)/2;start<=end;mid=(start+end)/2){
			if(a[mid]==key) return mid;
			if(a[mid]>key) end=mid-1;
			if(a[mid]<key) start=mid+1;
		}
		return -1;
	}

	public static void main(String[] args){
		BinarySearch bs=new BinarySearch();
		int a[]={23,56456,875,421,8,12,3};
		int index=bs.search(a,421);
		System.out.println("\nIndex="+index);
	}
}