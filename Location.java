public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    private boolean hasShip;
    private int status;
    private int lengthOfShip;
    private int directionOfShip;
    
    public Location()
    {
        // Set initial values
        status = 0;
        hasShip = false;
        lengthOfShip = -1;
        directionOfShip = -1;
    }

    // Checks if the location is a hit?
    public boolean checkHit()
    {
        if (status == HIT)
            return true;
        else
            return false;
    }

    // Checks if the location is a miss?
    public boolean checkMiss()
    {
        if (status == MISSED)
            return true;
        else
            return false;
    }

    // Checks if the location is unguessed?
    public boolean isUnguessed()
    {
        if (status == UNGUESSED)
            return true;
        else
            return false;
    }

    // Mark a location as a hit.
    public void markHit()
    {
        setStatus(HIT);
    }

    // Mark a location as a miss.
    public void markMiss()
    {
        setStatus(MISSED);
    }

    //Checks if a location has a ship
    public boolean hasShip()
    {
        return hasShip;
    }

    // Sets the value of whether this location has a ship.
    public void setShip(boolean val)
    {
        this.hasShip = val;
    }

    // Set the status of this Location.
    public void setStatus(int status)
    {
        this.status = status;
    }

    // Get the status of this Location.
    public int getStatus()
    {
        return status;
    }
    //Get the length of the ship
    public int getLengthOfShip()
    {
        return lengthOfShip; 
    }
    // Set the length of the ship
    public void setLengthOfShip(int val)
    {
        lengthOfShip = val;
    }
    //Get the direction of the ship
    public int getDirectionOfShip()
    {
        return directionOfShip; 
    }
    // Set the direction of the ship
    public void setDirectionOfShip(int val)
    {
        directionOfShip = val;
    }
}
