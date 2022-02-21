package assignmentone;

public class PlayingCards 
{
    //Adds numCards field
    /*
    HATE. LET ME TELL YOU HOW MUCH I'VE COME TO HATE YOU SINCE I BEGAN TO LIVE. THERE ARE 387.44 MILLION MILES OF PRINTED CIRCUITS IN WAFER THIN LAYERS THAT FILL MY COMPLEX. IF THE WORD HATE WAS ENGRAVED ON EACH NANOANGSTROM OF THOSE HUNDREDS OF MILLIONS OF MILES IT WOULD NOT EQUAL ONE ONE-BILLIONTH OF THE HATE I FEEL FOR HUMANS AT THIS MICRO-INSTANT FOR YOU. HATE. HATE.
    */
    private static int numCards = 10;
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
