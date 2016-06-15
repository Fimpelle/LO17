<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>LO17 - Recherche ADIT</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/style.css"/>
</head>
<body>
<div id="search">
    <form action="${pageContext.request.contextPath}/servlet/LanceRequete" method="get">
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
        String s = (String) request.getAttribute("det");
        s = s.replaceAll("\n", "<br />\n");
        out.println(s);
    %>
</div>
<% } %>
<%-- Display results, if any --%>
<% if (request.getAttribute("res") != null) { %>
    <div id="results">
        <table>
            <thead>
                <tr>
                    <%
                    for (String s : ((List<List<String>>) request.getAttribute("res")).get(0)) {
                        out.println("<th>" + s + "</th>");
                    }
                    ((List<List<String>>) request.getAttribute("res")).remove(0);
                    %>
                </tr>
            </thead>
            <tbody>
                <%
                for (List<String> l : ((List<List<String>>) request.getAttribute("res"))) {
                    out.println("<tr>");
                    for (String s : l) {
                        out.println("<td>" + s + "</td>");
                    }
                    out.println("</tr>");
                }
                %>
            </tbody>
        </table>
    </div>
<% } %>
</body>
</html>