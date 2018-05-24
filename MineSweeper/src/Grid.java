import java.util.Random;

public class Grid {

    int row = 8;
    int col = 8;
    String [][] emptyGrid = new String [row][col];
    String [][] actualGrid = new String [row][col];


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
    public void createActualGrid(){

        for (int i = 0; i < col ; i++) {

            for (int j = 0; j < row; j++){

            }
        }
    }

    public void createMine(){
        Random random = new Random();
        int positionI = random.nextInt(8);
        int positionJ = random.nextInt(8);
        if (!(actualGrid[positionI][positionJ].equals("X"))) {
            actualGrid[positionI][positionJ] = "X";
        } else {
            createMine();
        }
    }

}
