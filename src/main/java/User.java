public class User {

    private String name;
    private String password;
    private int userId;
    private int isAdmin;

    public User(String name, String password, int userId, int isAdmin) {
        this.name = name;
        this.password = password;
        this.userId = userId;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }

    public int isAdmin() {
        return isAdmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAdmin(int admin) {
        isAdmin = admin;
    }

}
