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

        List<String> requestResult = new ArrayList<>();

        // ---- configure START
        username = "lo17xxx";
        password = "dblo17";
        // The URL that will connect to TECFA's MySQL server
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
        // ---- configure END

        // get input textbox content
        String requete = request.getParameter("r");
        // normalize it
        requete = normaliser(requete);

        if (requete != null) {
            // INSTALL/load the Driver (Vendor specific Code)
            try {
                Class.forName("org.postgresql.Driver");
            } catch (java.lang.ClassNotFoundException e) {
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
            }
            try {
                Connection con;
                Statement stmt;
                // Establish Connection to the database at URL with usename and password
                con = DriverManager.getConnection(url, username, password);
                stmt = con.createStatement();
                // Send the query and bind to the result set
                ResultSet rs = stmt.executeQuery(requete);
                ResultSetMetaData rsmd = rs.getMetaData();
                nbre = rsmd.getColumnCount();
                while (rs.next()) {
                    for (int i = 1; i <= nbre; i++) {
                        nom = rsmd.getColumnName(i);
                        String s = rs.getString(nom);
                        Pattern p = Pattern.compile("\\.htm");
    			        Matcher m = p.matcher(s);
    			        if (m.lookingAt())
    			        {
    			        	//responseWriter.print("<a href=\"res/BULLETINS/" +s+ "\">"+s+ "</a>");
    			        }
    			        else{
    			        	//responseWriter.print(s);
    			        }
                    }
                    //responseWriter.print("<p>");
                }
                // Close resources
                stmt.close();
                con.close();
            }
            // print decent error messages
            catch (SQLException ex) {
                System.err.println("==> SQLException: ");
                while (ex != null) {
                    System.out.println("Message:   " + ex.getMessage());
                    System.out.println("SQLState:  " + ex.getSQLState());
                    System.out.println("ErrorCode: " + ex.getErrorCode());
                    ex = ex.getNextException();
                    System.out.println("");
                }
            }
        }

        // dummy response to test response forwarding through dispatcher
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        request.setAttribute("res", list);
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