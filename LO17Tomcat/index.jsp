<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>LO17 - Recherche ADIT</title>
</head>
<body>
<div id="search">
    <form action="servlet/LanceRequete" method="get">
        <input type="text" size="30" name="r" autocomplete=false autofocus=true>
        <input type="submit" value="Rechercher">
    </form>
</div>
<%-- Display errors, if any --%>
<% if (request.getAttribute("err") != null) { %>
<div id="errors">
    <%
        String s = (String) request.getAttribute("err");
        s = s.replaceAll("\n", "<br />\n");
        out.println(s);
    %>
</div>
<% } %>
<%-- Display details, if any --%>
<% if (request.getAttribute("det") != null) { %>
<div id="details">
    <%
        for (String s : (List<String>) request.getAttribute("det")) {
            out.println(s);
        }
    %>
</div>
<% } %>
<%-- Display results, if any --%>
<% if (request.getAttribute("res") != null) { %>
    <div id="results">
    <%
        out.println("<ul>");
        for (String s : (List<String>) request.getAttribute("res")) {
            out.println("<li>" + s + "</li>");
        }
        out.println("</ul>");
    %>
    </div>
<% } %>
</body>
</html>