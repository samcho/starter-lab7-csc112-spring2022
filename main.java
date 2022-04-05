public class main {

    public static LinkedList initialize_deck() {

        LinkedList deck = new LinkedList();

        for (Card.suites s : Card.suites.values()) {
            for(Card.ranks r : Card.ranks.values()) {
                if (r != Card.ranks.NULL && s != Card.suites.NULL) {
                    Card newCard = new Card(s, r);
                    //newCard.print_card();
                    deck.add_at_tail(newCard);
                }
            }
        }

        return deck;
    }

    private static void play_blind_mans_bluff(LinkedList player1, LinkedList computer, LinkedList deck) {
        System.out.println("\nStarting Blind mans Bluff \n");
        // play the game FIXME
    }

    public static void main(String[] args) {

        LinkedList deck = initialize_deck();
        deck.print();
        deck.sanity_check();

        deck.shuffle(512);
        deck.print();
        deck.sanity_check();

        LinkedList player1 = new LinkedList();
        LinkedList computer = new LinkedList();

        int num_cards_dealt = 5;
        for (int i = 0; i < num_cards_dealt; i++) {
            player1.add_at_tail(deck.remove_from_head());
            computer.add_at_tail(deck.remove_from_head());
        }

        play_blind_mans_bluff(player1, computer, deck);
    }
}
