import java.security.SecureRandom;

public class Die {
    private int numOfSides;

    /**
     * This is the constructor.  The biggest differences with a regular
     * method is they do NOT have a return type and MUST have the
     * exact name of the class.
     * @param numOfSides
     */
    public Die(int numOfSides) {
        setNumOfSides(numOfSides);
    }

    /**
     * This is the default constructor, it assumes a value of 6.
     * Since this is the second constructor in the class, we say
     * the constructor is "overloaded"
     * @return
     */
    public Die()
    {
        setNumOfSides(6);
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    /**
     * This sets the instance variable
     * @param numOfSides
     */
    public void setNumOfSides(int numOfSides) {
        if (numOfSides >= 3 && numOfSides <= 20)
            this.numOfSides = numOfSides;
        else
            throw new IllegalArgumentException("Die must only have " +
                                                        "3-20 sides");
    }

    /**
     * This method will simulate rolling the die and returning the
     * value
     */
    public int rollDie()
    {
        SecureRandom rng = new SecureRandom();
        return rng.nextInt(numOfSides)+1;
    }
}
