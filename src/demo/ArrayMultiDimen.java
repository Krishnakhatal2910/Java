package demo;

public class ArrayMultiDimen {

	public static void main(String[] args) {


		int[][] no= {{1,2,3,4},{5,6,7}};
		
		//System.out.println(no.length);
		for(int i=0;i<no.length;i++) {//0,1
			for(int j=0;j<no[i].length;j++) {
				System.out.println(no[i][j]);
			}
			
		}
		

	}

}
