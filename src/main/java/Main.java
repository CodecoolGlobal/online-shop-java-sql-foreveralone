
public class Main {


    public static void main(String[] args) {

        UserDaoImpl userDao = new UserDaoImpl();
        UserController userController = new UserController();
        userController.getUserName();

        User user = new User("haha","jaja", 3435453, 0);
        userDao.addUser(user);
    }
}

