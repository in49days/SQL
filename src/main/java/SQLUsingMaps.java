import java.sql.*;

public class SQLUsingMaps {
    public static void main(String[] args) throws SQLException {
        String DBUrl="jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";
        Connection connection= DriverManager.getConnection(DBUrl,userName,password);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from hs_hr_employees");
        ResultSetMetaData metaData = resultSet.getMetaData();

        for (int i = 1; i <metaData.getColumnCount() ; i++) {
            System.out.println(metaData.getColumnName(i));
        }
        resultSet.close();
        statement.close();
        connection.close();

        //break till 8:30

    }
}
