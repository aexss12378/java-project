public abstract class Project2_Card
{
    // Type of this card.
    private final int type;

    public Project2_Card(int type)
    {
        this.type = type;
    }

    public abstract String name();

    public int getType()
    {
        return this.type;
    }
}
