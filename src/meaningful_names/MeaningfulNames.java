package meaningful_names;

public class MeaningfulNames {
    public static void main(String[] args) {
        int d; //does not reveal its purpose

        int elapsedTimeInDays; //reveals its purpose

        //What the purpose of this code?
        /*public List<int[]> getThem(){
            List<int[]> list1 = new ArrayList<int[]>();
            for(int[] x: theList)
                if (x[0] == 4)
                    list1.add(x)
            return list1;
        }*/

        /**
         public List<int[]> getFlaggedCells(){
            List<int[]> flaggedCells = new ArrayList<int[]>();
            for(int[] cell : gameBoard)
                if(cell[STATUS_VALUE] == FLAGGED)
                    flaggedCells.add(cell);
            return flaggedCells;
         */

        /*
           public List<Cell> getFlaggedCells(){
                List<Cell> flaggedCells = new ArrayList<Cell>();
                for(Cell cell : gameBoard)
                    if(cell.isFlagged)
                        flaggedCells.add(cell);
                return flaggedCells;
         */


    }
}
