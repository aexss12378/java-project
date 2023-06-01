import java.util.ArrayList;

public class Project2_Gemstone extends Project2_Treasure
{
    // The current value (gems) remains on the card.
    private int remainValue;
    
    public Project2_Gemstone(int type, int value)
    {
        super(type, value);
        this.remainValue = value;
    }

    public int getRemainValue()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 2-1 (Past): Get the variable $remainValue via this accessor method.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }
    
    public void resetValue()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 2-2 (Past): Reset the current value of this card to its original value.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }

    @Override
    public String name()
    {
        return "Gemstone";
    }

    @Override
    public void share(ArrayList<Project2_Agent> receivers)
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 2-3 (Past): Evenly share the gems that they find with all receivers, then the leftover remains.
         * Hint 1: If this gemstone card contains 17 gems and there are 3 receivers,
         *         each receiver will obtain 5 gems and the rest of 2 gems will remain on the card.
         * Hint 2: You can use addCollectedGems() method of Agent object to let the receivers get their gems.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }
    
    @Override
    public String toString()
    {
        return String.format("<G: %d/%d>", this.remainValue, this.getValue());
    }
}
