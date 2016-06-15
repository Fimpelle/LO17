import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class LanceRequete extends HttpServlet {
    String username;
    String password;
    String url;
    String requete = "";
    String nom;
    int nbre;

    public String getLemmesFilePath(){
        return getServletContext().getRealPath("/WEB-INF/res/lemmes");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        List<String> requestResult = new ArrayList<>();

        // ---- configure START
        username = "lo17xxx";
        password = "dblo17";
        // The URL that will connect to TECFA's MySQL server
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
        // ---- configure END

        String details = "";

        // get input textbox content
        String requete = request.getParameter("r");

        details += "Requête en langage naturel : " + requete;

        // normalize it
        requete = normaliser(requete);

        details += "\nRequête sql générée : " + requete;

        StringBuilder errBuilder = new StringBuilder();
        List<List<String>> resultTable = new ArrayList<>();

        if (requete != null) {
            // INSTALL/load the Driver (Vendor specific Code)
            try {
                Class.forName("org.postgresql.Driver");
            } catch (java.lang.ClassNotFoundException e) {
                errBuilder.append("ClassNotFoundException: \n")
                        .append(e.getMessage());
            }
            try {
                Connection con;
                Statement stmt;
                // Establish Connection to the database at URL with usename and password
                con = DriverManager.getConnection(url, username, password);
                stmt = con.createStatement();
                // Send the query and bind to the result set
                ResultSet rs = stmt.executeQuery(requete);
                int total = 0;
                ResultSetMetaData rsmd = rs.getMetaData();
                nbre = rsmd.getColumnCount();
                List<String> resultRow = new ArrayList<>();

                // get Headers
                for (int i = 1; i <= nbre; i++) {
                    resultRow.add(rsmd.getColumnName(i));
                }
                resultTable.add(resultRow);
                resultRow = new ArrayList<>();

                while (rs.next()) {
                    total++;
                    for (int i = 1; i <= nbre; i++) {
                        nom = rsmd.getColumnName(i);
                        String s = rs.getString(nom);
                        Pattern p = Pattern.compile("\\.htm");
    			        Matcher m = p.matcher(s);
//    			        if (m.lookingAt())
//    			        {
//    			        	resultRow += "<a href=\"res/BULLETINS/" +s+ "\">"+s+ "</a>";
//    			        }
//    			        else{
//    			        	resultRow += s + " ";
//    			        }

                        resultRow.add(s);
                    }
                    resultTable.add(resultRow);
                    resultRow= new ArrayList<>();
                }

                // insert total at first position
                details = total + " résultats retournés.\n" + details;

                // Close resources
                stmt.close();
                con.close();
            }
            // print decent error messages
            catch (SQLException ex) {
                errBuilder.append("Une erreur est survenue (SQLException): ");
                while (ex != null) {
                    errBuilder.append("\nMessage:   ").append(ex.getMessage());
                    errBuilder.append("\nSQLState:  ").append(ex.getSQLState());
                    errBuilder.append("\nErrorCode: ").append(ex.getErrorCode());
                    ex = ex.getNextException();
                    errBuilder.append("\n");
                }
            }
        }

        String errString = errBuilder.toString();
        if (!errString.isEmpty())
            request.setAttribute("err", errString);

        if (!details.isEmpty())
            request.setAttribute("det", details);

        if (resultTable.size() > 1)
            request.setAttribute("res", resultTable);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    private String normaliser(String naturalLanguageQuery) {
        Normalisator normalisator = new Normalisator(getLemmesFilePath());
        String normalizedQuery = normalisator.normalize(naturalLanguageQuery);

        try {
            lo17SqlGrammarLexer lexer = new lo17SqlGrammarLexer(new ANTLRReaderStream(new StringReader(normalizedQuery)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            lo17SqlGrammarParser parser = new lo17SqlGrammarParser(tokens);

            // construct query
            String sqlQuery = parser.listerequetes();

            System.out.println(sqlQuery);

            return sqlQuery;
        } catch (Exception e) {

        }


        return null;
    }
}