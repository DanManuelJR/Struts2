package sample.example.objects;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class List extends ActionSupport {

    ArrayList<List> persons = new ArrayList<List>();

    public ArrayList<List> getPersons() {  
        return persons;  
    }  
    public void setList(ArrayList<List> persons) {  
        this.persons = persons;  
    }  

    public String execute() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/sampledb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "password");

            if (connection != null) {
                String sql = "SELECT * FROM persons";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    List person=new List();
                    person.setLastName(rs.getString(2));   
                    person.setFirstName(rs.getString(3)); 
                    person.setAge(rs.getInt(4)); 
                    persons.add(person);  
                }
            } 
         } catch (Exception e) {

         } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

         return SUCCESS;
    }
    private void setAge(int int1) {
    }
    private void setLastName(String string) {
    }
    private void setFirstName(String string) {
    }
    
}