<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <title>LO17 - Recherche ADIT</title>
    </head>
    <body>
        <div id="search-container">
            <form action = "servlet/LanceRequete" method="get">
                <input type="text" size="30" name="r" autocomplete="false" autofocus="true">
                <input type="submit" value="Rechercher" >
            </form>
        </div>
        <div id="errors-container">
        
        </div>
        <div id="results-container">
        <%
            if(request.getAttribute("res")!=null){
                for (String s : (List<String>) request.getAttribute("res")) {
                        out.println(s);   
                }
            }
        %>
        </div>
    </body>
</html>