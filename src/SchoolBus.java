public class SchoolBus extends Bus
{
    int maxChildren;

    public SchoolBus()
    {
    }

    /**
     * Find name and max children
     * @param name
     * @param maxChildrenTemp
     */
    public SchoolBus(String name, int maxChildrenTemp)
    {
        super(name);
        maxChildren = maxChildrenTemp;
    }

    /**
     * Get max children on bus
     * @return
     */
    public int getMaxChildren()
    {
        return maxChildren;
    }

    /**
     * Set max children on bus
     * @param maxChildrenTemp
     */
    public void setMaxChildren(int maxChildrenTemp)
    {
        maxChildren = maxChildrenTemp;
    }

    /** 
     * toString method for SchoolBus
     */
    public String toString()
    {
        String str = "Name: " + getName() + "\nMax Children: " + maxChildren;

        return str;
    }
}
