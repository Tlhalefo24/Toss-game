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
public interface TossGameManagerInterface {
    public String generateToss();
    public String generateOutcome(String playerChoice, String computerChoice);
}
