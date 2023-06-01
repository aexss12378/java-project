public class Project2_Hazard extends Project2_Card
{
    public Project2_Hazard(int type)
    {
        super(type);
    }

    @Override
    public String name()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 4-1: The name of this hazard card depends on its type. There are 5 kinds of hazards in total.
         * Hint 1: From type 0 to 4, the names are "Spikes", "Spiders", "Mummy", "Curse" and "Collapse" in order.
         * Hint 2: The name will be "Unknown" when the type is unexpectedly not between 0 and 4.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }
    
    @Override
    public String toString()
    {
        return String.format("<H: %s>", this.name());
    }
}
