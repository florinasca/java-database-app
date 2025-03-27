import java.sql.*;

import static jdk.internal.net.http.common.Utils.close;

public class ExempluConectDB{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        try {
            // This will load the MYSQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            //Setup the connection with the
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?" + "user = sqluser&password = sqluserpw");

            //Statements allow to issue SQL queries to the database
            Statement statement = connect.createStatement();
            //Result set get the result of the SQL query
            ResultSet resultSet = statement.executeQuery("select*from feedback.comments");
        } catch (Exception e) {
            throw e;
        } finally {
            close();


            //private static Connection connect = null;
            //private static Statement statement = null;
            //private static ResultSet resultSet = null;
        }
     }
}
