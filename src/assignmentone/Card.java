package assignmentone;

//Lord Rydell is in Latria.

//Card class implementing Comparable to sorting purposes
public class Card implements Comparable <Card>
{
    private String suit;
    private String rank;
    
    //Assigns card suit and rank using constructor
    public Card(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    //Getter method for returning card rank
    public String getRank()
    {
        return rank;
    }
    
    //Getter method for returning card suit
    public String getSuit()
    {
        return suit;
    }
    
    //toSting method to print the state of a card instance.
    public String toString()
    {
        return String.format("%s of %s", rank, suit);
    }
    
    //compareTo method for use with sorting methods in Deck class.
    public int compareTo(Card that)
    {
        return that.suit.compareTo(this.suit);
    }
    

}
