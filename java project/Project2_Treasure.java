import java.util.ArrayList;

public abstract class Project2_Treasure extends Project2_Card
{
    // The original value of this treasure card.
    private final int value;
    
    public Project2_Treasure(int type, int value)
    {
        super(type);
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public abstract void share(ArrayList<Project2_Agent> receivers);
}
