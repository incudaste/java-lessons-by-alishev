package lessons;

class L13_MultidimensionalArrays {

	public static void main(String[] args) {
		int[][] matrice = {
			{1, 2, 3, 4, 5},
			{41, -58, 666},
			{700, 118},
			{10, 11, 12, 13}
		};

		for (int i = 0; i < matrice.length; i++) {
			for (int i2 = 0; i2 < matrice[i].length; i2++) {
				System.out.print(matrice[i][i2] + " ");
			}
			System.out.println();
		}

		for (int[] element : matrice) {
			for (int index = 0; index < element.length; index++) {
				System.out.print(element[index] + " ");
			}
			System.out.println();
		}
	}
}