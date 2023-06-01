import java.util.ArrayList;

public class Project2_Artifact extends Project2_Treasure
{
    // It determines whether this artifact is currently deposited in the tomb or not.
    private boolean inTomb;
    
    public Project2_Artifact(int type, int value)
    {
        super(type, value);
        this.inTomb = true;
    }

    public boolean isInTomb()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 3-1: Get the variable $inTomb via this accessor method.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }

    @Override
    public String name()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 3-2: The name of this artifact card depends on its type. There are 5 kinds of artifacts in total.
         * Hint 1: From type 0 to 4, the names are "Meteoric Dagger", "Ankh", "Falcon Pectoral",
         *         "Crook and Flail" and "Mask of Tutankhamun" in order.
         * Hint 2: The name will be "Unknown" when the type is unexpectedly not between 0 and 4.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }
    
    @Override
    public void share(ArrayList<Project2_Agent> receivers)
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 3-3: A valuable artifact can be taken away by the one and only one explorer who is leaving the tomb.
         * Hint 1: If there is more than 1 explorer who is leaving the tomb, then no one can get this artifact.
         * Hint 2: When an artifact is taken, it is no longer in the tomb and should be added into the receiver's possession.
         * Hint 3: Artifacts are accessible while they are now deposited in the tomb.
         * Notice 1: Provided that explorers stay in the tomb (haven't decided to leave),
         *           they can't pick up the artifact even if they are the only one who sees it.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }
    
    @Override
    public String toString()
    {
        if (this.inTomb)
            return String.format("<A: %s %d>", this.name(), this.getValue());
        else
            return "<A: --->";
    }
}
