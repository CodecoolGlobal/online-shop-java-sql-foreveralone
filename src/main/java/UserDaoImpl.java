import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserDaoImpl implements UserDao {

    SqlImplementation sqlImplementation;

    public UserDaoImpl(){
        sqlImplementation = new SqlImplementation();
    }


    @Override
    public List getData(){

        ResultSet resultSet = sqlImplementation.selectQuery("select * from user");
        List<User> userList = new ArrayList<>();
        try {
            while (resultSet.next()){
                int userId = resultSet.getInt("user_id");
                String userName = resultSet.getString("user_name");
                String userPassword = resultSet.getString("user_password");
                int isAdmin = resultSet.getInt("is_admin");

                User user = new User(userName, userPassword, userId, isAdmin);
                userList.add(user);
            }

        } catch(Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }
        return userList;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        return userList;
    }


    @Override
    public void deleteUser(User user) {

        try {
            sqlImplementation.doQuery("DELETE FROM user WHERE user_id = '"+ user.getUserId()+ "'");


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }

    }

    @Override
    public void addUser(User user) {

        try {
            sqlImplementation.doQuery("insert into user (user_name, user_password, user_id) VALUES ('"+ user.getName() + "','"+ user.getPassword() +"', '"+ user.getUserId() +"')");
        } catch (Exception e){
            System.out.println(e);
        } finally {
            sqlImplementation.closeQuery();
        }

    }


}
