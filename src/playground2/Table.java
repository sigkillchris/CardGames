/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground2;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Table {
    
    
    ArrayList<Player> playersAtTable = new ArrayList<Player>();    
    private Deck deck1 = new Deck();
    private Player player = new Player("player");
    private int numberOfPlayers;
    
    
    
    
    Table(){
        this.playersAtTable = playersAtTable;
        this.deck1 = deck1;
    }
    
    
    

    
   
    public void setPokerTable(int numberOfPlayers, int anteSize){
        this.setNumberOfPlayers(numberOfPlayers);
        this.setDeck(deck1);
        
    }

    /**
     * @return the deck1
     */
    public Deck getDeck() {
        return deck1;
    }

    /**
     * @param deck1 the deck1 to set
     */
    public void setDeck(Deck deck1) {
        this.deck1 = deck1;
    }

    /**
     * @return the numberOfPlayers
     */
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    /**
     * @param numberOfPlayers the numberOfPlayers to set
     */
    public void setNumberOfPlayers(int numberOfPlayers) {
        if(!(numberOfPlayers<2) ||!(numberOfPlayers >5)){
                    for ( int i = 1; i <=numberOfPlayers ; i++ ) {
                Player player = new Player("Player" + i);
                playersAtTable.add(player);
                i++;
            }
            
            this.numberOfPlayers = numberOfPlayers;
        }
        else{
            System.out.println("Please pick a number between 2 or 5!");
        }
    }

        
        
        

    
    
}
