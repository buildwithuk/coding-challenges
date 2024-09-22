// See https://aka.ms/new-console-template for more information

static int[][] RotateMatrix(int[][] matrix) {


    for (int i = 0; i < matrix.Length; i++) {

        var row = matrix[i];

        for (int j = 0; j < row.Length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

        }

    }

    return matrix;
}


int[][] initialMatrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16] ];


initialMatrix = RotateMatrix(initialMatrix);

for(int i = 0; i < initialMatrix.Length; i++) {

    for(int j = 0; j < initialMatrix.Length; j++) {

        Console.Write(initialMatrix[i][j] + " ");


    }
    Console.WriteLine();


}