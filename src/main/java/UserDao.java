import java.util.List;

public interface UserDao<T> {

    List<T> getAllUser();
    void deleteUser();
    void addUser();

}
