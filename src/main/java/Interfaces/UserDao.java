package User;

import java.util.List;

public interface UserDao<T> {

    List<T> getAllUser();
    void deleteUser(User user);
    void addUser(User user);
    List<T> getData();

}


//typy generyczne w javie
