import java.sql.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class PgsqlInterrogator {
    // the db username
    private final static String USER = "lo17xxx";
    // password for USER
    private final static String PASSWORD = "dblo17";
    // The URL that will connect to TECFA's MySQL server (syntax: jdbc:TYPE:machine:port/DB_NAME)
    private final static String URL = "jdbc:postgresql://tuxa.sme.utc/dblo17";

    private static Connection con;
    private static Statement stmt;

    public static void init() {
        // INSTALL/load the Driver (Vendor specific Code)
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
    }

    public static void open() {
        // Establish Connection to the database at URL
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = con.createStatement();
        } catch (SQLException e) {
            displaySqlException(e);
        }
    }

    public static void close() {
        try {
            con.close();
            stmt.close();
        } catch (SQLException e) {
            displaySqlException(e);
        }
    }

    public static void execQuery(String query) throws SQLException {
        // test query :
        // query = "select distinct fichier,rubrique from titretext where mot='micro';";

        try {
            // Send the query and bind to the result set
            ResultSet rs = stmt.executeQuery(query);

            // display the resultSet
            displayResultSet(rs);
        }

        // print out decent error messages
        catch (SQLException ex) {
            displaySqlException(ex);
        }
    }

    private static void displaySqlException(SQLException ex){
        System.err.println("==> SQLException: ");
        while (ex != null) {
            System.out.println("Message:   " + ex.getMessage());
            System.out.println("SQLState:  " + ex.getSQLState());
            System.out.println("ErrorCode: " + ex.getErrorCode());
            ex = ex.getNextException();
            System.out.println("");
        }
    }

    private static void displayResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        while (rs.next()) {
            String s = "";
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                s += rs.getString(i) + "\t";
            }
            System.out.println(s.trim());
        }
    }
}
