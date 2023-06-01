import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Project2_Game
{
    // The randomizer which is used for shuffling the deck.
    private static final Random RANDOM = new Random(System.currentTimeMillis());
    // The game consists of 5 rounds of exploration.
    private static final int ROUND = 5;

    // All explorers participate in the game.
    private final ArrayList<Project2_Agent> explorers = new ArrayList<>();
    // The deck of cards to be used for the game.
    private final ArrayList<Project2_Card> deck = new ArrayList<>();
    // A tomb-like path for exploration.
    private final ArrayList<Project2_Card> path = new ArrayList<>();
    // There are 5 sections (5 rounds) of exploration in the tomb, and one particular artifact is deposited in each section.
    private final ArrayList<Project2_Artifact> artifacts = new ArrayList<>();
    // The Hazards that occurred during the game play.
    private final ArrayList<Project2_Hazard> occurredHazards = new ArrayList<>();

    public Project2_Game()
    {
        this.explorers.add(new Project2_Agent(0));
        this.explorers.add(new Project2_Agent(1));
        this.explorers.add(new Project2_Agent(2));
        this.explorers.add(new Project2_Agent(3));
        this.explorers.add(new Project2_Agent(4));
        this.explorers.add(new Project2_Agent(5));
        
        this.setUpCards();
    }
    
    public void runGame()
    {
        for (int round = 0; round < ROUND; round++)
        {
            /********************************* TODO (Checkpoint 2) *********************************
             * TODO 6-1: First, the game data should be initialized at the beginning of each round.
             * Hint 1: All explorers' status should be switched to true.
             * Hint 2: Clear all cards on the path and shuffle them back in the deck.
             * Hint 3: Reset the value of all gemstone cards.
             * Hint 4: You need to remove the artifact for the previous round from the deck even if it was unrevealed or unclaimed,
             *         then put the one for the current round into the deck.
             * Hint 5: For the hazard that occurred in the previous round (if any), should be removed from the deck.
             * Hint 6: Make sure you use shuffleDeck() method to shuffle the deck.
             * Hint 7: You need to print "ROUND X START!" which X represents for the round number (1~5).
             * Notice 1: In this section, you can use doNothing() method as you like to set timeout between any message you would print,
             *           but the format of your output must identically be the same as what the document shows.
             ************************************* End of TODO *************************************/

            /************ START OF YOUR CODE ************/


            /************* END OF YOUR CODE *************/

            while (this.isAnyoneStay())
            {
                /********************************* TODO (Checkpoint 2) *********************************
                 * TODO 6-2: During a round, all explorers explore the path in the ancient tomb and hunt for abundant treasures.
                 * Hint 1: To move forward in our exploration, you need to draw a card from the top of the deck and put it on the end of the path.
                 * Hint 2: When the drawn card is gemstone, use share() method of Gemstone object to share the value of it with all explorers who stay.
                 * Hint 3: When the drawn card is hazard, check whether it is the secondly same type of hazard that has been drawn.
                 *         If this is the case, all explorers attempt to flee and you should add this card into the occurred hazard.
                 * Hint 4: Print out the information of the path.
                 * Hint 5: Print out the information of all explorers in sequence. If the explorer stays in the tomb, print "Explorer X has Y gem(s).",
                 *         otherwise, print "Explorer X left." which X and Y represent for their number and the quantity of collected gems.
                 * Hint 6: After "----- STAY or LEAVE -----" is printed, all explorers who stay have to make their decision about staying or leaving.
                 *         For this purpose, you can use act() method of Agent object.
                 * Hint 7: Print "Everyone keeps exploring." if there is no explorer choose to leave,
                 *         else print "Explorer X wants to leave." for each explorer who chose to leave, which X represents for their number.
                 * Hint 8: On condition that this round had been broken off by a hazard, you should print "X hazard occurs, all explorers attempt to flee!"
                 *         rather than what Hint 7 does, which X represents the name of that occurred hazard.
                 * Hint 9: For those who chose to leave the tomb, should share the value of all the gemstone cards on the path while each one works independently.
                 *         If the path is [<G: 3/11>, <G: 1/9>, <A: Ankh 7>, <G: 5/13>], for instance, there are 3 explorers who chose to leave,
                 *         then the path will become [<G: 0/11>, <G: 1/9>, <A: Ankh 7>, <G: 2/13>] after they leave.
                 * Notice 1: Beware of the mechanism of sharing an artifact.
                 * Notice 2: The act() method of Agent requires an Environment object as its parameter, which indicates that agent can act upon the environment.
                 *           Note that the variable $environment was already declared for you, all you need to do is pass it into the act() method.
                 *           All explorers should act upon the same environment, so do not declare another Environment object or it may cause some error.
                 * Notice 3: In this section, you can use doNothing() method as you like to set timeout between any message you would print,
                 *           but the format of your output must identically be the same as what the document shows.
                 ************************************* End of TODO *************************************/

                /************ START OF YOUR CODE ************/


                /************* END OF YOUR CODE *************/

                System.out.println("----- STAY or LEAVE -----");

                Project2_Environment environment = this.createEnvironment();

                /************ START OF YOUR CODE ************/


                /************* END OF YOUR CODE *************/
            }

            /********************************* TODO (Checkpoint 2) *********************************
             * TODO 6-3 (Past): At the end of a round, all explorers finish their exploration and return to the camp with treasure.
             * Hint 1: First, print "ROUND X END!" which X represents for the round number (1~5).
             * Hint 2: To make all explorers store gems they've collected during this round into their tent,
             *         you can use storeGemsIntoTent() method of Agent object.
             * Notice 1: In this section, you can use doNothing() method as you like to set timeout between any message you would print,
             *           but the format of your output must identically be the same as what the document shows.
             ************************************* End of TODO *************************************/

            /************ START OF YOUR CODE ************/


            /************* END OF YOUR CODE *************/
        }

        System.out.println("GAME OVER!");
        System.out.println();
        System.out.println("----- Final result -----");

        for (Project2_Agent explorer : this.explorers)
            System.out.println(explorer + ": " + explorer.totalValue());

        System.out.println();
        System.out.println("Winner: " + this.getWinners());
    }

    private void setUpCards()
    {
        this.deck.add(new Project2_Hazard(0));
        this.deck.add(new Project2_Hazard(0));
        this.deck.add(new Project2_Hazard(0));
        this.deck.add(new Project2_Hazard(1));
        this.deck.add(new Project2_Hazard(1));
        this.deck.add(new Project2_Hazard(1));
        this.deck.add(new Project2_Hazard(2));
        this.deck.add(new Project2_Hazard(2));
        this.deck.add(new Project2_Hazard(2));
        this.deck.add(new Project2_Hazard(3));
        this.deck.add(new Project2_Hazard(3));
        this.deck.add(new Project2_Hazard(3));
        this.deck.add(new Project2_Hazard(4));
        this.deck.add(new Project2_Hazard(4));
        this.deck.add(new Project2_Hazard(4));
        
        this.deck.add(new Project2_Gemstone(0, 1));
        this.deck.add(new Project2_Gemstone(1, 2));
        this.deck.add(new Project2_Gemstone(2, 3));
        this.deck.add(new Project2_Gemstone(3, 4));
        this.deck.add(new Project2_Gemstone(4, 5));
        this.deck.add(new Project2_Gemstone(4, 5));
        this.deck.add(new Project2_Gemstone(5, 7));
        this.deck.add(new Project2_Gemstone(5, 7));
        this.deck.add(new Project2_Gemstone(6, 9));
        this.deck.add(new Project2_Gemstone(7, 11));
        this.deck.add(new Project2_Gemstone(7, 11));
        this.deck.add(new Project2_Gemstone(8, 13));
        this.deck.add(new Project2_Gemstone(9, 14));
        this.deck.add(new Project2_Gemstone(10, 15));
        this.deck.add(new Project2_Gemstone(11, 17));
        
        this.artifacts.add(new Project2_Artifact(0, 5));
        this.artifacts.add(new Project2_Artifact(1, 7));
        this.artifacts.add(new Project2_Artifact(2, 8));
        this.artifacts.add(new Project2_Artifact(3, 10));
        this.artifacts.add(new Project2_Artifact(4, 12));
    }

    private void shuffleDeck()
    {
        Collections.shuffle(this.deck, RANDOM);
    }

    private ArrayList<Project2_Agent> getStayExplorers()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 5-1 (Past): Get all explorers who stay in the tomb.
         * Hint 1: You can check each explorer's status.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }

    private boolean isAnyoneStay()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 5-2 (Past): Check if there is anyone who stays in the tomb.
         * Hint 1: Return true if at least one explorer is in exploring.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }

    private ArrayList<Project2_Agent> getWinners()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 5-3: The winners will be the explorers who hold the highest value of treasure.
         * Hint 1: You can use totalValue() method of Agent object to check the total value that they hold.
         * Notice 1: There might be multiple winners if more than one explorers equivalently hold the highest value.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/


        /************* END OF YOUR CODE *************/
    }

    private Project2_Environment createEnvironment()
    {
        Project2_Environment environment = new Project2_Environment();

        environment.setDefaultDecisionProbability(0.65);

        return environment;
    }

    private static void doNothing(long millisecond)
    {
        if (millisecond > 2000)
            throw new IllegalArgumentException("timeout value is over 2000");

        try
        {
            Thread.sleep(millisecond);
        }
        catch (InterruptedException e)
        {
            throw new IllegalStateException("unexpected interruption");
        }
    }
}
