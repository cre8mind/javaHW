
public class HomeWork7Extra {

	public static void main(String[] args) {
		int [][] matrixA = {
				{1,2,3,4},
				{2,3,4,5},
				{1,2,3,4},
				{2,3,4,5}
		};
		
		int [][] matrixB = {
				{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6},
				{4,5,6,7}
		};
		int [][] result = new int[matrixA.length][matrixB[0].length];
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				for(int k=0;k<matrixB.length;k++) {
					result[i][j] += matrixA[i][k]*matrixB[k][j];
				}
			}
		}
		
		for(int [] array:result) {
			for(int c:array) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
