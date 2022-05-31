public class Ship
{
    private int row;
    private int col;
    private int length;
    private int direction;
    
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public Ship(int length)
    {
        this.length = length;
        this.row = -1;
        this.col = -1;
        this.direction = UNSET;
    }
    
    // Checks if location is set
    public boolean isLocationSet()
    {
        if (row == -1 || col == -1)
            return false;
        else
            return true;
    }
    
    // Checks if the direction is set
    public boolean isDirectionSet()
    {
        if (direction == UNSET)
            return false;
        else
            return true;
    }
    
    //Set the location of the ship
    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    // Set the direction of the ship
    public void setDirection(int direction)
    {
        if (direction != UNSET && direction != HORIZONTAL && direction != VERTICAL)
            throw new IllegalArgumentException("Invalid direction. It must be -1, 0, or 1");
        this.direction = direction;
    }
    
    // Get the row value
    public int getRow()
    {
        return row;
    }
    
    // Get the column value
    public int getCol()
    {
        return col;
    }
    
    // Get the length of the ship
    public int getLength()
    {
        return length;
    }
    
    
    
    // Get the direction of the ship
    public int getDirection()
    {
        return direction;
    }
    
    // Convert the direction to a string
    private String directionToString()
    {
        if (direction == UNSET)
            return "UNSET";
        else if (direction == HORIZONTAL)
            return "HORIZONTAL";
        else
            return "VERTICAL";
    }
    
    // toString value for this Ship
    public String toString()
    {
        return "Ship: " + getRow() + ", " + getCol() + " with length " + getLength() + " and direction " + directionToString();
    }
}
