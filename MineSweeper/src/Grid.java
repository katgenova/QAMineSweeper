public class Grid {

    int row = 8;
    int col = 8;
    String [][] emptyGrid = new String [row][col];

    public void createEmptyGrid(){

        for (int i = 0; i < row ; i++) {


            for (int j = 0; j < col ; j++) {

                    emptyGrid[i][j] = "[ ]";

            }
        }
    }

    public void printEmptyGrid() {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(emptyGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
    String [][] actualGrid = new String [row][col];
    public void createActualGrid(){

        int row =8;
        int col =8;

        for (int i = 0; i < ; i++) {

            for (int j = 0; j < row; j++){



            }

        }

    }

}
