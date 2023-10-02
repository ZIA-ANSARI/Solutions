package BinarySearch;

public class Searcha2DMatrix {

    public static void main(String[] args) {
        Searcha2DMatrix searcha2dMatrix = new Searcha2DMatrix();
        System.out.println(searcha2dMatrix
        .searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34,
        60 } }, 11));

        System.out.println(searcha2dMatrix
                .searchMatrix(new int[][] { { 1 } }, 0));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix[0].length - 1;
        int row = 0;
        int n = matrix[0].length - 1;
        int leftrow = 0;
        int rightrow = matrix.length - 1;
        int midRow = rightrow / 2;
        int mid = (left + right) / 2;
        while (leftrow <= rightrow) {
            midRow = (leftrow + rightrow) / 2;
            if ((target >= matrix[midRow][0] && target <= matrix[midRow][n]) ) {
                System.out.println("row found: midRow" + midRow);
                while (left <= right) {
                    mid = (left + right) / 2;
                    // if (left == right) {
                    //     if (matrix[midRow][left] == target) {
                    //         return true;
                    //     } else {
                    //         return false;
                    //     }
                    // }
                    if (target == matrix[midRow][mid]) {
                        System.out.println(mid);
                        return true;
                    } else if (target > matrix[midRow][mid]) {
                        left = mid + 1;

                    } else if (target < matrix[midRow][mid]) {
                        right = mid - 1;

                    }

                }
                // check for target in specific row
                return false;
            } else if (target > matrix[midRow][n]) {
                leftrow = midRow + 1;
            } else if (target < matrix[midRow][0]) {
                rightrow = midRow - 1;
            }
        }
        return false;

    }

}
