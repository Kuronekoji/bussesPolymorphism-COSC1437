public class PartyBus extends Bus 
{
    String[] daysInService;
    


    public PartyBus()
    {
    }

    /**
     * Constructor that sets name, year, and bus service days
     * @param name
     * @param year
     * @param daysInServiceTemp
     */
    public PartyBus(String name, String year, String[] daysInServiceTemp)
    {
        super(name, year);
        daysInService = daysInServiceTemp;
    }

    /**
     * Constructor with name and service days
     * @param name
     * @param daysInServiceTemp
     */
    public PartyBus(String name, String[] daysInServiceTemp)
    {
        super(name);
        daysInService = daysInServiceTemp;
    }

    /**
     * Get days bus is in service
     * @return
     */
    public String[] getDaysInService()
    {
        return daysInService;
    }

    /**
     * set the service days of party bus
     * @param daysInServiceTemp
     */
    public void setDaysInService(String[] daysInServiceTemp)
    {
        daysInService = daysInServiceTemp;
    }

    /**
     * toString method for the party bus
     */
    public String toString()
    {
        String str = "Name: " + getName() + "\nDays in service: ";

        for (int i = 0; i < daysInService.length; i++)
        {
            str += daysInService[i];

            if(i != (daysInService.length - 1))
            {
                str += ", ";
            }

        }
        return str;
    }
}
