import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String password = "testMysql";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT course_name, COUNT(subscription_date)" +
                    "/MAX(MONTH(subscription_date)) AS AVG_purchases FROM purchaselist GROUP BY course_name" +
                    " ORDER BY AVG_purchases DESC;");
            while (resultSet.next()) {
                String avgPurchases = resultSet.getString("Avg_purchases");
                String courseName = resultSet.getString("course_name");
                System.out.println(courseName + " | " +  avgPurchases);

//                resultSet.close();
//                statement.close();
//                connection.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
