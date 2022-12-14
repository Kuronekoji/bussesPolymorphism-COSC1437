public class Bus
{
    String busName;
    String busYear;

    public Bus()
    {
    }

    /**
     * Constructor for bus name and year
     * @param tempName
     * @param tempYear
     */
    public Bus(String tempName, String tempYear)
    {
        busName = tempName;
        busYear = tempYear;
    }

    /**
     * Constructor for name of bus
     * @param tempName
     */
    public Bus(String tempName)
    {
        busName = tempName;
    }

    /**
     * Get year of bus creation
     * @return
     */
    public String getYear()
    {
        return busYear;
    }

    /**
     * Set year of bus creation
     * @param tempYear
     */
    public void setYear(String tempYear)
    {
        busYear = tempYear;

    }

    /**
     * Get name of generic bus
     * @return
     */
    public String getName()
    {
        return busName;
    }

    /**
     * Set name of generic bus
     * @param tempName
     */
    public void setName(String tempName)
    {
        busName = tempName;
    }

    /**
     * toString constuctor for generic bus
     */
    public String toString()
    {
        String str = "Bus Name: " + busName + "\nYear built: " + busYear;

        return str;
    }
}

