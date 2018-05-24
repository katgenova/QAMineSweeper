public class mainMineSweeper {

    public static void main(String[] args) {

        Grid grid = new Grid();

        grid.createEmptyGrid();
        for (int i = 0; i <10 ; i++) {
            grid.createMineTest();

        }
        grid.printEmptyGrid();



    }
}
