1. A deck of cards

Instance variables:
- The suits necessary
- The card ranks necessary
- The point values necessary
- The size of the board
- The cards on the board
- The deck of cards

2. 
- Create a deck
- Shuffle deck
- Display 9 cards
- Remove a pair (or triplet) of cards that add to 11 or are J, Q, K
- Replace missing cards if possible
- Check if there are any possible moves
- If there are repeat from Remove a pair
- If there aren't check if it's because the player has won or lost
- If they win, tell them they win
- If they lose, tell them they lose

3. No, but will be when the unimplemented methods are implemented, and the card and deck classes are included

4.

a) In the Constructor and newGame() method

b) anotherPlayIsPossible(), isLegal()

c) returned list: [0,1,3,6,7]

d)
--------------
Card c = null;

for(int i = 0; i < cIndexes.size(); i++)
{
    c = board.cardAt(cIndexes.get(i);
    System.out.println(c);
}
--------------

e) anotherPlayIsPossible() because isLegal() has the selectedCards passed to it already, and anotherPlayIsPossible()
needs the selected cards to use the helper methods