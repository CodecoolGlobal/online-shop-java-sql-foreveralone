public class User {

    private String name;
    private String password;
    private int usserId;
    private boolean isAdmin;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getUsserId() {
        return usserId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsserId(int usserId) {
        this.usserId = usserId;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
