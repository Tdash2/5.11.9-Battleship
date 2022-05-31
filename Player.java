public class Player
{
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    public Ship[] ships;
    public Grid playerGrid = new Grid();
    public Grid oppGrid = new Grid();
    
    public Player() {
        ships = new Ship[SHIP_LENGTHS.length];
        for (int i = 0; i < SHIP_LENGTHS.length; i++) {
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        }
    }
    //prints out the players ships
    public void printMyShips() {
        playerGrid.printShips();
    }
    
    //Print out the opponent guess
    public void printOpponentGuesses() {
        oppGrid.printStatus();
    }
    
    //Prints out your guess
    public void printMyGuesses() {
        playerGrid.printStatus();
    }
    
    //Has you set your ship location
    public void chooseShipLocation(Ship s, int row, int col, int direction) {
        s.setLocation(row, col);
        s.setDirection(direction);
        playerGrid.addShip(s);
    }
    // Saves opponent guess
    public void recordOpponentGuess(int row, int col) {
        if (oppGrid.hasShip(row, col)) {
            oppGrid.markHit(row, col);
        }
        else oppGrid.markMiss(row, col);
    }
    
    public int numOfShipsLeft()
    {
        return playerGrid.hits;
    }
    
   
    
}
