public class matrixaddition{

	public static void main(String[] args){
	
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] b={{9,8,7},{6,5,4},{3,2,1}};
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}

	

		for(int i[]:c){
			for(int ii:i){
			System.out.print(ii+" ");
			}System.out.println();
		}
	}
}