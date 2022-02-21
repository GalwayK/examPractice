package assignmentone;

public class PlayingCards 
{

    public static void main(String[] args) 
    {
        //Creates and displays a standard deck
        System.out.println("Playing cards.\n");
        Deck deck = new Deck();
        deck.create();
        deck.showCards();

        //Shuffles and displays the deck
        System.out.println("\nShuffling card order.\n");
        deck.shuffle();
        deck.showCards();
        
        //Sorts and displays the deck
        System.out.println("\nSorting card order.\n");
        deck.sort();
        deck.showCards();
        
        //Returns the deck to the original format 
        System.out.println("\nReturning to original order.\n");
        deck.format();
        deck.showCards();
    }
    
} // Have a nice day!
