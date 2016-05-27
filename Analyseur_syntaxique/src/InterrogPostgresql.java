import java.sql.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class InterrogPostgresql {
    public static void main(String args[]) throws SQLException {
        String username;
        String password;
        String url;
        String nom;
        int nbre;

        // ---- configure START
        username = "lo17xxx";
        password = "dblo17";
        // The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

        String requete;

        requete = "select distinct fichier,rubrique from titretext where mot='micro';";

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
            ResultSetMetaData metaData = rs.getMetaData();

            while (rs.next()) {
                String s = "";
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    s += rs.getString(i) + "\t";
                }
                System.out.println(s.trim());
            }
            // Close resources
            stmt.close();
            con.close();

        }
        // print out decent error messages
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
}
