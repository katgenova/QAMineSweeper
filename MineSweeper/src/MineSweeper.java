public class MineSweeper {

    int row = 8;
    int col = 8;
    int [][] testGrid = new int [row][col];

    public void createGrid(){

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < col ; j++) {
                if (j == 0) {
                    testGrid[i][j] = 0;
                }
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(testGrid[i][j] + " ");
            }
            System.out.println();
        }
    }


}
