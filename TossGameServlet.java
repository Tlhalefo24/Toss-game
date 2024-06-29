/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.TossGameManager;

/**
 *
 * @author IC Wonderboom
 */
public class TossGameServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String playerChoice = request.getParameter("choice");
        String player = getServletContext().getInitParameter("player_name");
        String computer = getServletContext().getInitParameter("computer_name");
        TossGameManager tgm = new TossGameManager();
        String computerChoice = tgm.generateToss();
        
        String winner = tgm.generateOutcome(playerChoice, computerChoice);
        String outcome = computer+" wins the toss";
        if(winner.equalsIgnoreCase("Player")){
            outcome = player+" wins the toss";
        }
        request.setAttribute("playerChoice", playerChoice);
        request.setAttribute("computerChoice", computerChoice);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher disp = request.getRequestDispatcher("results.jsp");
        disp.forward(request, response);
    }

}
