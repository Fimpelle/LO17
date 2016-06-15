<%@ page import="java.util.List" %>
<%@ page import="java.util.regex.Pattern" %>
<%@ page import="java.util.regex.Matcher" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
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
<div class="jumbotron">
    <div id="search" class="container">
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
<div class="container">
    <div class="row">
        <%-- Display errors, if any --%>
        <% if (request.getAttribute("err") != null) { %>
        <div id="errors" class="alert alert-danger col-lg-4 col-lg-offset-1">
            <strong>Erreur</strong>
            <div class="collapsed">
                <%
                    String s = (String) request.getAttribute("err");
                    s = s.replaceAll("\n", "<br />\n");
                    out.println(s);
                %>
            </div>
        </div>
        <% } %>
        <%-- Display details, if any --%>
        <% if (request.getAttribute("det") != null) { %>
        <div class="alert alert-info col-lg-5 col-lg-offset-1">
            <a data-toggle="collapse" href="#details" aria-expanded="false" aria-controls="details"><strong>D&eacute;tails...</strong></a>
            <div class="collapse" id="details">
            <%
                String s = (String) request.getAttribute("det");
                s = s.replaceAll("\n", "<br />\n");
                out.println(s);
            %>
            </div>
        </div>
        <% } %>
    </div>
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
                        // add links if possible
                        Pattern p = Pattern.compile("(\\w+\\.htm)");
                        Matcher m = p.matcher(s);
                        if (m.find()) {
                            // replace first number with "number" and second number with the first
                            s = m.replaceFirst("<a href=\"" + request.getContextPath() + "/res/BULLETINS/$1\">"+ s +"</a>");
                        }
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

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
</body>
</html>