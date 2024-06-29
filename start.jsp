<%-- 
    Document   : start
    Created on : 26 Feb 2024, 12:49:01 PM
    Author     : IC Wonderboom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Game</h1>
        <%
            String player = pageContext.getServletContext().getInitParameter("player_name");
            String computer = pageContext.getServletContext().getInitParameter("computer_name");
        %>
        <p>
            Hello <%=player%> please make a toss
        </p>
        <form action="TossGameServlet.do" method="POST">
            <table>
                <tr>
                    <td>Select</td>
                    <td>
                        <select name="choice" required="">
                            <option value="Head">Head</option>
                            <option value="Tail">Tail</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="PLAY"/></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
