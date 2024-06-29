<%-- 
    Document   : results
    Created on : 26 Feb 2024, 1:34:27 PM
    Author     : IC Wonderboom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results Page</title>
    </head>
    <body>
        <h1>Results</h1>
        <%
            String playerName = pageContext.getServletContext().getInitParameter("player_name");
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String playerChoice = (String)request.getAttribute("playerChoice");
            String computerChoice = (String)request.getAttribute("computerChoice");
            String outcome = (String)request.getAttribute("outcome");
        %>
        <p>
            <%=playerName%> choice: <%=playerChoice%><br>
            <%=computerName%> choice: <%=computerChoice%><br><br>
            <%=outcome%>
        </p>
        <p>
            Click <a href="start.jsp">here</a> to play again.
        </p>
    </body>
</html>
