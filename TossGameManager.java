/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author IC Wonderboom
 */
public class TossGameManager implements TossGameManagerInterface{

    @Override
    public String generateToss() {
        String[] options = {"Head", "Tail"};
        int index = (int)Math.floor(Math.random()*2);
        return options[index];
    }

    @Override
    public String generateOutcome(String playerChoice, String computerChoice) {
        String winner = "Player";
        if(playerChoice.equals(computerChoice)){
            winner = "Computer";
        }
        return winner;
    }
    
}
