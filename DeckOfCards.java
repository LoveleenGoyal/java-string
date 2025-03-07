import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();        
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        
        printPlayerCards(distributedCards);
        
        sc.close();
    }
    
    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    
    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute");
        }
        
        String[][] playerCards = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }
    
    // Method to print player cards
    public static void printPlayerCards(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
}

/* 
Enter number of players: 4
Enter number of cards per player: 3
Player 1's cards:
  8 of Clubs
  8 of Spades
  10 of Diamonds

Player 2's cards:
  6 of Spades
  3 of Clubs
  5 of Clubs

Player 3's cards:
  5 of Hearts
  10 of Hearts
  Jack of Spades

Player 4's cards:
  3 of Spades
  Jack of Diamonds
  7 of Diamonds

 */
