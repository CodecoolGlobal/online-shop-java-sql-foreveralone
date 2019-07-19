import java.util.ArrayList;
import java.util.List;

public class CategoryController {

    public List getCategoryName(){
        CustomerDaoImpl userDao = new UserDaoImpl();
        List<User> users = userDao.getData();
        List<String> userName = new ArrayList<>();
        for (User user: users) {
            userName.add(user.getName());
        }
        System.out.println(userName);
        return userName;
    }

    public List getUserId(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> users = userDao.getData();
        List<Integer> userId = new ArrayList<>();
        for (User user: users) {
            userId.add(user.getUserId());
        }
        System.out.println(userId);
        return userId;
    }

    public List getUserPassword(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> users = userDao.getData();
        List<String> userPassword = new ArrayList<>();
        for (User user: users) {
            userPassword.add(user.getPassword());
        }
        System.out.println(userPassword);
        return userPassword;
    }

    public List getIsAdmin(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> users = userDao.getData();
        List<Integer> isAdmin = new ArrayList<>();
        for (User user: users) {
            isAdmin.add(user.isAdmin());
        }
        System.out.println(isAdmin);
        return isAdmin;
    }
}
