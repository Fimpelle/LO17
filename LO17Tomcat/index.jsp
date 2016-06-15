<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>LO17 - Recherche ADIT</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap-min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/todc-bootstrap-min.css">
</head>
<body>
<nav class="navbar navbar-masthead navbar-inverse navbar-fixed-top">
			  <div class="container">
				<div class="navbar-header">
				  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				  <a class="navbar-brand" href="#">LO17 requestator</a>
				</div>
			  </div>
		</nav>
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
        <table class="table table-bordered table-striped table-condensed">
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