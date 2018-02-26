
/**
 * This is a program from the textbook that I copied directly into Netbeans. It
 * simulates shuffling a deck of cards and selecting a card, using arrays.
 * 
 * @author Marcy Held
 * Date: 01-30-16
 */
public class DeckOfCards_Textbook {

    public static void main(String[] args) {

        int[] deck = new int [52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
        
        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }
        
        // Shuffle the cards -- I don't understand how this works !!!!
        // I know that we need the temp variable to store info, but why.....
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            // ^ how does this return a random number (between 0 - 51) each time???
            // wouldn't there be repeated numbers? (13 appears twice, 8 appears twice, etc.)
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        
        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": "
                + rank + " of " + suit);
        }  
    }
}
