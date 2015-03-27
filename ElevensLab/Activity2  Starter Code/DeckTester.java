/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"Jack", "Queen", "Ten"};
        String[] suits = {"Spades", "Hearts"};
        int[] pointValues = {11, 12, 10};
        Deck a = new Deck(ranks, suits, pointValues);
        Deck b = new Deck(ranks, suits, pointValues);
        String[] fakeRanks = new String[0];
        String[] fakeSuits = new String[0];
        int[] fakeValues = new int[0];
        Deck c = new Deck(fakeRanks,fakeSuits,fakeValues);
        
        if(!(a.isEmpty()) && c.isEmpty())
        {
            System.out.println("isEmpty() works.");
        }
        else
        {
            System.out.println("isEmpty() does not work.");
        }
        
        if(b.size() == 6)
        {
            System.out.println("size() works.");
        }
        else
        {
            System.out.println("size() does not work.");
        }
        
        Card card = new Card("Ten", "Hearts", 10);
        if(card.matches(a.deal()))
        {
            System.out.println("deal() works.");
        }
        else
        {
            System.out.println("deal() does not work.");
        }
        
        System.out.println(a.toString());
    }
}
