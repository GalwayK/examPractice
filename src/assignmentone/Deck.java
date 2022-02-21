package assignmentone;
//Wildcard import for use with sorting
import java.util.*;

public class Deck extends Cards
{
    //Method for creating a new deck
    public void create()
    {
        //Creates array for containing a full deck of Card objects
        cards = new Card[52];
        
        //Counter variable to populate array
        int cardCounter = 0;
        
        //String variable to define card rank per loop
        String strRank = "";
        
        //For loop to create 4 versions of each Card rank
        for (int s = 0; s < 13; s++)
        {   
            //Switch statement determining Card rank per loop
            switch (s)
            {
                    case 0:
                        strRank = "2";
                        break;
                    case 1: 
                        strRank = "3";
                        break;
                    case 2: 
                        strRank = "4";
                        break;
                    case 3: 
                        strRank = "5";
                        break;
                    case 4: 
                        strRank = "6";
                        break;
                    case 5: 
                        strRank = "7";
                        break;
                    case 6: 
                        strRank = "8";
                        break;
                    case 7: 
                        strRank = "9";
                        break;
                    case 8: 
                        strRank = "10";
                        break;
                    case 9: 
                        strRank = "Jack";
                        break;
                    case 10: 
                        strRank = "Queen";
                        break;
                    case 11: 
                        strRank = "King";
                        break;
                    case 12: 
                        strRank = "Ace";
                        break;
            }
            //Creates 4 Cards of each rank, one per suit
            cards[cardCounter++] = new Card("Hearts", strRank);
            cards[cardCounter++] = new Card("Diamonds", strRank);
            cards[cardCounter++] = new Card("Spades", strRank);
            cards[cardCounter++] = new Card("Clubs", strRank);
        }
    }
    
    //Method for shuffling card deck
    public void shuffle()
    {
        int lastIndex = cards.length - 1;
        int randomIndex;
        Card tempCard;
        
        //
        while (lastIndex > 0)
        {
            randomIndex = (int)(Math.random() * lastIndex);
            tempCard = cards[lastIndex];
            cards[lastIndex] = cards[randomIndex];
            cards[randomIndex] = tempCard;
            lastIndex--;
        }
    }
    
    //Method for custom sorting deck
    public void sort()
    {
        //Uses compareTo method to sort Card array by suit
        Arrays.sort(cards);    
        
        //Uses rankSort method to sort each suit of the deck by rank
        rankSort(0, 13);
        rankSort(13, 26);
        rankSort(26, 39);
        rankSort(39, 52); 
    }
    
    //Method for ranking a previously sorted section of a Card array by rank
    private void rankSort(int startIndex, int endIndex)
    {
        int searchIndex = startIndex;
        
        //Counter variable to determine String order to search
        int counter = 0;
        
        Card cardTemp;
        
        String strSearch = "2";
        
        //Loop to last until the entire list has been checked.
        //Loop goes through the list one index at a time until it finds the 
        //correct object for the current index and swaps it with the start. 
        while (startIndex != endIndex || searchIndex != endIndex)
        {
            //Switch statement current value to search for
            switch (counter)
            {
                    case 0:
                        strSearch = "2";
                        break;
                    case 1: 
                        strSearch = "3";
                        break;
                    case 2: 
                        strSearch = "4";
                        break;
                    case 3: 
                        strSearch = "5";
                        break;
                    case 4: 
                        strSearch = "6";
                        break;
                    case 5: 
                        strSearch = "7";
                        break;
                    case 6: 
                        strSearch = "8";
                        break;
                    case 7: 
                        strSearch = "9";
                        break;
                    case 8: 
                        strSearch = "10";
                        break;
                    case 9: 
                        strSearch = "Jack";
                        break;
                    case 10: 
                        strSearch = "Queen";
                        break;
                    case 11: 
                        strSearch = "King";
                        break;
                    case 12: 
                        strSearch = "Ace";
                        break;
            }
            //Loop condition to check if current list item has been sorted
            while (!(cards[startIndex].getRank().equals(strSearch)))
            {
                //Condition to compare searched rank and current rank
                if (cards[searchIndex].getRank().equals(strSearch))
                {
                    //Swap index of searched index and current index.
                    cardTemp = cards[startIndex];
                    cards[startIndex] = cards[searchIndex];
                    cards[searchIndex] = cardTemp;
                }
                //Increment the search index down the list further
                searchIndex++;
            }
            
            //Increment counter 
            counter++;
            //Increment start index placement
            startIndex++;
            //Resent search index to start index as default
            searchIndex = startIndex;
        }  
    }
    
    //Method for displaying the deck of cards in its current order
    public void showCards()
    {
        for (int i = 0; i < cards.length; i++)
        {
            System.out.println(cards[i].toString());
        }
    }
    
    //Method for returning the deck of cards to its original order
    public void format()
    {
        create();
    }
}
