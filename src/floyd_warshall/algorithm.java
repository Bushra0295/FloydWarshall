package floyd_warshall;

public class algorithm {

    static int infinity = 9999;

    void floydWarshall(int graph[][]) {
        //define 2d array to set the matrix in it
        int mat[][] = new int[10][10];
        int i, j, k;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                mat[i][j] = graph[i][j];
            }
        }

        for (k = 0; k < 10; k++) {

            for (i = 0; i < 10; i++) {

                for (j = 0; j < 10; j++) {
                    // If the vertex k is on the shortest path from i to j then change the value of mat[i][j]
                    if (mat[i][k] + mat[k][j] < mat[i][j]) {
                        mat[i][j] = mat[i][k] + mat[k][j];
                    }
                }
            }
        }

        // Print the shortest path matrix
        printMatrix(mat);
    }

    void printMatrix(int mat[][]) {

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (mat[i][j] == infinity) {
                    System.out.print("∞ ");
                } else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}

