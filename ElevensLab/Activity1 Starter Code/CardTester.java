/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card a = new Card("Jack", "Spades", 11);
        Card c = new Card("Queen", "Hearts", 12);
        Card b = new Card("Ten", "Spades", 10);
        Card d = new Card("Queen", "Hearts", 12);
        
        if(a.pointValue() == 11)
        {
            System.out.println("pointValue() works.");
        }
        else
        {
            System.out.println("pointValue() does not work.");
        }
        
        if(c.rank().equals(d.rank()))
        {
            System.out.println("rank() works.");
        }
        else
        {
            System.out.println("rank() does not work.");
        }
        
        if(a.suit().equals(b.suit()))
        {
            System.out.println("suit() works.");
        }
        else
        {
            System.out.println("suit() does not work.");
        }
        
        if(c.matches(d))
        {
            System.out.println("matches() works.");
        }
        else
        {
            System.out.println("matches() does not work.");
        }
        
        System.out.println(a.toString());
    }
}
