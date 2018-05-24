import java.util.Random;

public class Grid {

    int row = 8;
    int col = 8;
    String [][] emptyGrid = new String [row][col];
    String [][] actualGrid = new String [row][col];
    int mineCounter = 0;

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

    public void createMineTest(){
        Random random = new Random();
        int positionI = random.nextInt(7);
        int positionJ = random.nextInt(7);
        if (!(emptyGrid[positionI][positionJ].equals("X"))) {
            emptyGrid[positionI][positionJ] = "[X]";
        } else {
            createMine();
        }
    }

    public boolean checkSpot(int positionI, int positionJ){
        String spot = emptyGrid[positionI][positionJ];
        if (spot.equals("[X]")){
            return true;
        }
            return false;
    }

    public void checkArea(){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if(checkSpot(i,j)){
                    mineCounter++;
                    try {
                        if (checkSpot(i - 1, j - 1)) {
                            mineCounter++;
                        } else if (checkSpot(i-1, j)){
                            mineCounter++;
                        }
                    } catch (IndexOutOfBoundsException ee){
                        continue;
                    }
                }

            }
        }
    }

    public void printActualGrid() {   //Testing purposes only
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(actualGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

//            if (actualGrid[positionI][positionJ].equals("X")){
//        mineCounter++;
//        checkSpot(positionI+1,positionJ+1);
//    }

}
