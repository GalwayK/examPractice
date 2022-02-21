package assignmentone;

public abstract class Cards 
{
    //Creates array containing a deck of Cards
    public Card[] cards;
    
    //Abstract methods to be defined in child classes
    public abstract void create();
    public abstract void sort();
    public abstract void shuffle();
    public abstract void format();
    public abstract void showCards();
    
    
    //Method returning cards array
    public Card[] getCards()
    {
        return cards;
    }
}
