import java.util.List;

public class UserController {

    public void getUserName(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> userName = userDao.getData();
        for (User user: userName) {
            System.out.println(user.getName());
        }
    }

    public void getUserId(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> userId = userDao.getData();
        for (User user: userId) {
            System.out.println(user.getUserId());
        }
    }

    public void getUserPassword(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> userPassword = userDao.getData();
        for (User user: userPassword) {
            System.out.println(user.getPassword());
        }
    }

    public void getIsAdmin(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> isAdmin = userDao.getData();
        for (User user: isAdmin) {
            System.out.println(user.isAdmin());
        }
    }


}
