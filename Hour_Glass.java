import java.util.Scanner;

public class Hour_Glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Inputting the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i=0;i<rows-2;i++){
            for (int j=0;j<columns-2;j++){
                sum = (matrix[i][j]+matrix[i][j+1]+matrix[i][j+2])+(matrix[i+1][j+1])+(matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2]);
                if (sum>maxi){
                    maxi = sum;
                }
            }
        }
        System.out.println(maxi);
    }

}
