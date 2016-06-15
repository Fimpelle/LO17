<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>LO17 - Recherche ADIT</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/todc-bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/style.css">
</head>
<body>
<nav class="navbar navbar-masthead navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">LO17 requestator</a>
        </div>
    </div>
</nav>
<div class="container-fluid">
    <div class="jumbotron">
        <div id="search" class="">
            <h1>Corpus ADIT</h1>
            <form class="form-inline" action="${pageContext.request.contextPath}/servlet/LanceRequete" method="get">
                <div class="input-group input-group-lg">
                    <input type="text" name="r" class="form-control"
                           placeholder="Rechercher dans le corpus..." size="50" autofocus="true" autocomplete="false"/>
                    <div class="input-group-btn">
                        <button class="btn btn-primary" type="submit"><i class="glyphicon glyphicon-search"></i>
                        </button>
                    </div>
                </div>
                <%--<input type="submit" class="btn btn-primary"/>--%>
            </form>
        </div>
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
</div>
</body>
</html>